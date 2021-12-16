package fr.dawan.tableauxstatique;

import java.util.Scanner;

public class TableauUtilite {
	
	/*
	 * Nous verrons les tableaux statiques et les tableaux dynamiques ( collections )
	 * 
	 * - Un tableau statique a une taille fixe . On ne peut pas la modifier une fois d�clar��
	 * 
	 * - Un tableau dynamique nous permet de cr�er des tableaux de taille dynamique
	 * 		Nous pouons augmenter et diminuer sa taille
	 * 		Ces tableaux ne peuvent contenir que des r�f�rences vers des Objets
	 * 
	 * L'alternative aux tableaux statiques sont les tableaux dynamiques
	 */
	
	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int age1,age2;
		double moyenne;
		
		System.out.println("Entrer l'�ge de l'utilisateur 1 :");
		age1 = clavier.nextInt();
		System.out.println("Entrer l'�ge de l'utilisateur 2 :");
		age2 = clavier.nextInt();
		
		moyenne = (age1+age2)/2;
		System.out.println("La moyenne d'�ge est " + moyenne);
		
		
		/*
		 * Si on a une quantit� importante de donn�es ( ex : 27 utilisateurs
		 * il va falloir d�clarer 27 variables, ce qui est trop long, illisible et une perte de temps
		 * pour r�soudre ce probl�me, on va utiliser les tableaux qui permettent de stocker des �lements du m�me type
		 * Ex : on peut stocker un tableau d'entiers, un tableau de chaines de caract�res,etc
		 */

	}

}
