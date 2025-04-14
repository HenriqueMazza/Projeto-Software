package array;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		//ArrayList trabalha com objetos: String, Integer, Double
		
		List <String> listaNomes = new ArrayList<>();
		
		//Adicionando itens
		listaNomes.add("Henrique");
		listaNomes.add("Pedro");
		listaNomes.add("Catarina");
		listaNomes.add("Luccas Neto");
		listaNomes.add("Enaldinho");
		listaNomes.add("Rodrigo Caio");
		
		//Adicionando em uma posição desejada
		listaNomes.add(2, "William");
		
		//Remover um item da lista pelo valor
		listaNomes.remove("Catarina");
		
		//Remover um item da lista pela posição
		listaNomes.remove(4);
		
		//Verifica o tamanho da lista
		System.out.println("Número de itens na lista: " + listaNomes.size() + "\n");
		
		//Percorrer a array
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
		
	}

}
