package padroes.adapter;

public class EscalaAdapter extends EscalaCelsius{

	public double getTemperatura() {
		return super.getTemperatura();
	}
	
	public void setTemperatura(double temperatura) {
		super.setTemperatura(temperatura);
	}
	
	public double getTemperaturaFharenheight() {
		return (1.8*super.getTemperatura()+32);
	}
	
	public double getTemperaturaKelvin() {
		return (super.getTemperatura()+273);
	}
}
