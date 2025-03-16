package exercicios;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Soma de números pares e ímpares com while");
        
        int num;
        int numpar = 0;
        int numimpar = 0;
        

        System.out.println("Digite um número (0 para parar de adicionar números): ");
        num = sc.nextInt();
        

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println(num + " é par!");
                numpar += num;  
            } else {
                System.out.println(num + " é ímpar!");
                numimpar += num; 
            }
                        System.out.println("Digite um número (0 para parar de adicionar números): ");
            num = sc.nextInt();  
        }
        

        System.out.println("O resultado da soma dos números pares é: " + numpar);
        System.out.println("O resultado da soma dos números ímpares é: " + numimpar);
        
        sc.close(); 
    }
}