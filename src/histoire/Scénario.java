package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scénario {

	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new Gaulois("Astérix", 3);
		Gaulois obelix = new Gaulois("Obelix",7);
		Romain minus;
		minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler("Je vais aller preparer une petite potion...");
		panoramix.preparerPotion(5, 10);
		panoramix.booster(obelix);
		obelix.parler("Par Belenos, ce n'est pas juste");
		asterix.parler("Bonjour");
		panoramix.booster(asterix);
		minus.parler("Un Gau... Un GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		
		

	}

}
