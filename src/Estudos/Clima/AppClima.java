package Estudos.Clima;
import java.util.Scanner;

public class AppClima {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double c, k, f, re, ra;
		String resposta, opcao;
		
		 c = 27;
		 k = c + 273.15;
		 f = (c * 1.8) + 32;
		 re = c * 0.8;
		 ra = (c * 1.8) + 32 + 459.67;
		 
		 new TextoClima();
		 
		 do {
				resposta = TextoClima.Texto();
			
				switch(resposta) {
					case "1":
						System.out.println("\nEm Kelvin " + c + "°C são:\n"
								+ k + " K");
						break;
					case "2":
						System.out.println("\nEm Fahrenheit " + c + "°C são:\n"
								+ f + " °F");
						break;
					case "3":
						System.out.println("\nEm Réaumur " + c + "°C são:\n"
								+ re + " °Re");
						break;
					case "4":
						System.out.println("\nEm Rankine " + c + "°C são:\n"
								+ ra + " °Ra");
						break;
					default:
		                System.out.println("Opção inválida.");
				}
				System.out.println("\nDeseja fazer outra operação? (s/n)");
				opcao = scan.next().toLowerCase();
			}while((!resposta.equals("1") && !resposta.equals("2") && !resposta.equals("3") && !resposta.equals("4")) || (!opcao.equals("n")));
		 scan.close();
		}
	}
