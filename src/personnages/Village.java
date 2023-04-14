package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois gaulois;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		villageois = new Gaulois[nbVillageoisMaximum];
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		
	}
	
	public Gaulois trouverHabitant(int villageoi) {
		return villageois[villageoi];
		
	}
	
	public void afficherVillageois() {
		String nChef = chef.getNom() ;
		System.out.println("Dans le village du chef " + nChef + " vivent les legendaires Gaulois");
		for (int i=0; i < nbVillageois; i++){
			Gaulois pers = villageois[i];
			System.out.println("-" + pers.getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles",30);
		Chef abracourcix = new Chef("Abracourcix",6,village);
		village.setChef(abracourcix);
		//Gaulois gaulois = village.trouverHabitant(30); 
		//Marche pas car on demande au compilateur de lui donner une case vide, car il n'y a pour l'instant aucun habitant, soit aucune donnée, dans le tableau.
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village1.trouverHabitant(1);
		//System.out.println(gaulois);
		//Le tableau contient 1 seul element d'indice 0 qui est asterix, lui demander l'élement d'indice 1 revient à lui demander un villageoi inexistant
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
	}

}
