/** Petit excercice sur le tableau en Java tiré du livre Zest de Savoir
 * 
 * 
 * L'obejectif est de déterminer si l'utilisateur a saisi une donnée se retrouvant dans le tableau
 * 
 * 
 * Les boucles do...while, while sont très soliciter
 * 
 * Bien évidemment la résoltion ne correspond pas du tout au livre pour ceux qui auront la curiosité de vérifier**/

package projet1;

import java.util.*;

public class Tableau {
	public static void main (String [] args) {

		int a = 0;
		char lettres [] = {'r', 'u','b','e','n','k','a','w','i','c','m','g','f','s'};
		char l = ' ';
		char reponse = ' ';
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Bonjour, Bienvenue dans notre programmme \n" +
                            "---------------------------------------- \n");	
		
		do { // Boucle principale 
			
			do { // Seconde boucle pour conditionner l'utilisateur à saisier correctement la lettre
				
				a = 0;
				
				System.out.print("Saisissez une lettre en miniscule : ");
				
				// Empêche le crash du programme si l'utilisateur saisit la touche "Enter"
				// Mais reste incorrect dans la forme
				String lett = sc.nextLine().trim();
				if (!lett.isEmpty())l = lett.charAt(0);
				
				// Cette boucle effectue une recherche dans le tableau
				
				while (a < lettres.length && l != lettres[a])
					a++;
				
				if (a < lettres.length )
					
					System.out.println("La lettre " + l + " saisie est dans la programme");
				
				else 
					System.out.println("La lettre " + l + " saisie n'est pas dans le programme");
				
			} while (a >= lettres.length);
			
			// Tant que la lettre de l'utilisateur ne correspond pas une du tableau lettres
			
			do {
				
				reponse = ' ';
				
				System.out.println("Voulez-vous ressayer ? O/N : ");
				
				// toUpperCase permet de prendre même le caractère en majuscule ou miniscule 
				// Empêche un crash si l'utilisateur saisi la touche "Enter" entraînant un champ vide
				
				String ligne = sc.nextLine().trim().toUpperCase(); 
				
				if (!ligne.isEmpty())reponse = ligne.charAt(0);
				
			} while (reponse != 'O' && reponse != 'N');
				
		} while (reponse == 'O');
		
		System.out.println("Au revoir et à la prochaiine :) ");
	}
}
