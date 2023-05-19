public abstract class Funcionario {

    private long cadastro;
    private String nome;
    private String ocupacao;
    private double salario;
    private static int numFuncionarios;

    // CONSTRUCTOR
    public Funcionario() {
        this.numFuncionarios++;
    }

    public Funcionario(long cadastro, String nome, String ocupacao, double salario) {
        this.cadastro = cadastro;
        this.nome = nome;
        this.ocupacao = ocupacao;
        this.salario = salario;
        this.numFuncionarios++;
    }

    // GETTERS AND SETTERS

    public long getCadastro() {
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

    public static void verFuncionarios() {
        System.out.println("Número = " + numFuncionarios);
    }
}
