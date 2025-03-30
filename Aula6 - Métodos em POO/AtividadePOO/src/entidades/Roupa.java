package entidades;

public class Roupa {

		//atributos da classe
		public String marca;
		public String tipo;
		public String tamanho;
		public int quantidade;
		public double valor;
	
		public void decrementa(int quantidade) {
			
	        if (quantidade > this.quantidade) {
	            System.out.println("Não é possível remover mais do que o disponível no estoque!");
	        } else {
	            this.quantidade -= quantidade;
	        }
		}
		
		public void incrementa(int quantidade) {
			
			this.quantidade += quantidade;
		}


public double valorTotal() {

	double totalestoque = quantidade * valor;
	return totalestoque;
	
}

public String toString() {
	return "Roupa [marca=" + marca +
			"\n, tipor=" + tipo +
			"\n, tamanho=" + tamanho +
			"\n, quantidade=" + quantidade + 
			"\n, valor=" + valor +
			"\n, valor total: R$" + valorTotal();
}
	



}