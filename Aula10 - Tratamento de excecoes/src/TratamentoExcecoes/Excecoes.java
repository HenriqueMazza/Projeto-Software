package TratamentoExcecoes;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Excecoes {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		try {
			System.out.println("Digite um número: ");
			int Numero=sc.nextInt();
			System.out.println("O numero digitado foi "+Numero);
			System.out.println("Digite outro valor: ");
			int Numero2=sc.nextInt();
			System.out.println("O numero digitado foi "+Numero2);
		}catch(InputMismatchException e) {
		System.out.println("Digite outro Valor do tipo numerico ");
		}
		try {
			
		//posição inexistente do vetor | Mostrar erro
		int[] vetor =new int[5];
		System.out.print(vetor[9]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("FIMMMM!!");
		
		sc.close();
	}

}
