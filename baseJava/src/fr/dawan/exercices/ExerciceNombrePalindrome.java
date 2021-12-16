package fr.dawan.exercices;

import java.util.Scanner;

public class ExerciceNombrePalindrome {

	public static void main(String[] args) {
		
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un nombre à 4 chiffres au clavier");
		
		int n = clavier.nextInt();
		
		int nbreMilliers = n/1000;
		int resteMilliers = n%1000;
		int nbreCentaines = resteMilliers/100;
		int resteCentaines = resteMilliers%100;
		int nbreDizaines = resteCentaines/10;
		int unites = resteCentaines%10;
		
		
		if((nbreMilliers == unites) && (nbreCentaines == nbreDizaines)) {
		System.out.println("Le nombre " + n + " est un palindrome.");
		} else {
			System.out.println("Le nombre " + n + " n'est pas un palindrome.");
		}
	}

}
