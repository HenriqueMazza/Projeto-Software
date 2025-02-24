package estruturasCondicionais;

import java.util.Scanner;

public class Compras {

	public static void main(String[] args) {

		//Máquina de cartão
		
		//Capturar o valor de uma compra e método de pagamento
		
		// 1 - Dinheiro/Pix - 10% de desconto
		// 2 - Débito - 5% de desconto
		// 3 - crédito
		// - Métodos de parcelamento
		//	- A vista - Valor total do produto
		//  - 2x - 5% de juros
		// 	- 3x - 10% de juros
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da sua compra: ");
		double valorCompra = sc.nextDouble();
		
		System.out.println("Método Pagamento");
		System.out.println("1 - Dinheiro/Pix");
		System.out.println("2 - Débito");
		System.out.println("3 - Crédito");
		
	    int metodoPagamento = sc.nextInt();
	    
	    switch(metodoPagamento) {
	    case 1: 
	    	double valorfinal = valorCompra * 0.9;
	    	System.out.println("O valor a ser pago será de: "+ valorfinal);
	    	break;
	    	
	    case 2: 
	    	valorfinal = valorCompra * 0.95;
	    	System.out.println("O valor a ser pago será de: "+ valorfinal);
	    	break;
	    	
	    case 3: 
	    	
			System.out.println("1 - Pagar a vista");
			System.out.println("2 - Parcelar 2x ( 5% de juros )");
			System.out.println("3 - Parcelar 3x ( 10% de juros )");
			
			int metodoCredito = sc.nextInt();
			
			if(metodoCredito == 1) {
				System.out.println("O valor a ser pago será de: "+ valorCompra);
			} else if(metodoCredito == 2) {
				double valorParcelado2 = valorCompra * 1.05;
				double parcelas2 = (valorParcelado2/2);
				System.out.printf("O valor a ser pago será de: %.2f", valorParcelado2 , " Em parcelas de: %.2f", parcelas2);
			} else if(metodoCredito == 3) {
				 double valorParcelado3 = valorCompra * 1.1;
				 double parcelas3 = (valorParcelado3/3);
				System.out.printf("O valor a ser pago será de: %.2f", valorParcelado3 , " Em parcelas de: %.2f", parcelas3);
			} else {
				System.out.println("Opção Inválida!");
			}
			
	    	break;
	    
	    default: 
	    	System.out.println("Opção inválida!");
	    	break;
	    }
		
		sc.close();
		
		
		

	}

}
