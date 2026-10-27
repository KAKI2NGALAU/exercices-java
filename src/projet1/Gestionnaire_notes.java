// Toujours dans le cadre de bien maîtriser le premier chapitre, voici un exercice sur la gestion des notes

//Nous avons un tableau qui récupère le nombre d'étudiants et les notes de ces derniers

//Ensuite nous avons comme retour la moyenne, le nombre de réussite, le pourcentage de réussite, la note maximale et le note minimale

// Et enfin des méthodes qui permettent de dégager le main

package projet1;

import java.util.*;

public class Gestionnaire_notes {
	
static int lireInt (Scanner sc, String message) { // Méthode pour les entrées int
		
		System.out.print(message);
		
		while (!sc.hasNextInt()) {
			
			sc.nextLine();
			
			System.out.print("Saisie invalide. \n" + message);
			
		}
		int v = sc.nextInt();
		sc.nextLine();
		
		return v;
	}

	static double noteMax (double[] tab) { // Méthode pour la note maximale
		
		double max = tab[0];
		
		for (int i = 1; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		
		return max;
	}
	
	static double lireDouble(Scanner sc, String message) { // Méthode pour les entrées double
		
		System.out.print(message);
		
		while (!sc.hasNextDouble()) {
			
			sc.nextLine();
			
			System.out.print("Saisie invalide. \n" + message);
			
		}
		
		double v = sc.nextDouble();
		sc.nextLine();
		
		return v;
	}
   static double noteMin (double[] tab) { // Méthode pour la note minimale
		
		double min = tab[0];
		
		for (int i = 1; i < tab.length; i++) {
			if (tab[i] < min) {
				min = tab[i];
			}
		}
		
		return min;
	}
	
	static double moyenne(double[] tab) { // Méthode pour la moyenne 
		
		double somme = 0;
		
		for (int i = 0; i < tab.length; i++) {
			
			somme += tab[i];
			
		}
		
		return somme/tab.length;
		
	}
	
	static int nombreReussite(double[] tab) { // Méthode pour le nombre de réussites
		int compteur = 0;
		for (int i = 0; i < tab.length; i++) {
		if (tab[i] >= 10) {
			 compteur++;
           }
		}
		
		return compteur;
	  }

		
	
	public static void  main (String [] args) {
		
		char reponse = ' ';
		Scanner sc = new Scanner (System.in);
	  do { // Boucle principale
		
		int nbrEleve = lireInt(sc,"Entrez le nombre d'élève : "); // Appelle de la méthode lireInt
		
		while(nbrEleve < 1) {
			
			nbrEleve = lireInt(sc,"Le nombre d'élève doit être supérieur à zéro.\nEntrez le nombre d'élève : ");
		}
		
		double[] tabNotes = new double[nbrEleve];
		
		for (int i = 0; i < tabNotes.length; i++) {
		
			tabNotes[i] = lireDouble (sc,"Note de l'élève " + (i + 1) + " : "); // Appelle de la méthode lireDouble
		
		}
		int reussite = nombreReussite(tabNotes); // Initialisation et appelle de la méthode nombreReussite
		System.out.println("La moyenne de la classe est de : " + moyenne(tabNotes));
		System.out.println("Le nombre de réussite est de : " + reussite 
		+ " , soit " + ((double) reussite / tabNotes.length*100) + "%" ); // Calcul pourcentage réussite
		System.out.println("La note maximale est de : " + noteMax(tabNotes));
		System.out.println("La note minimale est de : " + noteMin(tabNotes));

		sc.close();
		do { // Boucle sécondaire pour recommencer ou non le programme
			reponse = ' ';
			System.out.println("Voulez-vous ressayer ? O/N : ");
			String ligne = sc.nextLine().trim().toUpperCase(); // Empêche le crash si l'utilisateur tape Enter, toUpper ramène le caractère en majuscule
			if (!ligne.isEmpty()) reponse = ligne.charAt(0); break;
			
		}while (reponse != 'O' || reponse != 'N' ); // Tant que réponse différent de O ou N
		
	  } while  (reponse == 'O'); // Tant que la réponse est O
		
	   System.out.println("Au revoir...");
	}

}
