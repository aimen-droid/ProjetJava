package fr.dawan.exercices;

import java.util.Scanner;

public class Exerciice13NombresImpairs {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un nombre au clavier");
		
		int n = clavier.nextInt();
		
		System.out.println("Les nombres impairs jusqu'à " + n + "sont : ");
		
		for(int i=0; i<n+1;i++) {
			if(i%2!=0) {
			System.out.println(i);
			}
		}

	}

}
