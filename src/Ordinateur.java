
public class Ordinateur {

	private String marque;
	private String modele;
	private double prix;
	private CarteGraphique carteGraphique;
	private Processeur processeur;
	
	public Ordinateur() {
		
	}
	
	public Ordinateur(String marque, String modele, double prix, CarteGraphique carteGraphique, Processeur processeur) {
		this.marque = marque;
		this.modele = modele;
		this.prix = prix;
		this.carteGraphique = carteGraphique;
		this.processeur = processeur;
	}

	@Override
	public String toString() {
		return "Ordinateur [marque=" + marque + ", modele=" + modele + ", prix=" + prix + ", carteGraphique="
				+ carteGraphique + ", processeur=" + processeur + "]";
	}
	
	
}
