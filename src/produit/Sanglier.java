package produit;

public class Sanglier extends Produit {
	private String chasseur;
	private int poid;
	
	public Sanglier(String chasseur, int poid) {
		super("sanglier", UniteProduit.KILOGRAMME);
		this.chasseur = chasseur;
		this.poid = poid;
	}

	@Override
	public String descriptionProduit() {
		return "sanglier de " + poid + " " + unite + "chasse par " + chasseur;
	}
}
