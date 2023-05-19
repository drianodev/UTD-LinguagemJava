package padroes.strategy;

public class Contexto {

	private StrategyPagamento estrategia;
	
	public Contexto(StrategyPagamento estrategia) {
		
		this.estrategia = estrategia;
		
	}
	
	public String efetuarPagamento(double total) {
		return estrategia.efetuarPagamento(total);
	}
	
	public String CalcularParcela(double total) {
		return estrategia.calcularParcela(total);
	}
}
