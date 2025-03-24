package main;

import java.util.Scanner;

import entidades.Livro;

public class Main {

	public static void main(String[] args) {
		
		Livro harry = new Livro();
		Livro pequenoprincipe = new Livro();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados do livro\n");
		System.out.println("Titulo: ");
		harry.titulo = sc.nextLine();
		System.out.println("Autor: ");
		harry.autor = sc.nextLine();
		System.out.println("Quantidade em estoque: ");
		harry.quantidade = sc.nextInt();
		System.out.println("Valor: ");
		harry.valor = sc.nextDouble();
		
		System.out.println("Informe a quantidade de livros emprestados: ");
		int quantidade = sc.nextInt();
		harry.empresta(quantidade);
		
		System.out.println("Informe a quantidade de livros devolvidos: ");
		quantidade = sc.nextInt();
		harry.devolve(quantidade);
		System.out.println("Dados atualziados: " + harry);

		
		//////////
		
		System.out.println("Informe os dados do livro\n");
		System.out.println("Titulo: ");
		pequenoprincipe.titulo = sc.next();
		System.out.println("Autor: ");
		pequenoprincipe.autor = sc.next();
		System.out.println("Quantidade: ");
		pequenoprincipe.quantidade = sc.nextInt();
		System.out.println("Valor: ");
		pequenoprincipe.valor = sc.nextDouble();
		
		System.out.println("Informe a quantidade de livros emprestados: ");
		quantidade = sc.nextInt();
		pequenoprincipe.empresta(quantidade);
		
		System.out.println("Informe a quantidade de livros devolvidos: ");
		quantidade = sc.nextInt();
		pequenoprincipe.devolve(quantidade);
		System.out.println("Dados atualziados: " + pequenoprincipe);
		
		sc.close();
		

	}

}
