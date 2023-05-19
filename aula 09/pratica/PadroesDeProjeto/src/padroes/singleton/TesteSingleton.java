package padroes.singleton;

public class TesteSingleton {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		Singleton s5 = Singleton.getInstance();
		
		System.out.println(s1.texto);
		
		s1.texto = s1.texto.toLowerCase();
		
		System.out.println(s1.texto);
		System.out.println(s2.texto);
		System.out.println(s3.texto);
		System.out.println(s4.texto);
		System.out.println(s5.texto);
	}
	
}
