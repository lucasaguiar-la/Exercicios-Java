package Estudos.PdrPplTes;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		Regras regra = new Regras();
		
		System.out.println("\n======================================================\n"
				+ "=============== PEDRA PAPEL TESOURA ==================\n"
				+ "======================================================\n"
				+ "\nEscolha uma opção entre as três e veja quem ganha!\n"
				+ "Lembre-se de digitar só a inicial da sua jogada:\n"
				+ "\nP para 'Pedra', F para 'Folha' e T para 'Tesoura'\n"
				+ "\n======================================================\n"
				+ "======================================================\n");
		
		//regra.timer(8000);
		regra.play();
		 
		
	}

}
