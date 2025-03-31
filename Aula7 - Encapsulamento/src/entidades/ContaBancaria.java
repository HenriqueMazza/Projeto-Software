package entidades;

public class ContaBancaria {

	private String titular;
	private double saldo; 
	
	//método  //parametro -> valor que o usuario digita
	
	public ContaBancaria(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//metodos que alteram o valor
	public void depositar(double valor){
		
		if (valor > 0) {
			saldo += valor;
		} else {
			System.out.println("Valor depositado inválido!");
		}
	}
	
	public void saque(double sacar) {
		
		if (saldo >= sacar && sacar > 0) {
			saldo -= sacar;
			
		} else {
			System.out.println("Saque invalido!");
		}
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [titular=" + titular + ", saldo=" + saldo + "]";
	}
	
}




