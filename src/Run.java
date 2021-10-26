
public class Run {

	public static void main(String[] args) {
		
//		System.out.println("Hello world");
//		
//		int a = CustomMath.nombre;
//		
//		CustomMath math = new CustomMath();
//		int b = math.nombrePasStatic;
//		
//		//init humain h1
//		Humain h1 = new Humain();
//		System.out.println(h1);
//		//affectation des attributs a h1
//		h1.setNom("LAMARCQ");
//		h1.setPrenom("Olivier");
//		h1.setAge(35);
//		
//		System.out.println(h1);
//		
//		//essai d'attribution d'une valeur interdite a age
//		try {
//		h1.setAge(15);
//		}catch (IllegalArgumentException e) {
//		System.out.println(e);
//		}
		
		//agregation
		CarteGraphique cg = new CarteGraphique("AMD", "RX6900XT", 1299);
		Processeur proc = new Processeur("AMD", "Ryzen 9 5900X", 599.99);
		Ordinateur pc = new Ordinateur("Apple", "Mac Pro", 4999, cg, proc);
		
		System.out.println(pc);
		
		//composition
		Vehicule v1 = new Vehicule();
		Humain h1 = new Humain("Olivier", "Lamarcq", 36, v1);
		System.out.println(h1);
	}

}
