package fr.dawan.tableauxstatique;

import java.util.Scanner;

public class TableauUtilite {
	
	/*
	 * Nous verrons les tableaux statiques et les tableaux dynamiques ( collections )
	 * 
	 * - Un tableau statique a une taille fixe . On ne peut pas la modifier une fois déclaréé
	 * 
	 * - Un tableau dynamique nous permet de créer des tableaux de taille dynamique
	 * 		Nous pouons augmenter et diminuer sa taille
	 * 		Ces tableaux ne peuvent contenir que des références vers des Objets
	 * 
	 * L'alternative aux tableaux statiques sont les tableaux dynamiques
	 */
	
	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int age1,age2;
		double moyenne;
		
		System.out.println("Entrer l'âge de l'utilisateur 1 :");
		age1 = clavier.nextInt();
		System.out.println("Entrer l'âge de l'utilisateur 2 :");
		age2 = clavier.nextInt();
		
		moyenne = (age1+age2)/2;
		System.out.println("La moyenne d'âge est " + moyenne);
		
		
		/*
		 * Si on a une quantité importante de données ( ex : 27 utilisateurs
		 * il va falloir déclarer 27 variables, ce qui est trop long, illisible et une perte de temps
		 * pour résoudre ce problème, on va utiliser les tableaux qui permettent de stocker des élements du même type
		 * Ex : on peut stocker un tableau d'entiers, un tableau de chaines de caractères,etc
		 */

	}

}
