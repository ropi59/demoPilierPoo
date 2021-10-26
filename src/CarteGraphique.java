
public class CarteGraphique {

	private String marque;
	private String modele;
	private double prix;
	
	
	public CarteGraphique() {
		
	}
	
	public CarteGraphique(String marque, String modele, double prix) {
		this.marque = marque;
		this.modele = modele;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "CarteGraphique [marque=" + marque + ", modele=" + modele + ", prix=" + prix + "]";
	}
	
	
}
