public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.setCadastro((long) 1112);
        f1.setNome("Adriano");
        f1.setOcupacao("Programador");
        f1.setSalario(2000.00);

        System.out.println(f1.getCadastro());
        System.out.println(f1.getNome());
        System.out.println(f1.getOcupacao());
        System.out.println(f1.getSalario());
    }
}
