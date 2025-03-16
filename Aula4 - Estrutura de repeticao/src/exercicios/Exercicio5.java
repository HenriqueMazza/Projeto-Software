package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Sistema de descontos\n");
		
		double compra;
		int itens;
		double valor;

		
		System.out.println("Digite o valor da compra");
		compra = sc.nextDouble();
		System.out.println("Digite a quantidade de itens comprados");
		itens = sc.nextInt();
		
		if(compra > 300 || itens > 3) {
			valor = compra - (compra * 0.05);
			System.out.println("O valor total a ser pago após os descontos será de: " + valor);
		} else if (compra > 500 || itens > 5) {
			valor = compra - (compra * 0.05);
			System.out.println("O valor total a ser pago após os descontos será de: " + valor);	
		} else if (compra > 1000) {
			valor = compra - (compra * 0.05);
			System.out.println("O valor total a ser pago após os descontos será de: " + valor);
		} else {
			System.out.println("O valor total será de: "+ compra);
		}
			
			sc.close();
	}

}
