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
			
			System.out.println("\n" + ville.decrisToi() + "\n" + "\n"
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
								  
		}
}
