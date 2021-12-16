package fr.dawan.tableauxstatique;

public class IterationClassiqueVSIterationValeurs {

	/*
	 * Nous allons voir les avantages et inconv�nients entre l'it�ration classique
	 * et l'it�ration sur un ensemble de valeurs
	 * 
	 * Conclusion : Pour modifier une valeur on va donc utiliser l'it�ration classique 
	 * 
	 * 2�me cas : On ne peut pas tester deux valeurs dans le tableau en utilisant le foreach
	 * Par contre avec la boucle for classique c'est possible. On peut �crire tab[i] == tab[i+1] ou
	 * tab[i] < tab[i+1]
	 */

	public static void main(String[] args) {
		
		
		int[] tab ={100, 200, 300, 10};
		
		System.out.println("iteration classique");
		for(int i=0; i<tab.length;i++) { 
			System.out.println(tab[i]);
			//tab[i]=22; commande qui assignerait 22 � toutes les positions dans le tableau
			//tab[i+1]= 154; // d�passement de taille fix�e
		}
		
		//System.out.println("tab[0] : " + tab[0]);

		System.out.println("\nForeach : Iteration sur un ensemble de valeurs");
		for(int element : tab) {
			System.out.println(element);
			//element = 11;
		}
		
		//System.out.println("tab[0] : " + tab[0]);
	}

}
