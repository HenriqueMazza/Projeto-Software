package entidades;

public class Moto extends Veiculos{

	private int cilindradas;
	
	public Moto(String marca, String modelo, int anoFabricacao, double valorDiaria, double cilindradas) {
		super(marca, modelo, anoFabricacao, valorDiaria);
		this.cilindradas = (int) cilindradas;
		
	}

	@Override
	public String toString() {
		return super.toString() +
		"\nCilindradas: " + cilindradas;
				
	}

	public double calcularAluguel(int dias) {
		double valorTotal;
		
		if (cilindradas <= 250 ) {
			valorTotal = dias * getValorDiaria();
		} else if (cilindradas <=500 ) {
			valorTotal = dias * getValorDiaria() * 1.5;
		} else {
			valorTotal = dias * getValorDiaria() * 2;
		}
		
		return valorTotal;
	}
	
}
