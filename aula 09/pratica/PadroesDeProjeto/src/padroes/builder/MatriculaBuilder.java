package padroes.builder;

public class MatriculaBuilder {

	private Matricula instancia;
	
	public MatriculaBuilder() {
		this.instancia = new Matricula();
	}
	
	public MatriculaBuilder setMatricula(long cadastro) {
		instancia.setCadastro(cadastro);
		
		return this;
	}
	
	public MatriculaBuilder setResponsavel(String nome, String telefone, String endereco) {
		
		Responsavel responsavel = new Responsavel();
		
		responsavel.setNome(nome);
		responsavel.setEndereco(endereco);
		responsavel.setTelefone(telefone);
		
		instancia.setResponsavel(responsavel);
		
		return this;
	}
	
	public MatriculaBuilder setAluno(String nome, String serie, String turno) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(nome);
		aluno.setTurno(turno);
		aluno.setSerie(serie);
		
		instancia.setAluno(aluno);
		
		return this;
	}

	public Matricula build() {
		return instancia;
	}

}
