package fr.dawan.tableauxstatique;

public class IterationSurTableau {

	public static void main(String[] args) {
		
		
		int[] tab = {200, 330, 50};
		double[] tab2 = {25.8, 6.54, 100.01, 91.1};
		
		/*
		 * Méthode 1 : Boucle For classique
		 */
		
		for(int i=0; i<3;i++) {
			System.out.println("Element à la position " + i + ": " + tab[i]);
		}
		
		// Taille tableau
		System.out.println("\nTaille du tableau tab : " + tab.length + "\n");
		for(int i=0; i<tab.length;i++) {
			System.out.println("Element à la position " + i + ": " + tab[i]);
		}
		
		
		/*
		 * Méthode : Boucle forEach
		 * iteration sur un ensemble de valeurs
		 * Pour chaque element présent au niveau de mon tableau (tab2), j'affiche cet élement
		 */
		
		System.out.println("Boucle foreach : Iteration sur un ensemble de valeurs");
		for(double element : tab2) {
			System.out.println(element);
		}
		
		
		
		

	}

}
