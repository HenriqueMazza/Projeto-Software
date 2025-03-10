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
		
		while (contador < maxcontador && !(loginUser.equals(loginSalvo)) || !(senhaUser.equals(senhaSalva))) {
			
			
			System.out.println("Informe seu login: ");
			loginUser = sc.nextLine();
			
			System.out.println("Informe sua senha: ");
			senhaUser = sc.nextLine();
			
			contador++;
		}
		
		if (contador > maxcontador) {
			System.out.println("Login e senha incorretas");
		} else {
			System.out.println("Acesso liberado!");
		}
		

		sc.close();
	}

}
