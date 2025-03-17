package poo;

public class Main {

	public static void main(String[] args) {
		
		GastosMes janeiro = new GastosMes();
		GastosMes fevereiro = new GastosMes();

		janeiro.agua = 300;
		janeiro.alimentacao = 1000;
		janeiro.luz = 300;
	
		fevereiro.agua = 100;
		fevereiro.alimentacao = 800;
		fevereiro.luz = 300;
	
		double gastoJan = janeiro.somaConta();
		double gastoFev = fevereiro.somaConta();
		
		if (gastoJan > gastoFev) {
			System.out.println("O gasto de Janeiro foi maior que o gasto de Fevereiro!\n");
		} else {
			System.out.println("O gasto de Fevereiro foi maior que o gastos de Janeiro!\n");
		}
	
		System.out.println("Os gastos totais do mês de janeiro foi: "+ gastoJan);
		System.out.println("Os gastos totais do mês de fevereiro foi: "+ gastoFev);
		
	}

}
