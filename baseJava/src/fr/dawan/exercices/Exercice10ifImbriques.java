package fr.dawan.exercices;

public class Exercice10ifImbriques {

	public static void main(String[] args) {
	
		int a,b,c,max;
		a=3;
		b=1;
		c=2;
		max=0;
		if(a>=b) {
			max=a;
			if(max<c) {
				max=c;
			}
		} else {
			max=b; 
			if(max>c) {
				max=c;
			}
		}
		
		System.out.println("Le max entre les trois nombres est " + max);
	}

}
