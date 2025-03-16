package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Jogo de adivinhação\nVocê terá uma tentativa para acertar o número que estou pensando (0 a 10)");
		int numero = (int) (11 * Math.random());
		
		int usuario;

			System.out.print("Digite o número que estou pensando entre 0 e 103"
					+ ": ");
			usuario = sc.nextInt();
			
			if (usuario == numero) {
				
				System.out.println("Parabens! Voce acertou");
			} else {
				System.out.println("Você errou! Jogue novamente");
				System.out.print("O número correto era: ");
				System.out.print(numero);
			}
		
		
		sc.close();
		

	}

}
