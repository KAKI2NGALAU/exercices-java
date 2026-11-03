package poo;


	public class Ville { // La classe ville qui définit les types
		
		protected String nomVille ;
		
		protected String nomPays ;
		
		protected int nbrHabitants ;
		
		protected char categorie;

			public Ville () { // Constructeur par défaut
				
				System.out.println("Création d'une ville");
				
				nomVille = "Goma"; 
				
				nomPays = "RDC";
				
				nbrHabitants = 350_000;
				
				this.setCategorie();
				
			}
			public Ville (String pNom, int pNbr, String pPays) { // Constructeur avec des paramètres
				
				System.out.println ("Création d'une ville avec des paramètres");
				
				nomVille = pNom;
				nomPays = pPays;
				nbrHabitants = pNbr;
				this.setCategorie();
				
				
			}
			
			public String getNomVille () { // Getter, retourne le nom de la ville
				
				return nomVille;
			}
			
			public String getNomPays () { // Getter, retourne le nom du pays
				
				return nomPays;
				
			}
			public int getNbrHabitants () { // Getter, retourne le nombre des habitants
				
				return nbrHabitants;
				
			}
			public char getCategorie () { // Getter, retourne la categorie
				
				return categorie;
				
			}
			
			public void setNomVille (String pNom) { // Setter, Définit le nom de la ville
				
				nomVille =pNom;
				
			}
			
			public void setNomPays (String pPays) { // Setter, Définit le nom du pays
				
				nomPays = pPays;
				
			}
			
			public void setNbrHabitants (int pNbr) { // Setter, Définit le nombre d'habitants
				
				nbrHabitants = pNbr;
				this.setCategorie();
				
			}
			private void setCategorie() { // Création de la méthode privée setCategorie 
				
				int [] bornesSuperieurs = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
				
				     char [] categories = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
				
				int i = 0;
				
				while (i < bornesSuperieurs.length && this.nbrHabitants >= bornesSuperieurs[i]) {
					i++;
				}
				this.categorie = categories[i];
			}
			// Permets une description de la ville souhaitait
			public String decrisToi () {
				
				return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte " + this.nbrHabitants
						+ " d'habitants" + ", elle est de catégorie " + this.categorie;
			}
			 // Création d'une méthode comparaison
			// Retourne une chaîne de caractère par rapport au résultat de la comparaison
			
			public String  comparaison(Ville comparer) {
				
				String str = new String ();
				
				if (comparer.nbrHabitants > this.nbrHabitants)
					System.out.println("\t" + comparer.nomVille + " a plus d'habitants que "+ this.nomVille);
				else
					System.out.println("\t" + comparer.nomVille + " a moins d'habitants que "+ this.nomVille);
				
				
				return str;
				
			}
			public String toString () {
				return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte " + this.nbrHabitants
						+ " d'habitants" + ", elle est de catégorie " + this.categorie;
			}
			
	}
	// Classe Capitale, fille de Ville
	class Capitale extends Ville {
		
		private String monument;
		// Constructeur par défaut 
		public Capitale () {
			
			super();
			monument = " aucun";
		}
		// Constructeur avec paramètres 
		public Capitale (String nom, int hab, String pays, String monument) {
			
			super (nom, hab, pays);
			
			this.monument = monument;
		}
		
		public String getMonument () { // Getter, retourne la valeur du monument, attribut de la Classe fille Capitale
			
			return monument;
		}
		
		public void setMonument (String monument) { // Setter, définit la valeur Monument, attribut de la Classe fille Capitale
			
			this.monument = monument;
		}
		
		public String decrisToi () { // Description de la Capitale
			String str = super.decrisToi() + "\n \t ==>>" + this.monument + " en est un monument";
			System.out.println("Invocation de super.decrisToi()");
			
			return str;
		}
		
		public String toString () {
			String str = super.decrisToi() + "\n \t ==>>" + this.monument + " en est un monument";
			System.out.println("Invocation de super.decrisToi()");
			
			return str;
		}
		
		
	}
			

