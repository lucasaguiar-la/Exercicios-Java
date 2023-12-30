package Estudos.PdrPplTes;
//import java.util.Scanner;

public class PedraPapelTesoura {
	// "Papel" "Pedra" "Tesoura"

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		
		System.out.println("======================================================\n"
				+ "=============== PEDRA PAPEL TESOURA ==================\n"
				+ "======================================================\n"
				+ "\nEscolha uma opção entre as três e veja quem sai com a melhor!\n"
				+ "\n======================================================\n"
				+ "======================================================\n");
		
		Regras regra = new Regras();
		regra.compara("Tesoura", "Papel");
		 
		
	}

}
