package entidades;

public class Carro extends Veiculos {

	private boolean arCondicionado;
	
	public Carro(String marca, String modelo, int anoFabricacao, double valorDiaria, boolean arCondicionado) {
		super(marca, modelo, anoFabricacao, valorDiaria);
		this.arCondicionado = arCondicionado;
		
	}

	@Override
	public String toString() {
		return "Marca: " + getMarca() +
				"\nModelo: " + getModelo() +
				"\nAno: " + getAnoFabricacao() +
				"\nValor da diária: " + getValorDiaria() +
				"\nAr condicionado: " + arCondicionado;
				
	}
	
	public double calcularAluguel(int dias) {
		
		double valorTotal;
		
		if(arCondicionado) {
			valorTotal = getValorDiaria() * dias * 1.5;
		} else {
			valorTotal = dias * getValorDiaria();
		}
		
		return valorTotal;
	}

}
