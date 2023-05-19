/*
 * Classe explicativa sobre funções
 * autor: Adriano Mendes Lima
 */

public class Funcoes {

    public static void main(String[] args) {

        int result = soma(10, 60);
        System.out.println(result);

        quadrado(7);

        String texto = mensagem();
        System.out.println(texto);
        System.out.println(mensagem());

        olaMundo();

        int nota = 8;

        String resultado = nota >= 7?"aprovado":"recuperação";
        System.out.println(resultado);
    }

    static int soma(int a, int b) {
        return a+b;
    }

    static void quadrado(int numero) {
        System.out.println(numero*numero);
    }

    static String mensagem() {
        return "Mensagem do sistema";
    }

    static void olaMundo() {
        System.out.println("Ola mundo!");
    }
}
