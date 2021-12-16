package fr.dawan.exercices;

import java.util.Scanner;

public class Exercie11Calculatrice {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("La Calculatrice est prête. ");
		System.out.println("Tapez le choix de l'opération à exécuter : ");
		System.out.println("1 --> pour addition");
		System.out.println("2 --> pour soustraction\"");
		System.out.println("3 --> pour multiplication\"");
		System.out.println("4 --> pour division\"");
		
		int operation = clavier.nextInt();
		int a = 0;
		int b = 0;
		
		System.out.println("Entrez les deux nombres requis pour l'opération :");
		a = clavier.nextInt();
		b = clavier.nextInt();
		
		switch(operation) {
		
		case 1 :
			somme(a,b);
			break;
		case 2 :
			soustraction(a,b);
			break;
		case 3 :
			multiplication(a,b);
			break;
		case 4 :
			division(a,b);
			break;
		default :
			break;
		}
	}

	static void somme(int a, int b) {
		 System.out.println("La somme des deux nombres est : " +  (a+b));
	}
	
	static void soustraction(int a, int b) {
		System.out.println("La soustraction des deux nombres est : " +  (a-b));
	}
	
	static void multiplication(int a, int b) {
		System.out.println("La multiplication des deux nombres est : " +  (a*b));
	}
	
	static void division(int a, int b) {
		System.out.println("La division des deux nombres est : " +  (a/b));
	}

	
	
}
