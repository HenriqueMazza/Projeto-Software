package main;

import entidades.Carro;
import entidades.Moto;

public class Main {

	public static void main(String[] args) {
		
		Carro civic = new Carro("Honda", "Civic", 2024, 250, true);
		Moto xMax = new Moto("Yamaha", "xMax", 2022, 125, 321);
		
		System.out.println(civic.toString());
		System.out.println("O valor do aluguel foi de, RS" + civic.calcularAluguel(5) + "\n");
		
		System.out.println("\n"+ xMax.toString());
		System.out.println("O valor do aluguel foi de, RS" + xMax.calcularAluguel(5) + "\n");
		
	}

}
