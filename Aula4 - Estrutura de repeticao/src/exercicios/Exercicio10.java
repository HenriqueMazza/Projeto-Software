package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fatorial de um numero");
		int num;
		int fatorial = 1;;
		int i;
		
		System.out.println("Digite um numero inteiro: ");
		num = sc.nextInt();
		
		for(i=1; i<=num; i++) {
			
			fatorial = (fatorial * i);
			

		}
		
		System.out.println("o fatorial de "+ num + " é: "+ fatorial);
		
		sc.close();
	}

}
