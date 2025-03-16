package exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de traingulo valido");
		double A;
		double B;
		double C;
		
		System.out.println("Digite o valor do lado A do triangulo: ");
		A = sc.nextDouble();
		System.out.println("Digite o valor do lado B do triangulo: ");
		B = sc.nextDouble();
		System.out.println("Digite o valor do lado C do triangulo: ");
		C = sc.nextDouble();
		
        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            System.out.println("Os valores fornecidos formam um triângulo válido!");
        } else {
            System.out.println("Os valores fornecidos formam um triângulo inválido!");
            return;
        }

        System.out.println("Classificao dos triangulos");

        if (A == B && B == C) {
            System.out.println("riângulo equilátero (todos os lados iguais).");
        } else if (A == B || A == C || B == C) {
            System.out.println("riângulo isósceles (dois lados iguais).");
        } else {
            System.out.println("É um triângulo escaleno (todos os lados diferentes).");
        }
        
        
        
        sc.close();
        
		}

	}


