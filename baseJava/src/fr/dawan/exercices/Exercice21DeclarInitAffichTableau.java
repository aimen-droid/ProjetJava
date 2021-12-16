package fr.dawan.exercices;

import java.util.Scanner;

public class Exercice21DeclarInitAffichTableau {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer 5 nombres au clavier");
		
		int[] tab = new int[5];
		
		for(int i=0; i<5; i++) {
			int n = clavier.nextInt();
			tab[i]=n;
		}
		
		for( int valeurs : tab) {
		System.out.print(valeurs + "  ");
		}

	}

}
