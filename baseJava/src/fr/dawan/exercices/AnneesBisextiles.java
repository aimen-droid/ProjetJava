package fr.dawan.exercices;

import java.util.Scanner;

public class AnneesBisextiles {

	public static void main(String[] args) {
		
		Scanner clavier =new Scanner(System.in);
		int annee = 0;
		
		System.out.println("Veuillez saisir une année au clavier pour savoir si elle est bisextile");
		
		annee = clavier.nextInt();
		int x=4;
		
		// condition prof : --->  (annee %4==0)&&(annee%100 !=0) || (annee%400=0)
		
		
		
		// On prend en référence la dernière année bisextile qui est 2020
		if((2020 - annee)%x==0) {
				System.out.println(annee + " est une année bisextile." );
		
		} else {
			System.out.println(annee + " n'est pas une année bisextile." );
		}
		
		

	}

}
