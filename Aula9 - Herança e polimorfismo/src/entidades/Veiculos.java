package entidades;

public class Veiculos {

	private String marca;
	private String modelo;
	private int anoFabricacao;
	private double valorDiaria;
	
	
	//constructor
	public Veiculos(String marca, String modelo, int anoFabricacao, double valorDiaria) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.valorDiaria = valorDiaria;
	}

	//getters and setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	//ToString
	@Override
	public String toString() {
		return "Marca: " + marca +
				"\nModelo: " + modelo +
				"\nAnoFabricacao: " + anoFabricacao +
				"\nValorDiaria: " + valorDiaria;
	}
	
	
	
	
	
}
