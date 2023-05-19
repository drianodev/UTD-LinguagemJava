/*
 * Classe que demonstra estrutura de decisão
 * autor: Adriano Mendes Lima
*/
public class EstruturaDecisao {
    public static void main(String[] args) {
        // ternario
        String texto = 10 == 7 ? "Dez é igual a sete":"Dez é diferente de sete";
        System.out.println(texto);

        // if and else
        int idade = 18;

        if (idade >= 18) {
            System.out.println("maior de 18");
        } else {
            System.out.println("menor de 18");
        }


        String semaforo = "verde";
        if (semaforo == "verde") {
            System.out.println("passe");
        } else if (semaforo == "vermelho") {
            System.out.println("pare");
        } else {
            System.out.println("atençao");
        }

        // switch
        char opcao = 'a';

        switch (opcao) {
            case 'a':
                System.out.println("op a");
                break;
            case 'b':
                System.out.println("op b");
                break;
            default:
                System.out.println("nenhuma");
                break;
        }
    }
}





