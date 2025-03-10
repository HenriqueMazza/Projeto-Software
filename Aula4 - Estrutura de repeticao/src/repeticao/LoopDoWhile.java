package repeticao;

import java.util.Scanner;

public class LoopDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maquina = (int) (10 * Math.random());
		System.out.println(maquina);
		int usuario;
		
		do {
			System.out.print("Digite o número que estou pensando entre 0 e 9: ");
			usuario = sc.nextInt();
			
		} while (usuario != maquina);
			
			System.out.println("Você acertou!");
		
		
		sc.close();
		
		
		
	}

}
