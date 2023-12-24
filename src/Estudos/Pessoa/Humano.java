package Estudos.Pessoa;
import java.util.Scanner;

public class Humano {
	String nome;
	int idade;
	double carteira;
	boolean fome;
	
	Scanner scan = new Scanner(System.in);
	
	public void Restaurante() {
		String opcao;
		
		System.out.println("\nQuanto você pretende gastar no restaurante?"
				+ "\n1) R$15,00 - Prato Feito (Arroz, feijão, batatas e bife)"
				+ "\n2) R$25,00 - Self service"
				+ "\n3) R$40,00 - Rodizio de carne");
		opcao = scan.next();
		if(opcao.equals("1") || opcao.equals("2") || opcao.equals("3")) {
			switch(opcao) {
			case "1":
			carteira -= 15;
			System.out.println("Você comeu um 'Prato Feito' e gastou R$15."
					+ "\nTotal na carteira: R$" + carteira);
			break;
			case "2":
				carteira -= 25;
				System.out.println("Você comeu 'Self Service' e gastou R$25."
						+ "\nTotal na carteira: R$" + carteira);
				break;
			case "3":
				carteira -= 40;
				System.out.println("Você comeu um 'Rodizio de Carne' e gastou R$40."
						+ "\nTotal na carteira: R$" + carteira);
				break;
			}
		}else {
			System.out.println("Opção inválida!");
			Restaurante();
		}
		scan.close();
	}
}
