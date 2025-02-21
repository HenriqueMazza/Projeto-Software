package Desafios; 
import java.util.Scanner;
public class Desafio5 {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Digite o Raio em cm: ");
		double R = sc.nextDouble();
		
		double A = Math.PI * Math.pow(R, 2);
		double P = 2 * Math.PI * R;
		
		System.out.printf("A área do círculo é de aproximadamente: %.2f" , A , " cm");
		System.out.printf("\nO perímetro do círculo é de aproximadamente: %.2f" , P , " cm");

	}

}
