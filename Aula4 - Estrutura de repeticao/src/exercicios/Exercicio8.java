package exercicios;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Média de números inteiros do while");
        
        int num;
        int numnovo = 0;
        double media;
        int cont = 0;
        
        do {
            System.out.println("Digite um número inteiro (Digite 0 quando quiser parar de adicionar números)");
            num = sc.nextInt();
            if (num != 0) {
                numnovo = numnovo + num;
                cont++;
            }
        } while (num != 0);
        

        if (cont != 0) {
            media = (double) numnovo / cont;
            System.out.println("A média dos números digitados é: " + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }
        
        sc.close();
    }
}