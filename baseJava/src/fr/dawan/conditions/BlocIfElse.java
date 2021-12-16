package fr.dawan.conditions;

import java.util.Scanner;

public class BlocIfElse {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int nbre = 0;
		System.out.println("Entrer un nombre svp : ");
		
		nbre = clavier.nextInt();
		
		/*
		 * Expression d'un test conditionnel
		 * Si (Condition est vraie )
		 * 		instructions;
		 * Sinon
		 * 		d'autres instructions;
		 * 
		 */
		
		if (nbre > 0) {
			System.out.println("Le nombre est positif");
		} else if (nbre==0){
			System.out.println("Le nombre est �gal � z�ro");
		} else if ((Math.pow(nbre, 2)==25)){
			System.out.println("Le nombre est �gal � -5");
		}
		
		else {
			System.out.println("Le nombre est n�gatif");
		}
		
		/*
		 * Pour v�rifier les conditions , java propose plusieurs op�rateurs de comparaison
		 * > Permet de v�rifier si un nombre est sup�rieur � un autre
		 * < Permet de v�rifier si un nombre est inf�rieur � un autre
		 * == Pour v�rifier l'�galit� entre deux nombres
		 * != (diff�rent) pour v�rifier si un nombre est diff�rent d'un autre
		 * <= pour v�rifier si un nombre est inf�rieur ou �gal � un autre
		 * >= pour v�rifier si un nombre est sup�rieur ou �gal � un autre
		 */
		
		
		
		
	}

}
