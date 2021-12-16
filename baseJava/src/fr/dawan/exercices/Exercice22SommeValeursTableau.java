package fr.dawan.exercices;

import java.util.Scanner;

public class Exercice22SommeValeursTableau {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer 5 nombres au clavier");
		
		int[] tab = new int[5];
		int somme = 0;
		
		for(int i=0; i<5; i++) {
			int n = clavier.nextInt();
			tab[i]=n;
			somme += n;
		}
		
		for( int valeurs : tab) {
		System.out.print(valeurs + "  ");
		}
		
		System.out.println("\n La Somme des élements du tableau est égale à : " + somme);
		
		
	}

}
