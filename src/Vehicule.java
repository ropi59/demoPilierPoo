
public class Vehicule {

	//attributs de mon objet vehicule
	private String couleur;
	private String marque;
	private String modele;
	public double prix;
	
	//constructeurs par defaut
	public Vehicule() {
		this.couleur = "bleue";
		this.marque = "Peugeot";
		this.modele = "308";
		this.prix = 10000;
	}
	
	//constructeurs
	public Vehicule(String couleur, String marque, String modele, double prix) {
		this.couleur = couleur;
		this.marque = marque;
		this.modele = modele;
		this.prix = prix;
	}
	
	//constructeur partiel
	public Vehicule(String couleur, String marque) {
		this.couleur = couleur;
		this.marque = marque;
		
	}
	//constructeur avec recuperation des variables d'un autre constructeur
	public Vehicule(String couleur, String marque, String modele, double prix) {
		this(couleur, marque);
		this.modele = modele;
		this.prix = prix;
	}
	

	 
	//methode pour changer la couleur de mon vehicule
	public void repeindre(String newColor) {
		this.couleur = newColor;
	}
	
	//getters setters
	public String getMarque() {
		return this.marque;
	}
	 public void setMarque(String marque) {
		 this.marque = marque;
	 }
	
	 public String getModele() {
		 return this.modele;
	 }
	 
	 public void setModele(String modele) {
		 this.modele = modele;
	 }
	 
	 public String getCouleur() {
		 return this.couleur;
	 }
	 
	 public void setCouleur(String couleur) {
		 this.couleur = couleur;
	 }
	 
	 
	@Override
	public String toString() {
		return "Vehicule "
				+ "[couleur=" + couleur 
				+ ", marque=" + marque 
				+ ", modele=" + modele 
				+ ", prix=" + prix + "]";
	}
}
