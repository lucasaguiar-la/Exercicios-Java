package Estudos.rpg;

public class Raca {
	private String nomeRaca;
	private int pontosVida;
	private int mana;

	public Raca(String nomeRaca, int pontosVida, int mana) {
		this.nomeRaca = nomeRaca;
		this.pontosVida = pontosVida;
		this.mana = mana;
	}
	
	public void printRaca() {
		System.out.println("Raça: " + getNome() + "\n");
		System.out.println("Pv: " + getPv() + "\n");
		System.out.println("Mana: " + getMana() + "\n");
	}
	
	public String getNome() {
		return nomeRaca;
	}
	public int getPv() {
		return pontosVida;
	}
	public int getMana() {
		return mana;
	}

}
