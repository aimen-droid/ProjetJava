package fr.dawan.tableaux.tableauxdynamiques;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		/*
		 * L'objectif des tableaux dynamiques, dits Collections, est de pouvoir créer des tableaux qu'on pourra 
		 * facilement modifier, la taille peut augmenter
		 * 
		 * Nous allons utiliser la classe ArrayList pour créer nos tableaux dynamiques :
		 * C'est un objet qui n'a pas de taille limite comme les tableaux fixes
		 * 
		 * La classe ArrayList est utilisée pour les types évolués, complexes et non pour les types primitifs
		 * 
		 * On peut lui affecter entre chevrons le type de données qu'il va stocker
		 * 
		 * 
		 */
		
		
		// Tableau de chaines de caractères
		ArrayList<String> tab1 = new ArrayList<String>();
		
		// Taille du tableau
		System.out.println(tab1.size());
		
		// Tableau d'entiers
		ArrayList<Integer> tab2 = new ArrayList<Integer>();
		// ajout d'un élement
		tab2.add(20);
		
		System.out.println(tab2.get(0));
		// set(a, b) : On peut venir modifier un élement dans le tableau
		tab2.set(0, 60);
		System.out.println(tab2.get(0));
		
		tab2.add(350);
		tab2.add(980);
		tab2.add(210);
		
		System.out.println("Element à l'indice 2 : " + tab2.get(2));
		
		if(tab2.contains(50)) {
			System.out.println("L'élement 50 est présent dans mon tableau");
		} else {
			System.out.println("L'élement 50 n'est pas présent dans mon tableau");
		}
		
		
		if(tab2.isEmpty()) {
			System.out.println("Tableau vide");
		} else {
			System.out.println("Element à l'indice 3 : " + tab2.get(3));
		}
		
		if(tab2.indexOf(621)== -1) {
			System.out.println("L'élement 621 n'est pas présent dans mon tableau");
		} else {
			System.out.println("L'élement 621 est présent dans mon tableau");
		}
		
		

	}

}
