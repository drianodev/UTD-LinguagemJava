/*
 * Classe que demonstra variaveis e constantes
 * autor: Adriano Mendes Lima
*/
public class VarEConst {
	public static void main(String[] args) throws Exception {
        // variaveis
		String nome = "Adriano";
		int idade = 19;
		double peso = 73, altura = 1.65;
		char sexo = 'm', cnh = 'a';
		boolean doadorOrgaos = true;
		
		//constantes
		final double gravidade = 9.80665;
		
		//impressao
    	System.out.println(nome + "\nidade: " + idade);
    	System.out.println("peso: " + peso + " e altura: " + altura);
    	System.out.println("sexo: " + sexo);
    	System.out.println("cnh: " + cnh);
    	System.out.println("doador: " + doadorOrgaos);
    	System.out.println("gravidade: " + gravidade);
    }
}
