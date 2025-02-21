package Desafios;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o capital inicial em reais: ");
		double C = sc.nextDouble();
		
		System.out.println("Digite a taxa de juros em % ao mês: ");
		double i = sc.nextDouble()/100;
		
		System.out.println("Digite a quantidade de meses: ");
		double t = sc.nextDouble();
		
	
		double J = (C * i * t);
		double MT = J + C;
		
		System.out.println("A taxa simples vai ser de: " + J + " reais");
		System.out.println("O montante total vai ser de: " + MT + " reais");

	}

}
