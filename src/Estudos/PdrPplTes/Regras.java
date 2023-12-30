package Estudos.PdrPplTes;
import java.util.Random;
import java.util.Scanner;

public class Regras {
	
	String escolhaJogador;
	String escolhaMaquina;
	String resposta;
	Scanner scan = new Scanner(System.in);
	String jogada[] = {"Pedra", "Folha", "Tesoura"};
	
	public void play() {
		jogador();
		maquina();
		compara(escolhaJogador, escolhaMaquina);
		repete();
	}
	
	public String jogador() {
		do {
			System.out.println("*Insira uma opção válida ('p', 'f' ou 't')*\n");
			System.out.println("Qual a sua jogada?\n"
				+ "(p)edra\n"
				+ "(f)olha\n"
				+ "(t)esoura\n");
		escolhaJogador = scan.next().toLowerCase();
		}while(!escolhaJogador.equals("p") && !escolhaJogador.equals("f") && !escolhaJogador.equals("t"));
		switch(escolhaJogador){
			case "p":
				escolhaJogador = "Pedra";
				break;
			case "f":
				escolhaJogador = "Folha";
				break;
			case "t":
				escolhaJogador = "Tesoura";
				break;
		}
		return escolhaJogador;
	}
	
	public String maquina() {
		int escolha = sortearIndice(jogada.length);
		escolhaMaquina = jogada[escolha];

		return escolhaMaquina;
	}
	
	public void compara(String escolhaJogador, String escolhaMaquina) {
		if(escolhaJogador == escolhaMaquina) {
			System.out.println("Jogador: " + escolhaJogador
					+ "\nMaquina: " + escolhaMaquina
					+ "\nDeu empate!");
		}else if((escolhaJogador == "Pedra" && escolhaMaquina == "Tesoura") || 
				(escolhaJogador == "Tesoura" && escolhaMaquina == "Folha") || 
				(escolhaJogador == "Folha" && escolhaMaquina == "Pedra")) {
			System.out.println("Jogador: " + escolhaJogador
					+ "\nMaquina: " + escolhaMaquina
					+ "\nVOCÊ GANHOU!");
		}else {
			System.out.println("Jogador: " + escolhaJogador
					+ "\nMaquina: " + escolhaMaquina
					+ "\nVocê perdeu!");
		}
	}
	
	public void repete() {
		do {
			System.out.println("\nQuer jogar de novo? (s/n)");
		resposta = scan.next().toLowerCase();
		}while(!resposta.equals("s") && !resposta.equals("n"));
		
		if(resposta.equals("s")) {
			play();
		}else {
			System.out.println("\nObrigado por jogar!!");
		}
	}
	
	private static int sortearIndice(int tamanhoLista) {
        Random random = new Random();
        return random.nextInt(tamanhoLista);
    }
	
	public void timer(int seg) {
		try {
            Thread.sleep(seg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
