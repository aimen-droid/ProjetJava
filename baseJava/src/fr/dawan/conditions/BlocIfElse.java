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
			System.out.println("Le nombre est égal à zéro");
		} else if ((Math.pow(nbre, 2)==25)){
			System.out.println("Le nombre est égal à -5");
		}
		
		else {
			System.out.println("Le nombre est négatif");
		}
		
		/*
		 * Pour vérifier les conditions , java propose plusieurs opérateurs de comparaison
		 * > Permet de vérifier si un nombre est supérieur à un autre
		 * < Permet de vérifier si un nombre est inférieur à un autre
		 * == Pour vérifier l'égalité entre deux nombres
		 * != (différent) pour vérifier si un nombre est différent d'un autre
		 * <= pour vérifier si un nombre est inférieur ou égal à un autre
		 * >= pour vérifier si un nombre est supérieur ou égal à un autre
		 */
		
		
		
		
	}

}
