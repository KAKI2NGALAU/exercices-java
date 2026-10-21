/** Exercie d'une calculatrice interactive.
 * 
 * Le programme reprend les grandes ligne du premier chapitre du livre Zest de savoir.
 * 
 * On y retrouve les variables, les saisies de clavier, les boucles, les conditions, les méthodes. **/

package projet1;

import java.util.*;

public class Calculatrice_interactive {
	
	public static void main (String[] args) {
		
		// Déclarations des variables
		Scanner sc = new Scanner(System.in);
		
		double a, b; int choix = 0; double r = 0; 
		
		
		do {
			
			System.out.println("=== Calculatrice === \n");
			
			System.out.println(" 1. Addition \n 2. Soustraction \n 3. Multiplication \n 4. Division \n 5. Quitter \n");
			
			
			choix = lireInt(sc,"Votre choix : "); // Appelle de la méthode lireInt pour les valeurs entières
			
			while (choix < 1 || choix > 5 ) { //Boucle de choix
								
				choix = lireInt(sc,"Le choix effectué est incorrect. Faites le choix entre 1 et 5 : ");
				
			}
			
				if (choix == 5)  // Condition pour quitter le programme
					break;
				
				a = liredouble(sc,"Premier nombre : "); // Appelle de la méthode liredouble pour les valeurs flottantes
				
				b = liredouble(sc,"Deuxième nombre : ");
				
				switch (choix) { // condition switch pour les opérations arithmétiques
				
				case 1 : 
					
					System.out.print("Le résultat est : " + (r=a+b) + "\n");
					break;				
				case 2 :
					System.out.println("Le résultat est : " + (r=a-b) + "\n");
					break;
				case 3 : 
					System.out.println("Le résultat est : " + (r=a*b) + "\n");
					break;
				case 4 :
					
					while (b==0) { // Condition obligéant la valeur b à être non null
						
						
						b = liredouble(sc,"le deuxième nombre doit être différent de zéro, recommencer !!! Deuxième nombre : ");
						
					}
					System.out.println("Le résultat est : " + (r=a/b) + "\n");
					
					break;
				
					
				}

			
		     }  while (choix !=5);
			
		
			System.out.println("Au revoir");
			sc.close();

	}
		/** Création de deux méthodes pour lireInt et liredouble pour prevenir une saisie alphabétique invaalide dans un champ int ou double
		 * 
		 *  
		 *  Le code devient ainsi plus dégagé et simple à lire**/
	
	
		static int lireInt(Scanner sc, String message) {
			
			System.out.print(message);
			
			while (!sc.hasNextInt()) {
				
			sc.nextLine();
			
			System.out.print("Saisie invalide. \n" + message);
			}
			
			int valeur = sc.nextInt();
			sc.nextLine();
			
			return valeur;
		}
		
		static double liredouble(Scanner sc, String message) {
			
			System.out.print(message);

			while (!sc.hasNextDouble()) {
				
				sc.nextLine();
				
				System.out.print("Saisie invalide. \n" + message);
				
			}
			
			double valeur = sc.nextDouble();
			sc.nextLine();
			
			return valeur;
		}
							
				
		
			
	}


