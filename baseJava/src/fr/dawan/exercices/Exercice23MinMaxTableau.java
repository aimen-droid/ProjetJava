package fr.dawan.exercices;

import java.util.Scanner;

public class Exercice23MinMaxTableau {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer 5 nombres au clavier");
		
		int[] tab = new int[5];
		int max = 0;
		int min = 0;
		
		for(int i=0; i<5; i++) {
			int n = clavier.nextInt();
			tab[i]=n;
			min=tab[0];
			if(max<tab[i]) {
				max=tab[i];
			}
			if(min>tab[i]) {
				min=tab[i];
			}
		}
		
		for(int i=0; i<5; i++) {
			
		}
		
		for( int valeurs : tab) {
			//if
		System.out.print(valeurs + "  ");
		}
		System.err.println("\n Le Maximum des valeurs du tableau est : " + max);
		System.err.println("\n Le Minimum des valeurs du tableau est : " + min);
	}

}
