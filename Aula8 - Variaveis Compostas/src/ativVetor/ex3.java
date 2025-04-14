package ativVetor;

import java.util.ArrayList;
import java.util.List;

public class ex3 {

	public static void main(String[] args) {
		
		List <Integer> numeros = new ArrayList();
		
		numeros.add(5);
		numeros.add(10);
		numeros.add(14);
		numeros.add(21);
		numeros.add(6);
		
		List <Integer> numerosPares = new ArrayList();
		
		for ( int par : numeros) {
			
			if (par % 2 == 0) {
				numerosPares.add(par);
				
				
			}
			
		}
		
		 System.out.println("Lista de números pares: " + numerosPares);
		

	}

}
