package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora de seguro de automoveis\n");
		
		int idade;
		String sexo;
		int anos;

		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("Digite seu sexo (H ou M): ");
		sexo = sc.next();
		System.out.println("Digite quantos anos de experiencia como motorista voce tem: ");
		anos = sc.nextInt();
		
		if(idade < 25 && sexo.equals("H") && anos < 2) {
			System.out.println("O valor do seguro será: R$2000");
		} else if (idade < 25 && sexo.equals("M") && anos < 2) {
			System.out.println("O valor do seguro será: R$1800");
		} else if (idade > 25 || anos > 2) {
			System.out.println("O valor do seguro será: R$1200");
		} else {
			System.out.println("erro! informacacoes erradas");
		}
			
			sc.close();
		

	}

}
