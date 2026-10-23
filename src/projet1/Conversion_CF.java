package projet1;
/** Ce programme est issu du livre Zest du savoir pour l'apprentissage du langage Java.
 * 
 * L'exercice porte sur la conversion de la température Celsius en Fahrenheit et l'inverse selon l'utilisateur.
 * 
 * Il est résolu en utilisant une approche différente de celle du livre.
 * 
 *  
 * Cet exercice résume les leçons vues sur le premier chapitre du livre qui tourne autour des variables, boucles, conditions,...**/

import java.util.*;

public class Conversion_CF {
	
	public static void main (String [] args) {
		// Déclaration des variables
		int choix = 0;
		char reponse = ' ' ;
		double n = 0;
		double f, c;
		// Appelle de la classe Scanner
		Scanner sc = new Scanner (System.in);
		// Utilisation des boucles et condition
		do {
				System.out.println("Bonjour, Bienvenue dans le programme de conversion en degré Celsius ou en degré Fahrenheit \n" +
				                   "------------------------------------------------------------------------------------------ \n"			
						           + "Choisissez le mode de conversion : \n"+ "\n" + "1 - Conversion du degré Fahrenheit en degré Celsius \n" + 
						           "2 - Conversion du degré Celsius en degré Fahrenheit \n");
				
				choix =lireInt(sc, "Votre choix : ");
				
				while (choix < 1 || choix > 2) {
					
					choix =lireInt(sc, "Le mode choisit est invalide. Entrez 1 ou 2 : ");
							
				}
				
				n = liredouble(sc,"Saisissez la température à convertir : \n");
				
						switch (choix) {
						
								case 1 :
									
									c = ((n - 32.0) * 5.0) / 9.0 ;
									
									System.out.println("La conversion de " + n + " °F" + " en degré Celsius est : " + c + " °C");
										break;
								case 2 : 
									
									f = ((9.0 / 5.0) * n) + 32.0 ;
									
									System.out.println("La conversion de " + n + " °C" + " en degré Fahrenheit est : " + f + " °F");
										break;
								default :
									System.out.println("Vous n'avez pas effectué le bon choix");
										
						}
				
					do {
						reponse = ' ';
						System.out.println("Voulez convertir une autre valeur ? O/N : ");
						String ligne = sc.nextLine().trim().toUpperCase(); // .trim() pour les espaces et .toUpperCase pour les lettres majuscules ou miniscules
						if (!ligne.isEmpty()) reponse = ligne.charAt(0);
					} while (reponse != 'O' && reponse !='N'); // Boucle while pour l'exigence de la reponse de l'utilisateur
				
		} while (reponse == 'O');
		
		
		
		System.out.println("Au revoir à bientôt...");
		
		sc.close();
	}
	
	static int lireInt (Scanner sc, String message) {
		
		System.out.print(message);
		
		while (!sc.hasNextInt()) {
			
			sc.nextLine();
			
			System.out.print("Saisie invalide. \n" + message);
			
		}
		
		int v = sc.nextInt();
		
		sc.nextLine();
		
		return v;
	}
	
	static double liredouble (Scanner sc, String message) {
			
			System.out.print(message);
			
			while (!sc.hasNextDouble()) {
				
				sc.nextLine();
				
				System.out.print("Saisie invalide. \n" + message);
				
			}
			
			double v = sc.nextDouble();
			
			sc.nextLine();
			
			return v;
		}

}
