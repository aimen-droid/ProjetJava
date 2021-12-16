package fr.dawan.conditions;

import java.util.Scanner;

public class OperateursLogiques {

	public static void main(String[] args) {
		
		/*
		 * Les opérateurs logiques s'appliquent sur les opérandes et produisent un 
		 * résultat qui est également booléen
		 * 
		 * Java comporte trois opérandes logiques, dont une unaire et deux binaires
		 * 
		 * A&&B est vraie (true) si A est vraie et B est vraie sinon c'est faux
		 * A||B est vraie si un des opérandes est vraie sinon faux
		 * !A ==> A est vraie alors !A est faux
		 * 
		 * 
		 * Table Logique
		 * 
		 * A	B	A&&B	A||B	!A
		 * v	v	v		v		f
		 * v	f	f		v		f	
		 * f	v	f		v		v
		 * f	f	f		f		v
		 * 
		 */
		
		Scanner clavier = new Scanner(System.in);
		
		// Test les opérateurs ET et OU
		int a,b,c;
		int nbre = 0; 	// Pour tester l'opérateur non (!)
		
		// Fournir les données
		System.out.println(" Entrer la valeur de a: ");
		a = clavier.nextInt();
		System.out.println(" Entrer la valeur de b: ");
		b = clavier.nextInt();
		System.out.println(" Entrer la valeur de c: ");
		c = clavier.nextInt();
		
		
		// Test OU : il faut qu'au moins une des deux conditions soit vraie
		if (a==b || b==c || a==c) {
			System.out.println(" Test OU : Deux valeurs, au moins, sont identiques");
		} else {
			System.out.println(" Test OU : Pas de valeurs identiques");
		}
		
		
		// Test ET : il faut que les deux conditions soient vraies
		if (a==b && b==c) {
			System.out.println(" Test ET : Toutes les valeurs sont identiques");
		} else {
			System.out.println(" Test ET : Les valeurs ne sont pas toutes identiques");
		}
		
		// oopérateur Non (!)
		System.out.println(" Test NON \"!\"");
		System.out.println("Entrer un nombre");
		nbre = clavier.nextInt();
		
		// Avec l'opérateur logique Non
		// !TRUE = FALSE
		// !FALSE = TRUE
		if(!(nbre>0)) {
			System.out.println("Le nombre entré est négatif");
		} else {
			System.out.println(" Le nombre est positif");
		}
		
	}

}
