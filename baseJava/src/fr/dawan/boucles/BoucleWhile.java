package fr.dawan.boucles;

import java.util.Scanner;

// Voir Framadap pour définition

public class BoucleWhile {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		int age =0;
		
		while(age<=0) {
			System.out.println("Entrez votre age : ");
			age = clavier.nextInt();
			if(age<=0) {
				System.out.println("L'âge doit être positif");
			}
		}
		
		System.out.println("Vous avez " + age + " ans.");
		
		

	}

}
