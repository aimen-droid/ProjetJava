package fr.dawan.tableauxstatique;

public class TableauxMultiDimensionnelsIteration {

	public static void main(String[] args) {
		
		
		int[][] scores = {
				{5,25, 72, 16, 38},					// indice 0 ---premi�re ligne
				{90, 7, 30},						// indice 1 ---deuxi�me ligne
				{37, 97, 1, 52}						// indice 2 ---troisi�me ligne
		};
		
		// Premi�re Boucle parcourt les lignes
		for(int i =0, nbRows = scores.length; i< nbRows; i++) {
			// Deuxi�me Boucle parcourt les colonnes de chaque ligne
			for(int j=0, nbColumns = scores[i].length; j< nbColumns; j++) {
				System.out.println(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}


