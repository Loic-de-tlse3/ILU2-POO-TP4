package scenarioTest;

import villagegaulois.IEtal;
import produit.Produit;
import produit.Sanglier;
import personnages.Gaulois;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal<Sanglier>[] marche = new IEtal[3];
		marche[0].occuperEtal(new Gaulois("Bonnemine", 3), new Sanglier("Obelix", 5), 1);
	}
	
}
