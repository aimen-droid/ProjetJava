package fr.dawan.tableauxstatique;

public class DeclarationEtInitialisaitonTableau {

	public static void main(String[] args) {
		
		/*
		 *  D�claration et initialisation : M�thode 1
		 *  
		 *  Si on connait les diff�rents �lements du tableau, mieux vaut utiliser cette m�thode
		 */
		
		int[] tab1; // d�claration du tableau
		int[] tab2 = {12, 38, 4, 98, 78}; // d�claration et initialisation
		
		// tab2 contient l'aresse du tableua
		System.out.println(tab2);
		System.out.println(tab2[0]);
		System.out.println(tab2[0] + tab2[1]);
		
//		for(int valeurs : tab2) {
//			System.out.print(valeurs + ", ");
//		}
		
		
		/*
		 * D�claration de tableau : M�thode 2
		 */
		
		int[] tab = new int[4];
		System.out.println(tab[1]);
		
		tab[0]=30;
		tab[1]=5;
		
		System.out.println(tab[0] + tab[2]); // affiche 30
		
		
	}

}
