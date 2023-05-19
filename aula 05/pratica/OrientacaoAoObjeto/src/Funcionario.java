public class Funcionario {

    private Long cadastro;
    private String nome;
    private String ocupacao;
    private double salario;

    public Long getCadastro() {
        return this.cadastro;
    }

    public void setCadastro(Long cad) {
        this.cadastro = cad;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
