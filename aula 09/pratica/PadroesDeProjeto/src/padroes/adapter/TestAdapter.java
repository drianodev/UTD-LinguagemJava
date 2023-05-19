package padroes.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		EscalaAdapter escala = new EscalaAdapter();
		
		escala.setTemperatura(31);
		
		System.out.println("Temperatura em °C: " + escala.getTemperatura());
		System.out.println("Temperatura em °F: " + escala.getTemperaturaFharenheight());
		System.out.println("Temperatura em °K: " + escala.getTemperaturaKelvin());
	}
}
