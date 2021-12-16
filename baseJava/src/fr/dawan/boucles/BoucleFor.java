package fr.dawan.boucles;

public class BoucleFor {
	
	/*
	 * Le rôle des boucles est de répéter un certain nombre de fois les mêmes opérations
	 * Les boucles s'exécutent tant qu'une condition est remplie
	 */

	public static void main(String[] args) {
		
		
		/*
		 * Exemple1 : l'utilité des boucles
		 * 
		 * l'écriture est longue et fastidieuse, copier et coller
	*/
		
		System.out.println(" Le double de 1 est : " + 2*1);
		System.out.println(" Le double de 2 est : " + 2*2);
		System.out.println(" Le double de 3 est : " + 2*3);
		System.out.println(" Le double de 4 est : " + 2*4);
		System.out.println(" Le double de 5 est : " + 2*5);
		System.out.println(" Le double de 6 est : " + 2*6);
		System.out.println(" Le double de 7 est : " + 2*7);
		System.out.println(" Le double de 8 est : " + 2*8);
		System.out.println(" Le double de 9 est : " + 2*9);
		System.out.println(" Le double de 10 est : " + 2*10);
		
		/*
		 * 
		 * solution : utiliser les boucles ( for, while, do-while )
		 */
		
		for (int i =0; i<10;i++) {
			System.out.println("Le double de " + i + " est " + i*2);
		}
		
		
		

	}

}
