package poo;

public class Poo_Pratique1 {
	public static void main (String[] args) {
			// Issus du conteneur avec des paramètres par défaut
			Ville ville = new Ville ();
			// Issus du conteneur avec des paramètres
			Ville v1 = new Ville ("Laongo", 800, "Gabon");
			Ville v2 = new Ville ("Oyo", 5_000, "Congo");
			Ville v3 = new Ville ("Ouesso", 31_000, "Congo");
			Ville v4 = new Ville ("Kikwit", 450_000, "RDC");
			Ville v5 = new Ville ("Libreville", 703_000, "Gabon");
			Ville v6 = new Ville ("Brazzaville", 2_300_000, "Congo");
			Ville v7 = new Ville ("Abidjan", 6_300_000, "Côte d'Ivoire");
			Ville v8 = new Ville ("Kinshasa", 21_852_144, "RDC");
			
			System.out.println("\n" + ville.decrisToi() +"\n" + "\n"
								+ v1.decrisToi() + "\n"
								+ v2.decrisToi()+ "\n" 
								+ v3.decrisToi()+ "\n"
								+ v4.decrisToi()+ "\n"
								+ v5.decrisToi()+ "\n"
								+ v6.decrisToi()+ "\n"
								+ v7.decrisToi()+ "\n"
								+ v8.decrisToi()+ "\n");
			
			   /*Nous allons changer le v1 en v2
			   En nous servant d'une varaible temporaire*/ 
			
			Ville tmp = v1;
			v1 = v2;
			v2 = tmp;
			
			System.out.println( 
								v1.decrisToi()+ "\n"+ 
								v2.decrisToi()+ "\n");
			
			// On définit des nouveaux paramètre aux villes v5  et v8
			
			v5.setNomVille("Lagos"); v5.setNomPays("Nigeria"); v5.setNbrHabitants(15_070_000);
			v8.setNomVille("Johannesburg"); v8.setNomPays("RSA"); v8.setNbrHabitants(12_043_175);
			
			System.out.println( 
								  v5.decrisToi()+ "\n"+ 
								  v8.decrisToi()+ "\n");
			
			v1.comparaison(v6); // Appelle de la méthode de comparaison
			
			Capitale capitale = new Capitale ();
			
			System.out.println(capitale.decrisToi());
			
			Capitale cap = new Capitale ("MATONGE", 23_675, "MOLOKAYI", "PAPA WEMBA");
			
			System.out.println(cap.decrisToi());
			
			Ville v = new Ville ("Ruben", 243, "KAKI");
			
			System.out.println(v.decrisToi()+ "\n");
			
			Ville [] tableau = new Ville [6];
			
			String[] tab = {"Marseille","lille","Caen","lyon","Paris","Nantes" }; 
			
			int [] tab1 = {123456, 78456, 654987, 75832165, 1594, 213};
			
			//Les trois premiers éléments du tableau seront des villes,
			//et le reste, des capitales
			
			for (int i = 0; i < 6; i++) {
				
				if (i < 3) {
					Ville T = new  Ville (tab[i], tab1[i], "France");
					tableau [i] = T;
				}
				else  {
					Capitale C = new Capitale (tab[i], tab1[i], "France", "La Tour Eiffel");
					tableau [i] = C;
				}
				
			}
			// Polymorphisme 
			for (Ville T : tableau) {
				
				System.out.println(T.decrisToi() + "\n");
			}
			// Polymorphisme avec la classe Object dont toutes les autres classes héritent de façon tacite dans JAVA
			for (Object obj : tableau) {
				
				System.out.println(obj.toString()+ "\n"); // La méthde "toString" est la plus redéfinie de la classe Object
			}
		// Répétition de la méthode comparaison juste pour fun :)	
		v1.comparaison(v2);
		v2.comparaison(v3);
		v3.comparaison(v4);
		v4.comparaison(v5);
		cap.comparaison(v6);
		
		
		
		}
}
