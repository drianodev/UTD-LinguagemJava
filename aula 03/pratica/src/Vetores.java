/*
 * Classe explicativa sobre criação e manipulação de Arrays
 * autor: Adriano Mendes Lima
 */

import java.util.ArrayList;

public class Vetores {

    public static void main(String[] args) {

        // Declaração de um vetor vazio
        int numeros[] = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        System.out.println(numeros[2]);

        char consoantes[] = {'b', 'c', 'd', 'f'};
        System.out.println(consoantes[2]);

        ArrayList<Integer> pares = new ArrayList<>();
        pares.add(2);
        pares.add(6);
        pares.add(1,4);
        System.out.println(pares.get(1));
    }
}
