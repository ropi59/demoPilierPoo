
public class Processeur {

	private String marque;
	private String modele;
	private double prix;
	
	public Processeur() {
		
	}

	public Processeur(String marque, String modele, double prix) {
		this.marque = marque;
		this.modele = modele;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Processeur [marque=" + marque + ", modele=" + modele + ", prix=" + prix + "]";
	}
	
	
}
