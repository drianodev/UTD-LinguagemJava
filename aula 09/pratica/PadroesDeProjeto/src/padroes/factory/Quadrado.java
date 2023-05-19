package padroes.factory;

public class Quadrado implements Geometria {
	
	public String calculaPerimetro(int lado) {
		return "O perimetro do quadrado vale: " + lado * 4;
	}

	@Override
	public String calculaArea(int lado) {
		
		return "A área do quadrado vale: " + Math.pow(lado, 2);
	}
	
	
}
