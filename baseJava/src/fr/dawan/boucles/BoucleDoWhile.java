package fr.dawan.boucles;

import java.util.Scanner;

public class BoucleDoWhile {
	
	/*
	 * Do-WHILE :
	 * Permet de répéter des instructions tant qu'une condition n'est pas vérifiée
	 * Comme la condition est testée à la fin, on est sûrs de passer dans le bloc d'instructions au moins 1 fois
	 */

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		int age=0;
		
		do {
			System.out.println("Entrer votre age : ");
			age = clavier.nextInt();
		}while (age<=0);
		
		
		System.out.println("Vous avez " + age + " ans.");
		
		/*
		 * Conclusion : 
		 * Contrairement à la boucle for, on ne connait pas le nombre de fois que ce bloc d'instructions sera éxécuté
		 * Si vous connaissez le nombre d'itérations il est préférable d'utiliser une boucle FOR
		 */

	}

}
