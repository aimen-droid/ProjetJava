package fr.dawan.exercices;

import java.util.Scanner;

public class ExerciceFactoriel {

	public static void main(String[] args) {
	
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un nombre à 4 chiffres au clavier");
		
		int n = clavier.nextInt();
		
		System.out.println("Nombres Factoriels de " + n);
		for(int i = 1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}

	}

}
