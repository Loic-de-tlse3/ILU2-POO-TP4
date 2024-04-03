package produit;

public class Poisson extends Produit{
	private	String datePeche;
	
	public Poisson(String datePeche) {
		super("poisson", UniteProduit.PIECE);
		this.datePeche = datePeche;
	}

	@Override
	public String descriptionProduit() {
		return "poisson peche" + datePeche;
	}
}
