package fr.dawan.tableaux.tableauxdynamiques;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		/*
		 * L'objectif des tableaux dynamiques, dits Collections, est de pouvoir cr�er des tableaux qu'on pourra 
		 * facilement modifier, la taille peut augmenter
		 * 
		 * Nous allons utiliser la classe ArrayList pour cr�er nos tableaux dynamiques :
		 * C'est un objet qui n'a pas de taille limite comme les tableaux fixes
		 * 
		 * La classe ArrayList est utilis�e pour les types �volu�s, complexes et non pour les types primitifs
		 * 
		 * On peut lui affecter entre chevrons le type de donn�es qu'il va stocker
		 * 
		 * 
		 */
		
		
		// Tableau de chaines de caract�res
		ArrayList<String> tab1 = new ArrayList<String>();
		
		// Taille du tableau
		System.out.println(tab1.size());
		
		// Tableau d'entiers
		ArrayList<Integer> tab2 = new ArrayList<Integer>();
		// ajout d'un �lement
		tab2.add(20);
		
		System.out.println(tab2.get(0));
		// set(a, b) : On peut venir modifier un �lement dans le tableau
		tab2.set(0, 60);
		System.out.println(tab2.get(0));
		
		tab2.add(350);
		tab2.add(980);
		tab2.add(210);
		
		System.out.println("Element � l'indice 2 : " + tab2.get(2));
		
		if(tab2.contains(50)) {
			System.out.println("L'�lement 50 est pr�sent dans mon tableau");
		} else {
			System.out.println("L'�lement 50 n'est pas pr�sent dans mon tableau");
		}
		
		
		if(tab2.isEmpty()) {
			System.out.println("Tableau vide");
		} else {
			System.out.println("Element � l'indice 3 : " + tab2.get(3));
		}
		
		if(tab2.indexOf(621)== -1) {
			System.out.println("L'�lement 621 n'est pas pr�sent dans mon tableau");
		} else {
			System.out.println("L'�lement 621 est pr�sent dans mon tableau");
		}
		
		

	}

}
