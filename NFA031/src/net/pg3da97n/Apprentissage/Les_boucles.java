package net.pg3da97n.Apprentissage;

public class Les_boucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//La boucle for
		

			for(int i=0;i<=12;i++) {
				System.out.println("La note est de :" + i);

			}
			
		
/*		
			//boucle for infinie
			 	for(;;) {
				int i=0;
				System.out.println("La note est de :" + i);
				i++;
				if(i == 12) {
				break;
			}

			}
			*/
			
			//La boucle for each 
			// La boucle for each fait la même chose que la boucle for mais en plus lisibe pour des suites ou il y a plusieurs valeurs.
		// On commence par la valeur à initialiser et elt va prendre les valeurs de note.
			
			//for() classique
			int[] notes = {10,11,12};
			for(int i=0;i<notes.length;i++) {
				System.out.println("La note est de :" + notes[i]);			
			}
			
			//for each
		int[] note = {10,11,12};
			for(int elt : note) {
				System.out.println("La note est de :" + elt);			
			}
			
			 //La boucle while et do while
			// La boucle while repet une instruction tant que la condition n'est pas remplie.
			//La boucle do{}while fait exactement la même chose sauf que l'instruction sera executée au moins une fois même si l'instruction est remplie.
			
			//Exemple 1
			int i =0;
			while(i<=12) {				
				System.out.println("La note est de :" + i);
				i++;
			}
			
			do {				
				System.out.println("La note est de :" + i);
				i++;
			}while(i<=12);			
			//Exemple 2
			
			int a =1;
			while(a<1) {				
				System.out.println("La note est de :" + a);
				a++;
			}
			
			do {				
				System.out.println("La note est de :" + a);
				a++;
			}while(a<1);
			// Ici on voit que le do{}while() s'est executée au moins une fois mais pas le while(){}
	}
}
