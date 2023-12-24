package Estudos.Pessoa;
import java.util.Scanner;

public class Humano {
	String nome;
	int idade;
	double carteira;
	boolean fome;
	
	Scanner scan = new Scanner(System.in);
	
	public void Banco() {
		String opcao, nome, menuBanco;
		double addDinheiro, subDinheiro;
		
		System.out.println("===================================");
		System.out.println("-==Olá, seja bem-vindo ao banco!==-");
		System.out.println("===================================");
		System.out.println("Por favor, escolha uma opção:");
		System.out.println("1) Depositar dinheiro\n"
				+ "2) Transferir dinheiro\n"
				+ "3) Sair");
		opcao = scan.next();
		
		if(opcao.equals("1") || opcao.equals("2")) {
			switch(opcao) {
				case "1":
					System.out.println("\nQuanto você deseta adicionar a sua conta?");
					addDinheiro = scan.nextDouble();
					carteira += addDinheiro;
					System.out.println("Valor adicionado com sucesso!\n"
							+ "Valor adicionado: R$" + addDinheiro
							+ "\nCarteira: R$" + carteira);
					break;
				case "2":
					System.out.println("\nPara quem você gostaria de transferir? (Insira um nome)");
					nome = scan.next();
					System.out.println("\nQuanto você gostaria de transferir para " + nome + "?");
					subDinheiro = scan.nextDouble();
					carteira -= subDinheiro;
					System.out.println("Valor transferido com sucesso!\n"
							+ "Valor transferido: R$" + subDinheiro
							+ "\nCarteira: R$" + carteira);
				}
			System.out.println("Fazer outra operação? (s/n)");
			menuBanco = scan.next().toLowerCase();
			
			if(menuBanco.equals("s")) {
				Banco();
			}else if(menuBanco.equals("n")){
				System.out.println("\nObrigado por utilizar nossos seerviços!");
			} else {
				System.out.println("Opção inválida!");
				Banco();
			}
			
		}else if(opcao.equals("3")) {
			System.out.println("\nObrigado por utilizar nosso serviços!");
		}else {
			System.out.println("\nOpção inválida, por favor, insira um dígito válido!");
			Banco();
		}
	}
	
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
