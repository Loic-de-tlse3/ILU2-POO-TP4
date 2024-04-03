package produit;

public abstract class Produit {
	protected String nom;
	protected UniteProduit unite;
	
	protected Produit(String nom, UniteProduit unite) {
		this.nom = nom;
		this.unite = unite;
	}

	public String getNom() {
		return nom;
	}
	
	public abstract String descriptionProduit();
}
