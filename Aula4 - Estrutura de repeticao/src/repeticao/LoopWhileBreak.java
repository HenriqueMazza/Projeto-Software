package repeticao;

import java.util.Scanner;

public class LoopWhileBreak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String loginSalvo = "admin";
		String senhaSalva = "123";
		String login = "";
		String senha = "";
		int tentativas = 1;
		int maxtentativas = 5;
		
		while (true) {
			
			System.out.println("Informe seu login: ");
			login = sc.nextLine();
			
			System.out.println("Informe sua senha: ");
			senha = sc.nextLine();
			
			if (login.equals(loginSalvo) && senha.equals(senhaSalva)) {
				System.out.println("Acesso liberado!");
				break;
			}
			else if (tentativas >= maxtentativas) {
				System.out.println("numero de tantivas excedidos!");
				break;
			}
			else {
				tentativas++;
			System.out.println("acesso negado");
		}
		
	
	}
	}
}
