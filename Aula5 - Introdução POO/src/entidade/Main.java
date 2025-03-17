package entidade;

public class Main {

	public static void main(String[] args) {
		
		Carro civic = new Carro();
		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.ano = 2008;
		civic.placa = "HDF-2345";
		civic.cor = "Preto";
		civic.acelera();
		//Método para exibir as informação da classe carro
		civic.exibirInfo();
		
		Carro kicks = new Carro();
		kicks.fabricante = "Nissan";
		kicks.modelo = "Kicks SV";
		kicks.ano = 2017;
		kicks.placa = "DKE-6526";
		kicks.cor = "Prata";
		kicks.acelera();
		
		kicks.exibirInfo();
		
		Carro creta = new Carro();
		creta.fabricante = "Hyundai";
		creta.modelo = "Creta";
		creta.ano = 2010;
		creta.placa = "PCV-1856";
		creta.cor = "Azul";
		creta.acelera();
		
		creta.exibirInfo();

	}

}
