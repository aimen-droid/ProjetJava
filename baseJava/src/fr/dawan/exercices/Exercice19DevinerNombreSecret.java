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
		System.out.println("Veuillez saisir un nombre entre 0 et 1000 pour deviner le nombre aléatoire de l'ordi ");
		number = clavier.nextInt();
		
		
		if(0 < number && number< 1000) {
			if(number < nb) {
				System.out.println("Le nombre à deviner est supérieur à " + number);
			} else if (number> nb){
				System.out.println("Le nombre à deviner est inférieur à " + number);
			} else {
				System.out.println(" Le nombre a été trouvé en " + j + " tentatives.");
			}
		}
		j++;
		
		}
		
		
	}

}
