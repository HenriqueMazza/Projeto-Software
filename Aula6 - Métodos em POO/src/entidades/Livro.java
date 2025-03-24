package entidades;

public class Livro {

	//atributos da classe
	public String titulo;
	public String autor;
	public int quantidade;
	public double valor;
	
	public void empresta(int quantidade) {
		
		// this informa que é a variavel publica
		//e  nao a criada no parametro
		this.quantidade -= quantidade;
		
	}
	
	public void devolve(int quantidade) {
		
		this.quantidade += quantidade;
	}
	
	public double livrosvalor() {
		
		double valortotal = quantidade * valor;
		return valortotal;
	}
	
// Manualmente exibindo os dados (sem toString )
		public String exibirDados(){
			return "Livro: "+ titulo +
					"\nAutor: "+ autor +
					"\nQuantidade: "+ quantidade +
					"\nValor: "+ valor;
		}
	
// Utilizando toString para exibir os dados IDE
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo +
				"\n, autor=" + autor +
				"\n, quantidade=" + quantidade +
				"\n, valor=" + valor + 
				"\n, valor total: R$" + livrosvalor();
	}
		

	
	
}

