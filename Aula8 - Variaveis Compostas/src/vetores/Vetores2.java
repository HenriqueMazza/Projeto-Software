package vetores;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {

		//Criando vetores
		double[] notasAlunos = new double[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < notasAlunos.length; i++) {
			
			System.out.println("Informe a nota do "+ (i + 1) +"º aluno: ");
			double nota = sc.nextDouble();
			
			if ( nota >= 0 && nota <= 10) {
			notasAlunos[i] = nota;
			} else {
				i--;
				System.out.println("nota invalida, insira novamente");
				   
			}
	
		}
		
		//notas => variavel temporaria local
		for (double notas : notasAlunos) {
			System.out.println(notas);
		}
		

		sc.close();	
		
	}
}
