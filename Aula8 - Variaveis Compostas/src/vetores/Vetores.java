package vetores;

public class Vetores {

	public static void main(String[] args) {
		
		 //Criando vetores
		double[] notasAlunos = new double[3];

		//Atribuindo valores para o vetor
		notasAlunos[0] = 9;
		notasAlunos[1] = 3;
		notasAlunos[2] = 6.5;
		
		System.out.println("Valores do vetor exibidos um por um com sysout");

		//ler os valores do vetor
		//1º forma
		System.out.println(notasAlunos[0]);
		System.out.println(notasAlunos[1]);
		System.out.println(notasAlunos[2]+ "\n");
		
		
		System.out.println("Valores do vetor exibidos pelo 'for'");;
		//2º forma
		for (double nota : notasAlunos) {
			System.out.println(nota);
		}
		
		
		
		
		
		
		
	}

}
