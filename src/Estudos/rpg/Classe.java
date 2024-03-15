package Estudos.rpg;

public class Classe {
	private String nomeClasse;
	private int forca;
	private boolean magia;
	
	public Classe(String nomeClasse, int forca, boolean magia) {
		this.nomeClasse = nomeClasse;
		this.forca = forca;
		this.magia = magia;
	}
	
	public String getNomeClasse(String nomeClasse) {
		return nomeClasse;
	}
	public int getForca(int forca) {
		return forca;
	}
	public boolean getMagia(boolean magia) {
		return magia;
	}
}
