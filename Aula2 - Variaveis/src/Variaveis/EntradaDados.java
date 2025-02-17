package Variaveis;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		/*Objeto*/
		Scanner sc = new Scanner(System.in);
		
		
		//1º MODO
		String nome;
		System.out.println("Digite seu nome: ");
		nome = sc.next(); //Armazenar valores do tipo texto
	

		//2º MODO
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
	
		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble();
		
				
		System.out.println("Seu nome é " + nome);
		System.out.println("O seu peso é de " + peso);
		System.out.println("A sua idade é  de "+ idade+" anos");
		sc.close();
		
		

		
	}

}
