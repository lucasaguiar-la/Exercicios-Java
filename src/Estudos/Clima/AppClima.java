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

	}

}
