package fr.dawan.exercices;

import java.util.Scanner;

public class SommeMoyennePourcentage {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		double mat1,mat2,mat3,mat4,mat5;
		double total, moyenne, pourcentage;
		
		// Fournir les donn�es
		System.out.println("Saisir la premi�re note: ");
		mat1 = clavier.nextDouble();
		
		System.out.println("Saisir la deuxi�me note: ");
		mat2 = clavier.nextDouble();
		
		System.out.println("Saisir la troisi�me note: ");
		mat3 = clavier.nextDouble();
		
		System.out.println("Saisir la quatri�me note: ");
		mat4 = clavier.nextDouble();
		
		System.out.println("Saisir la cinqui�me note: ");
		mat5 = clavier.nextDouble();
		
		// Calculer le total
		total = mat1 + mat2 + mat3 + mat4 + mat5;
		moyenne = total/5;
		
		pourcentage = (total/500)*100;
		
		// Afficher le r�sultat
		System.out.println(" Le Total des notes est : " + total);
		System.out.println(" La Moyenne des notes est : " + moyenne);
		System.out.println(" Le Pourcentage des notes est : " + pourcentage + "%");
		
		

	}

}
