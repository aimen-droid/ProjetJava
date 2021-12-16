package fr.dawan.boucles;

import java.util.Scanner;

public class BoucleDoWhile {
	
	/*
	 * Do-WHILE :
	 * Permet de r�p�ter des instructions tant qu'une condition n'est pas v�rifi�e
	 * Comme la condition est test�e � la fin, on est s�rs de passer dans le bloc d'instructions au moins 1 fois
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
		 * Contrairement � la boucle for, on ne connait pas le nombre de fois que ce bloc d'instructions sera �x�cut�
		 * Si vous connaissez le nombre d'it�rations il est pr�f�rable d'utiliser une boucle FOR
		 */

	}

}
