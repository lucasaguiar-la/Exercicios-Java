package Estudos.conversor;
import java.util.Scanner;

public class Conversores {
	Scanner scan = new Scanner(System.in);
	
	public void medida() {
		String run;
		int resposta;
		double medida, resultado;
		
		do {
			
			System.out.println("Quantos metros você gostaria de converter?");
			medida = scan.nextDouble();
			do {
				System.out.println("Para qual unidade de medida você gostaria de converter?\n"
						+ "[ 1 ] Milímetros (mm)\n"
						+ "[ 2 ] Centímetros (cm)\n"
						+ "[ 3 ] Quilômetros (km)\n");
				resposta = scan.nextInt();
			}while(resposta != 1 && resposta != 2 &&resposta != 3);
			switch(resposta) {
				case 1:
					resultado = medida * 1000;
					System.out.println(medida + " metros é equivalente a: " + resultado + "mm");
					break;
				case 2:
					resultado = medida * 100;
					System.out.println(medida + " metros é equivalente a: " + resultado + "cm");
					break;
				case 3:
					resultado = medida * 0.001;
					System.out.println(medida + " metros é equivalente a: " + resultado + "km");
			}
			do {
				System.out.println("Gostaria de fazer outra conversão de medida? (s/n)");
				run = scan.next().toLowerCase();
				if(run.equals("n")) {
					System.out.println("Programa encerrado com sucesso!\n"
							+ "Obrigado por utilizar nossos serviços!!");
				}
			}while(!run.equals("s") && !run.equals("n"));

		}while(run.equals("s"));
	}
}
