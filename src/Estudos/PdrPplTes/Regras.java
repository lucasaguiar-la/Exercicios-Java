package Estudos.PdrPplTes;
import java.util.Random;

public class Regras {

	private static int sortearIndice(int tamanhoLista) {
        Random random = new Random();
        return random.nextInt(tamanhoLista);
    }
	
	public void maquina() {
		String jogada[] = {"Pedra", "Papel", "Tesoura"};
		int escolha = sortearIndice(jogada.length);
		String escolhaMaquina = jogada[escolha];
		
		System.out.println("Eu escolho: " + escolhaMaquina);
	
	
	}
}
