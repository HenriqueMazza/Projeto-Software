package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("Conversor de moedas");
		System.out.println("Digite a opção que você deseja\n");
		System.out.println("1 - Dólar");
		System.out.println("2 - Euro");
		System.out.println("3 - Libra\n");
		opcao = sc.nextInt();
		
		switch(opcao) {
		
		case 1:
			System.out.println("Digite o valor em reais: ");
			double reaisdolar = sc.nextDouble();
			double dolar = (reaisdolar * 0.20);
			System.out.println("O valor em dólar é: " + dolar);
			break;
			
		case 2:
			System.out.println("Digite o valor em reais: ");
			double reaiseuro = sc.nextDouble();
			double euro = (reaiseuro * 0.18);
			System.out.println("O valor em dólar é: " + euro);
			break;
			
		case 3:
			System.out.println("Digite o valor em reais: ");
			double reaislibra = sc.nextDouble();
			double libra = (reaislibra * 0.15);
			System.out.println("O valor em dólar é: " + libra);
			break;
        default:
            System.out.println("Opção inválida");
            sc.close();
            return;
		}
		
	}

}
