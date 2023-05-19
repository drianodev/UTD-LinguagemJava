package padroes.factory;

public class TesteFactory {

	public static void main(String[] args) {
		Geometria geo = new GeometriaFactory().calcular("Quadrado");
		
		System.out.println(geo.calculaArea(5));
		
		System.out.println(geo.calculaPerimetro(5));
		
		Geometria geo2 = new GeometriaFactory().calcular("triângulo");
		
		System.out.println(geo2.calculaArea(5));
		
		System.out.println(geo2.calculaPerimetro(5));
	}
}
