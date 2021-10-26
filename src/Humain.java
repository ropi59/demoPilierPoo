
public class Humain {

	//attributs
	private String nom;
	private String prenom;
	private int age;
	private Vehicule vehicule;
	
	//constructeurs
	public Humain() {
		
	}
	
	public Humain(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = getAge();
	}
	
	public Humain(String nom, String prenom, int age, Vehicule vehicule) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = getAge();
		this.vehicule = vehicule;
	}
	
	//getters setters
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getprenom() {
		return this.prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if (age >= 18) {
			this.age = age;
		}else {
			throw new IllegalArgumentException("Impossible de mettre un age inferieur à 18!");
		}
	}

	@Override
	public String toString() {
		return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", vehicule=" + vehicule + "]";
	}

}
