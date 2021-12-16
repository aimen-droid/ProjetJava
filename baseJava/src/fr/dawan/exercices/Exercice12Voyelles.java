package fr.dawan.exercices;

import java.util.Scanner;

// liste des voyelles :  a	e	i	o	u


public class Exercice12Voyelles {

	public static void main(String[] args) {
		
		Scanner clavier =new Scanner(System.in);
		
		System.out.println("Entrer une lettre au clavier pour savoir si c'est une voyelle ou une consonne");
		
		String lettre = clavier.next();
		//System.out.println(lettre);
		
		if(lettre.equals("a") || lettre.equals("e") || lettre.equals("i") || lettre.equals("o") || lettre.equals("u")) {
			System.out.println("La lettre " + lettre + " est une voyelle.");
		} else {
			System.out.println("La lettre " + lettre + " est une consonne.");
		}
	}

}
