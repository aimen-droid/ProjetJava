package fr.dawan.exercices;

import java.util.Scanner;

public class ExercicePremierDernierChiffre {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un nombre à 4 chiffres au clavier");
		
		int n = clavier.nextInt();
		
		int nbreMilliers = n/1000;
		int resteMilliers = n%1000;
		int resteCentaines = resteMilliers%100;
		int unites = resteCentaines%10;
		
		System.out.println("Premier chiffre = " + nbreMilliers);
		System.out.println("Dernier chiffre = " + unites);
	}

}
