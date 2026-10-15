package projet1;

import java.util.*;

public class Boucle {
	public static void main (String [] args) {
		//int a = 1, b = 15;
		
		String nom = null;
		char reponse = 'O';
		int resultat = 0;
		Scanner sc = new Scanner (System.in);
		while (reponse == 'O') {
			System.out.print("Ecris ton nom : ");
			nom = sc.nextLine();
			System.out.println("Ecris un nombre : ");
			int n1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Ecris un deuxième nombre : ");
			int n2 = sc.nextInt();
			sc.nextLine();
			resultat = (n1 < n2 ) ? n1 * 45 : n2 * 100;
			System.out.println("Bonjour " + nom + "\n" + resultat);
			reponse = ' ';
			while (reponse != 'O' && reponse != 'N') {
				System.out.println("Veux-tu recommencer ? O/N");
				String ligne = sc.nextLine().trim();
				if (!ligne.isEmpty())reponse = ligne.charAt(0);
			}
		}
		
		System.out.println("Au revoir " + nom);
		/**while (a++ < b) {
			System.out.println("Tu es un crack !!!" + a);
			
		}**/
	}
	
}
