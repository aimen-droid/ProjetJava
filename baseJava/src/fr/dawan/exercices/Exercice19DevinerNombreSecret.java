package fr.dawan.exercices;

import java.util.Random;
import java.util.Scanner;

public class Exercice19DevinerNombreSecret {

	public static void main(String[] args) {
		
		Random random = new Random();
		int nb;
		nb = random.nextInt(1000);
		//System.out.println(nb);
		
		Scanner clavier =new Scanner(System.in);
		int number=0;
		int j=0;
		
		while(number!=nb){
		System.out.println("Veuillez saisir un nombre entre 0 et 1000 pour deviner le nombre al�atoire de l'ordi ");
		number = clavier.nextInt();
		
		
		if(0 < number && number< 1000) {
			if(number < nb) {
				System.out.println("Le nombre � deviner est sup�rieur � " + number);
			} else if (number> nb){
				System.out.println("Le nombre � deviner est inf�rieur � " + number);
			} else {
				System.out.println(" Le nombre a �t� trouv� en " + j + " tentatives.");
			}
		}
		j++;
		
		}
		
		
	}

}
