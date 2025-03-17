package entidade;

public class Carro {

	String fabricante;
	String modelo;
	int ano;
	String placa;
	String cor;
	int velocidade;
	
	
	public double acelera() {
		
		double velocidadeTotal = velocidade;
		return velocidadeTotal;
	}
	
	public void exibirInfo() {
		
		System.out.println(
				"Fabricante: "+ fabricante +
				"\nModelo: "+ modelo +
				"\nAno: "+ ano +
				"\nPlaca: "+ placa +
				"\nCor:"+ cor +"\n");
	}
}
