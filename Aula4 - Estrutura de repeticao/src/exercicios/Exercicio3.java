package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int opcao;
		System.out.println("Calculo de taxa de emprestimo");
		System.out.println("Quantas parcelas deseja? (em meses)");
		System.out.println(" 6 - meses +5% do valor total");
		System.out.println(" 12 - meses +10% do valor total");
		System.out.println(" 24 - meses +20% do valor total");
		opcao = sc.nextInt();
		
		switch(opcao) {
		
		case 6:
			System.out.println("Digite o valor do emprestimo: ");
			double valor = sc.nextDouble();
			double valortotal = (valor + (valor*0.05));
			System.out.println("O valor total a ser pago é: " + valortotal);
			break;
			
		case 12:
			System.out.println("Digite o valor do emprestimo: ");
			double valor12 = sc.nextDouble();
			double valortotal12 = (valor12 + (valor12*0.10));
			System.out.println("O valor total a ser pago é: " + valortotal12);
			break;
		case 24:
			System.out.println("Digite o valor do emprestimo: ");
			double valor24 = sc.nextDouble();
			double valortotal24 = (valor24 + (valor24*0.20));
			System.out.println("O valor total a ser pago é: " + valortotal24);
			break;
		default:
        System.out.println("Opção inválida");
        sc.close();
		}
		
	}

}
