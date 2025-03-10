package repeticao;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//login e senha
		//Permita apenas 5 tentativas
		
        String loginSalvo = "admin";
        String senhaSalva = "admin";
        String loginUser = "";
        String senhaUser = "";
        int contador = 0;
        int maxcontador = 5;
        
        while (contador < maxcontador) {
            System.out.println("Informe seu login: ");
            loginUser = sc.nextLine();
            
            System.out.println("Informe sua senha: ");
            senhaUser = sc.nextLine();
            
            if (loginUser.equals(loginSalvo) && senhaUser.equals(senhaSalva)) {
                System.out.println("Acesso liberado!");
                break; // Sai do loop se o login e senha estiverem corretos
            }
            
            contador++;
            
            if (contador >= maxcontador) {
                System.out.println("Número máximo de tentativas atingido. Acesso negado!");
            }
        }
        
        sc.close();
    }
}
