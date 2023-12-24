package Estudos.Pessoa;
import java.util.Scanner;

public class Humano {
	String nome;
	int idade;
	double carteira;
	boolean fome;
	
	Scanner scan = new Scanner(System.in);
	
	public void restaurante() {
		System.out.println("\nQuanto você pretende gastar no restaurante?"
				+ "1) R$15,00 - Prato Feito (Arroz, feijão, batatas e bife)"
				+ "2) R$25,00 - Self service"
				+ "3) R$40,00 - Rodizio de carne");
		String opcao = scan.next();
		
		switch(opcao) {
			case "1":
			carteira -= 15;
			System.out.println("Você comeu um 'Prato Feito' e gastou R$15."
					+ "\nTotal na carteira: R$" + carteira);
			case "2":
				carteira -= 15;
				System.out.println("Você comeu 'Self Service' e gastou R$25."
						+ "\nTotal na carteira: R$" + carteira);
			case "3":
				carteira -= 15;
				System.out.println("Você comeu um 'Rodizio de Carne' e gastou R$40."
						+ "\nTotal na carteira: R$" + carteira);
		}
		
	}
}
