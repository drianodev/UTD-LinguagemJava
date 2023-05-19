package padroes.strategy;

import java.text.DecimalFormat;

public class ParceladoTres implements StrategyPagamento{
	
	DecimalFormat formato = new DecimalFormat("#.00");

	@Override
	public String efetuarPagamento(double total) {
		
		total += total*0.1;
		
		return formato.format(total);
	}

	@Override
	public String calcularParcela(double total) {
		
		total += total*0.1;
		return formato.format(total/3);
	}

}