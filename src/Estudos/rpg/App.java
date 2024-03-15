package Estudos.rpg;

public class App {

	public static void main(String[] args) {
		Raca humano = new Raca("Humano", 10, 5);
		Raca elfo = new Raca("Elfo", 7, 10);
		Raca troll = new Raca("Troll", 15, 3);
		
		Classe guerreiro = new Classe("Guerreiro", 4, false);
		Classe mago = new Classe("Mago", 2, true);
		Classe ladrao = new Classe("Ladrão", 3, true);
		
	}
}
