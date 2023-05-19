package padroes.factory;

public class Triangulo implements Geometria {

	@Override
	public String calculaPerimetro(int lado) {
		
		return "O perimetro do triângulo vale: " + lado * 3;
	}

	@Override
	public String calculaArea(int lado) {
		
		return "A área do triângulo vale: " + Math.pow(lado, 2) * Math.sqrt(3)/4;
	}

}
