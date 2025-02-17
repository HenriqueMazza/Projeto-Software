package Desafios;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		double F = (celsius * 9/5 + 32);
		
		double K = (celsius + 273.15);
		
		System.out.println("A temperatura em fahrenheit é: " + F);
		System.out.println("A temperatura em Kelvin é: " + K);
		
		
		
		
	}

}
