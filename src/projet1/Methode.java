package projet1;

public class Methode {
	
	public static void main (String [] args) {
		
			String chaine = new String ("RUBEN KAKI"), chaine2 = chaine.toLowerCase(); // Convertit les caractères majuscules en miniscules
			
			String text = new String ("yudji itadori"), text1 = text.toUpperCase(); // Convertit les caractères miniscules en majuscules
			
			String compte = new String ("La displine est meilleur que la motivation"), str1 = new String ("Coucou"), str2 = new String ("Toutou"); 
			
			int compte1 = compte.length(); //Compte le nombre des caractères dans une chaîne des caractères
			
			int position = 0;
			
			double r = 2.0;
			
			r = Math.random(); // Donne une réponse aléatoire entre 0 et 2 (fin je crois)
			
			int v = Math.abs(-23); // Donne la valeur absolue
			
			double jk = 56.0;
			
			double rep = Math.pow(jk, 4); // Pour les calculs exponentiels, le code se lit rep égale jk exposant quatre
			
			double sin = Math.sin(120); // Méthode Math.sin est valable pour tan, cos
			
			System.out.println ("Miniscule : " + chaine2  + "\r");
			
			System.out.println ("Majuscule : " + text1 + "\r");
			
			System.out.println ("Il y a : " + compte1 + " caractères\r");
			
			// Vérifie si les caractères de deux chaînes de caractères sont identiques
			
			if (str1.equals(str2))
				
				System.out.println("le mot est identique");
			
			else 
				System.out.println("le mot est différent");
			
		   String test = compte.substring(29, 42); // Permet d'extraire une partie de la chaîne de caractère en se basant sur les indices de la chaînes
		   
		   System.out.println("Les caractères restants sont : " + test);
		   
		   //position = compte.indexOf("mei");
		  position = compte.lastIndexOf("mo");
		   //position = chaine.indexOf("KI");
		   
		   System.out.println(position);
		   
		   System.out.println("Sinus de 120° égale : " + sin);
		   
		   System.out.println ("La valeur aléatoire est : " + r);
		   
		   System.out.println("La valeur absolu est : " + v);
		   
		   System.out.println("L'exposant de la valeur est : " + rep);
		   
		   
			
	}
}
