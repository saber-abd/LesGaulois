package personnages;

public class Romain {

	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler() {
		System.out.println(prendreParole()+"«"+texte+"»");

	}
	
	private String prendreParole() {
		return "Le Romain"+nom+":";

	}
	
	public void recevoirCoup() {
		force -= forceCoup;
		if (force > 3) {
			parler("Aïe");
		} else {
			parler("J'abandonne...")
		}
	}
}
