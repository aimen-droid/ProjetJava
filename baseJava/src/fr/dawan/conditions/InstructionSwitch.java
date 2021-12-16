package fr.dawan.conditions;

import java.util.Scanner;

public class InstructionSwitch {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		int jours = 7;
		
		// Fournir les données d'entrée
		System.out.println("Saisir le numéro du jour entre 1 et 7");
		jours = clavier.nextInt();
		
		/*
		 * Premier exemple utilisation du bloc if-else
		 */
		// Boucle if-else
//		if(jours==1) {
//			System.out.println("Lundi");
//		} else if (jours==2) {
//			System.out.println("Mardi");
//		} else if (jours==3) {
//			System.out.println("Mercredi");
//		} else if (jours==4) {
//			System.out.println("Jeudi");
//		} else if (jours==5) {
//			System.out.println("Vendredi");
//		} else if (jours==6) {
//			System.out.println("Samedi");
//		} else if (jours==7) {
//			System.out.println("Dimanche");
//		} else {
//			System.out.println("Entrée invalide ");
//		}
//		
		
		/*
		 * 2ème exemple : Instruction Switch
		 * Switch : variante du if- else if - else
		 * Pour une question de rapidité et de performance, le switch est préféré au bloc if-else
		 * 
		 * L'instruction switch est beaucoup plus rapide que l'instruction if else 
		 * 
		 * Avec l'instruction : 
		 * Au lieu d'évaluer chaque condition séquentiellement, il suffit de rechercher une fois l'expression 
		 * et de passer directementà la condition qui est vraie
		 * 
		 * L'expression est évaluée une fois dans le switch
		 * Le break; permet de sortir du switch quand un des cas est vérifié
		 * 
		 * Le Switch est utilisé lorsqu'on a des conditions " à la carte"
		 * 
		 */

		
//		switch (jours) {
//		
//		case 1 : 
//			System.out.println("Lundi");
//			break;
//		case 2 : 
//			System.out.println("Mardi");
//			break;
//		case 3 : 
//			System.out.println("Mercredi");
//			break;
//		case 4 : 
//			System.out.println("Jeudi");
//			break;
//		case 5 :
//			System.out.println("Vendredi");
//			break;
//		case 6 :
//			System.out.println("Samedi");
//			break;
//		case 7 : 
//			System.out.println("Dimanche");
//		default :
//			break;
//		
//		}
		
		
		switch (jours) {
		
		case 1 : 
		case 2 :
		case 3 : 
			System.out.println("Mercredi");
			break;
		case 4 : 
			System.out.println("Jeudi");
			break;
		case 5 :
			System.out.println("Vendredi");
			break;
		case 6 :
			System.out.println("Samedi");
			break;
		case 7 : 
			System.out.println("Dimanche");
		default :
			break;
		
		}
		
		
		
		
		
	}

}
