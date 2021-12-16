package fr.dawan.tableauxstatique;

public class DeclarationEtInitialisaitonTableau {

	public static void main(String[] args) {
		
		/*
		 *  Déclaration et initialisation : Méthode 1
		 *  
		 *  Si on connait les différents élements du tableau, mieux vaut utiliser cette méthode
		 */
		
		int[] tab1; // déclaration du tableau
		int[] tab2 = {12, 38, 4, 98, 78}; // déclaration et initialisation
		
		// tab2 contient l'aresse du tableua
		System.out.println(tab2);
		System.out.println(tab2[0]);
		System.out.println(tab2[0] + tab2[1]);
		
//		for(int valeurs : tab2) {
//			System.out.print(valeurs + ", ");
//		}
		
		
		/*
		 * Déclaration de tableau : Méthode 2
		 */
		
		int[] tab = new int[4];
		System.out.println(tab[1]);
		
		tab[0]=30;
		tab[1]=5;
		
		System.out.println(tab[0] + tab[2]); // affiche 30
		
		
	}

}
