package Estudos.PdrPplTes;
import java.util.Random;
import java.util.Scanner;

public class Regras {
	
	String escolhaJogador;
	String escolhaMaquina;
	Scanner scan = new Scanner(System.in);
	String jogada[] = {"Pedra", "Papel", "Tesoura"};
	
	public void jogador() {
		do {
			System.out.println("*Insira uma opção válida ('p', 'f' ou 't')*\n");
			System.out.println("Qual a sua jogada?\n"
				+ "(p)edra\n"
				+ "(f)olha\n"
				+ "(t)esoura\n");
		escolhaJogador = scan.next().toLowerCase();
		}while(!escolhaJogador.equals("p") && !escolhaJogador.equals("f") && !escolhaJogador.equals("t"));
		
		System.out.println(escolhaJogador);
	}
	
	public void maquina() {
		int escolha = sortearIndice(jogada.length);
		escolhaMaquina = jogada[escolha];
		
		System.out.println("Eu escolho: " + escolhaMaquina);
	}
	
	
	private static int sortearIndice(int tamanhoLista) {
        Random random = new Random();
        return random.nextInt(tamanhoLista);
    }
}
