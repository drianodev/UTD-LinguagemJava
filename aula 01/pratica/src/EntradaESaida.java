import java.util.Scanner;

/*
 * Classe que demonstra entradas e saidas
 * autor: Adriano Mendes Lima
*/
public class EntradaESaida {
	public static void main(String[] args) throws Exception {
		
		// vars
		String nome;
		int idade;
		double altura;
		
		// entrada
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		nome = leitor.nextLine();
		
		System.out.println("Digite sua idade:");
		idade = leitor.nextInt();
		
		System.out.println("Digite sua altura:");
		altura = leitor.nextDouble();
		
		//saida
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
		
		System.out.printf("NOme: %s \nidade: %d \naltura: %.2f", nome, idade, altura);
    }
}
