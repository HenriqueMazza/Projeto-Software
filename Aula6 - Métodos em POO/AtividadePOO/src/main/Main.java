package main;

import java.util.Scanner;
import entidades.Roupa;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Informe os dados da roupa\n");

            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Tipo: ");
            String tipo = sc.nextLine();

            System.out.print("Tamanho: ");
            String tamanho = sc.nextLine();

            System.out.print("Quantidade em estoque: ");
            int quantidade = sc.nextInt();

            System.out.print("Valor unitário: ");
            double valor = sc.nextDouble();

            Roupa roupa = new Roupa(marca, tipo, tamanho, quantidade, valor);

            System.out.print("Informe a quantidade de roupas a ser removida do estoque: ");
            int quantidadeRemover = sc.nextInt();
            roupa.decrementa(quantidadeRemover);

            System.out.print("Informe a quantidade de roupas a ser adicionada ao estoque: ");
            int quantidadeAdicionar = sc.nextInt();
            roupa.incrementa(quantidadeAdicionar);

            System.out.println("\nDados atualizados da roupa:");
            System.out.println("Marca: " + roupa.getMarca() + 
                               ", Tipo: " + roupa.getTipo() + 
                               ", Tamanho: " + roupa.getTamanho() + 
                               ", Quantidade: " + roupa.getQuantidade() + 
                               ", Valor Unitário: R$" + roupa.getValor());
            System.out.println("Valor total em estoque: R$" + roupa.valorTotal());

            sc.nextLine();
            System.out.print("\nDeseja cadastrar outra roupa? (s/n): ");
            String resposta = sc.nextLine();
            
            if (resposta.equalsIgnoreCase("n")) {
                break; 
            }

            System.out.println();
        }
        
        sc.close();
    }
}
