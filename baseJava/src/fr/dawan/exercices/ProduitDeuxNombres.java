package fr.dawan.exercices;

import java.util.Scanner;

public class ProduitDeuxNombres {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrer le premier nombre: ");
		double nbr1 = clavier.nextDouble();
		
		System.out.println("Entrer le 2ème nombre");
		double nbr2 = clavier.nextDouble();
		
		System.out.println(nbr1 + " x " + nbr2 + " = " + nbr1*nbr2);
		
	}

}
