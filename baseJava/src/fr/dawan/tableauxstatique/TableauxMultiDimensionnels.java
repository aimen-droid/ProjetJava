package fr.dawan.tableauxstatique;

public class TableauxMultiDimensionnels {

	public static void main(String[] args) {
		
		//int[] scores = {10, 20, 30};
		
		// Création d'un tableau à deux dimensions
		int[][] scores = new int[2][3];
		
		int[][] scores1 = {{5, 25, 72, 16, 98}, {90, 7, 30, 67, 29}};
		System.out.println(scores1[0][1]); // affiche 25
		System.out.println(scores1[1][3]); // affiche 67

		int[][] scores2 = new int[2][2];
		
		/*
		 * {{5, 12}, {54,27}}
		 */
		
		scores2[0][0] = 5; // 1er élement de la colonne 1
		scores2[0][1] = 12; // 2ème élement de la colonne 1
		scores2[1][0] = 54; // 1er élement de la colonne 2
		scores2[1][1] = 27; // 2ème élement de la colonne 2
		System.out.println("scores2[0][1] :" + scores2[0][1]);
		
	}

}
