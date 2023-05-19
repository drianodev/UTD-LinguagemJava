import java.util.Scanner;

/*
 * Classe que demonstra estrutura de repetição
 * autor: Adriano Mendes Lima
*/
public class EstruturaRepeticao {
    public static void main(String[] args) {
        
        // while
        boolean flag = true;

        Scanner leitor = new Scanner(System.in);

        while (flag) {
            System.out.println("true");
            flag = leitor.nextBoolean();
        }

        int contador = 0;
        while (contador < 10) {
            System.out.println(contador++);
            System.out.println(++contador);
            contador++;
        }

        // do while
        boolean flag1 = false;

        do {
            System.out.println("teste");
        } while (flag1);

        // for
        System.out.println("for:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        String frutas[] = {"abacaxi", "maçã", "abacate", "laranja", "limão", "uva"};

        for (int i = 0; i < 3; i++) {
            System.out.println(frutas[i]);
        }

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
