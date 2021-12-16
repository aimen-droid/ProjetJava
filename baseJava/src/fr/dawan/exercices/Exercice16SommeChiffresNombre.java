package fr.dawan.exercices;

import java.util.Scanner;

public class Exercice16SommeChiffresNombre {

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
		
		System.out.println("Somme des chiffres = " + (nbreMilliers + nbreCentaines + nbreDizaines + unites));

	}

}
