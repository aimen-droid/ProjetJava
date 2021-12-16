package fr.dawan.tableaux.tableauxdynamiques;

import java.util.ArrayList;

public class WrapperTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> tab = new ArrayList<Integer>();
		
		// Parser une chaine de caractèrs en entier
		int k = Integer.parseInt("20");
		
		
		// Convertir une chaine de caractères en un entier de type Wrapper
		Integer i = Integer.valueOf("210");
		System.out.println(i);
		
		// Convertir une chaine de caractères en double
		Double d = Double.valueOf("41.52");
		
		System.out.println(d);
		
		
		// On peut aussi convertir des données primitives en leurs objets de classe Wrapper : Auto-Boxing
		int a =56;
		Integer i1 = a;		// Auto-Boxing
		
		// On ne peut pas créer une collection ou un tableau dynamique de type primitif
		// ArrayList<int> tab = new ArrayList<>(); INCORRECT
		
		int a1 = 45;
		tab.add(a1); 	// AUto-Boxing
		tab.add(60);
		
		// On a l'unboxing, qui est l'opposé de l'Auto-Boxing où nous convertissons l'objet de la classe Wrapper
		// vers son type primitif
		Integer s = 45;
		int a2 = s; 	// Unboxing
		
		// Utilisation de l'Auto-Boxing dans les tableaux dynamiques ( ou Colections )
		ArrayList<Integer> a12 = new ArrayList<Integer>();
		a12.add(89);
		int a3 = a12.get(0); // Unboxing
		int val = a3 + 10;
		a12.add(val); 	// Auto-Boxing
		
		
		
		

	}

}
