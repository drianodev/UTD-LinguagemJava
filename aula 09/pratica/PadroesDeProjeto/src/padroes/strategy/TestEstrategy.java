package padroes.strategy;

public class TestEstrategy {

	public static void main(String[] args) {
		
		double compra = 1000;
		
		Contexto con = new Contexto(new ParceladoDez());
		
		System.out.println(con.CalcularParcela(compra));
		
		System.out.println(con.efetuarPagamento(compra));
		
		/*---------------------------------------------*/
		
		con = new Contexto(new ParceladoTres());
		
		System.out.println(con.CalcularParcela(compra));
		
		System.out.println(con.efetuarPagamento(compra));
		
		/*---------------------------------------------*/
		
		con = new Contexto(new CompraAvista());
		
		System.out.println(con.CalcularParcela(compra));
		
		System.out.println(con.efetuarPagamento(compra));
		
	}
}
