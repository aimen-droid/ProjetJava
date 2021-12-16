package fr.dawan.exercices;

import java.util.Scanner;

public class Exercice24FrequenceNombreTableau {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer 5 nombres au clavier");
		
		int[] tab = new int[5];
		int max = 0;
		int min = 0;
		int valeurComparee = 0;
		int occurrence = 0;
		int[] occurrencesTab = new int[5];
		
		for(int i=0; i<5; i++) {
			int n = clavier.nextInt();
			tab[i]=n;
		}
		
		
		for(int i=0; i<5; i++) {
			valeurComparee= tab[i];
			for(int valeurs : tab) {
				if(valeurComparee==valeurs) {
					occurrence++;
				}
				occurrencesTab[i]=occurrence;
			}
		}
		
		for(int affichOccurrences : occurrencesTab) {
			System.out.println(affichOccurrences);
		}
		
		
	}

}
