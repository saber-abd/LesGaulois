package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion = 1;
	private int forcePotion = 0;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		
		System.out.println(prendreParole() + "«" + texte + "»");

	}
	
	private String prendreParole() {
		return "Le Gaulois "+nom+":";

	}
	
	public void frapper(Romain romain ) {
		System.out.println(nom+"envoie un grand coup dans la machoire de" + romain.getNom());
		romain.recevoirCoup((force/3)*effetPotion);
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		System.out.println("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
		
	}
	
	
	

	public static void main(String[] args) {
		System.out.println("debutGaulois");
		Gaulois asterix;
		asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
		System.out.println(asterix.prendreParole());
		asterix.parler("Bonjour");
		Romain cesar;
		cesar = new Romain("César", 7);
		asterix.boirePotion(2);
		asterix.frapper(cesar);
		
		
	}
	

	
}
