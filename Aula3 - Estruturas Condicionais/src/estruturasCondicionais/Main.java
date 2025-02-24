package estruturasCondicionais;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Calcule a média do usúario
		// 7 a 10 aprovado
		// 5 a 6.9 recuperação
		//   - aprovado 7 a 10
		//   - reprovado 0 a 6.9	
		// 0 a 4.9 reprovado
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if(media>=7) {
			System.out.println("O aluno foi aprovado :) com a média de: "+ media);
			
		} else if (media >=5) {
			System.out.println("O aluno deve fazer a recuepração :| com a média de: "+ media);
			
			System.out.println("Digite a nota obtida na recuperação: ");
			double notaRec = sc.nextDouble();
			double mediaRec = (media + notaRec)/2;
			
			
			if (mediaRec >= 7) {
				System.out.println("O aluno foi aprovado pela recuperação! com a media de: "+mediaRec);
				
			} else {
				System.out.println("O alunio foi reprovado na recuepração! com a media de : "+mediaRec);
			}
				
		} else {
			System.out.println("O aluno foi reprovado! :( com a média de: "+ media);
		}
		
		sc.close();
		
		
		
		

	}

}
