package fr.dawan.boucles;

import java.util.Scanner;

// Voir Framadap pour d�finition

public class BoucleWhile {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		int age =0;
		
		while(age<=0) {
			System.out.println("Entrez votre age : ");
			age = clavier.nextInt();
			if(age<=0) {
				System.out.println("L'�ge doit �tre positif");
			}
		}
		
		System.out.println("Vous avez " + age + " ans.");
		
		

	}

}
