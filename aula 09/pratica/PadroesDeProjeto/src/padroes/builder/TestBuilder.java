package padroes.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		Matricula m1 = new MatriculaBuilder()
				.setMatricula(123)
				.setResponsavel("Lidiane", "9999999", "Rua Beira Mar")
				.setAluno("Adriano", "Faculdade", "Manhã")
				.build();
		
		System.out.println(m1.toString());
	}
}
