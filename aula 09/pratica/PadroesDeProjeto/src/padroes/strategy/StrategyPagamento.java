package padroes.strategy;

public interface StrategyPagamento {

	public String efetuarPagamento(double total);
	
	public String calcularParcela(double total);
	
}
