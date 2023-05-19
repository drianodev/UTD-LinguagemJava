public class FuncionarioOperacional extends Funcionario implements Gratificacao, Descontos {

    private String setor;

    public FuncionarioOperacional() {
    }

    public FuncionarioOperacional(long cadastro, String nome, String ocupacao, double salario, String setor) {
        super(cadastro, nome, ocupacao, salario);

        this.setor = setor;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public double participacaoLucro() {
        return this.getSalario() * 2;
    }

    @Override
    public double auxilioCreche() {
        return 200.00;
    }

    @Override
    public double auxilioViagem() {
        return 0;
    }

    @Override
    public double fgts() {
        return this.getSalario() * 0.09;
    }

    @Override
    public double valeAlimentacao() {
        return this.getSalario() * 0.05;
    }

    @Override
    public double valeTransport() {
        return this.getSalario() * 0.02;
    }
}
