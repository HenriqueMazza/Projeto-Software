package estruturada;


public class GastosMensaisEstruturada {

	public static void main(String[] args) {

		
		double alimentoJan, energiaJan, aguaJan,alimentoFev, energiaFev, aguaFev;
		
		alimentoJan = 1000;
		energiaJan = 300;
		aguaJan = 300;
		
		alimentoFev = 1500;
		energiaFev = 500;
		aguaFev = 500;
		
		double totalJan = alimentoJan + energiaJan + aguaJan;
		double totalFev = alimentoFev + energiaFev + aguaFev;
		
	
		if (totalJan > totalFev) {
			System.out.println("O gasto de Janeiro foi maior que o gasto de Fevereiro!\n");
		} else {
			System.out.println("O gasto de Fevereiro foi maior que o gastodem Janeiro!\n");
		}
	
		System.out.println("Os gastos totais do mês de janeiro foi: "+ totalJan);
		System.out.println("Os gastos totais do mês de fevereiro foi: "+ totalFev);
	
	}
	

}
