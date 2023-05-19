package padroes.strategy;

public class CompraAvista implements StrategyPagamento{

	@Override
	public String efetuarPagamento(double total) {
	
		return String.valueOf(total);
	}

	@Override
	public String calcularParcela(double total) {
		
		return String.valueOf(total);
	}

}
