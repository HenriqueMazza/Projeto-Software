package main;

import java.util.Scanner;
import entidades.Roupa;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

        while (true) {
            Roupa roupa = new Roupa();
            
            System.out.println("Informe os dados da roupa\n");
            System.out.println("Marca: ");
            roupa.marca = sc.nextLine();
            System.out.println("Tipo: ");
            roupa.tipo = sc.nextLine();
            System.out.println("Tamanho: ");
            roupa.tamanho = sc.nextLine();
            System.out.println("Quantidade em estoque: ");
            roupa.quantidade = sc.nextInt();
            System.out.println("Valor unitário: ");
            roupa.valor = sc.nextDouble();
            
            System.out.println("Informe a quantidade de roupas a ser removida do estoque: ");
            int quantidade = sc.nextInt();
            roupa.decrementa(quantidade);
            
            System.out.println("Informe a quantidade de roupas a ser adicionada ao estoque: ");
            quantidade = sc.nextInt();
            roupa.incrementa(quantidade);
            
            System.out.println("Dados atualizados da roupa: ");
            System.out.println("Marca: " + roupa.marca + ", Tipo: " + roupa.tipo + ", Tamanho: " + roupa.tamanho + ", Quantidade: " + roupa.quantidade + ", Valor Unitário: " + roupa.valor);
            System.out.println("Valor total em estoque: " + roupa.valorTotal());
            

            sc.nextLine();
            

            System.out.println("Deseja cadastrar outra roupa? (s/n)");
            String resposta = sc.nextLine();
            
            if (resposta.equalsIgnoreCase("n")) {
                break; 
            }
        }
        
        sc.close();
    }
}