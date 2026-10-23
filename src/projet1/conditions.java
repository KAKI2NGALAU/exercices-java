package projet1;

import java.util.*;
public class conditions {
		public static void main (String [] args) {
			Scanner sc= new Scanner (System.in);
			/**System.out.println("Ecris un nombre : ");
			int i = sc.nextInt();
			if (i > 50 && i < 100)
				System.out.println(i + " est dans l'intervalle");
			else
				System.out.println(i + " n'est pas dans l'intervalle");
			System.out.println("Quelle est ta note ? ");
			int note = sc.nextInt();
			switch (note) {
				case (0) :
				System.out.println("Oza vrai zoba !!!");
				break;
				case (10) :
					System.out.println("Pas mal continue comme ça ! ");
				break;
				case (20) :
					System.out.println("El Genito !");
				break;
				default :
					System.out.println("Courage");
			}**/
			
			System.out.println("Ecris un nombre : ");
			int n1 = sc.nextInt();
			System.out.println("Ecris encore un autre nombre");
			int n2 = sc.nextInt();
			int min = (n1 > n2) ? n1 * 3 : n2 * 5;
			int maxi = (n1 < n2) ? ((n2 < 4 ) ? n2 % 2 : n2 + 20)  : n1*5;
			System.out.println("La valeur minimal est : " + min + " et la valeur maximal est : " + maxi );
			
			sc.close();
		}
		
}
