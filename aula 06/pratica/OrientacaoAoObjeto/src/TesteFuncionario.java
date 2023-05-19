public class TesteFuncionario {

    public static void main(String[] args) {

        FuncionarioOperacional f1 = new FuncionarioOperacional();

        f1.setCadastro((long) 1112);
        f1.setNome("Adriano");
        f1.setOcupacao("Programador");
        f1.setSalario(2000.00);

        System.out.println(f1.getCadastro());
        System.out.println(f1.getNome());
        System.out.println(f1.getOcupacao());
        System.out.println(f1.getSalario());

        //f1.verFuncionarios();
        Funcionario.verFuncionarios();

        System.out.println("-------------------------");

        FuncionarioOperacional f2 = new FuncionarioOperacional(1113, "João", "Designer", 1000.0, "marketing");

        System.out.println(f2.getCadastro());
        System.out.println(f2.getNome());
        System.out.println(f2.getOcupacao());
        System.out.println(f2.getSalario());
        System.out.println(f2.getSetor());

        //f2.verFuncionarios();
        Funcionario.verFuncionarios();
    }
}
