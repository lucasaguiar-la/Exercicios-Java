package Estudos.Clima;
import java.util.Scanner;

public class TextoClima {
	public String Texto() {
		Scanner scan = new Scanner(System.in);
		double c = 27;
		String resposta;
		
		System.out.println("=================================================\n"
				+ "-=== Bem-vindo ao programa de clima e tempo! ===-"
				+ "\n=================================================\n" + 
		"\nA temperatura está em " + c + "°C");
		System.out.println("Você gostaria de fazer conversão para:" +
		"\n1) Kelvin"
		+ "\n2) Fahrenheit"
		+ "\n3) Réaumur "
		+ "\n4) Rankine");
		resposta = scan.next();
		
		return resposta;
	}
}
