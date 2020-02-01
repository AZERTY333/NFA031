package Aprendre_prog_java;

public class Convesions_ou_cast {

	public static void main(String[]args) {
		int i = 123;
	//	System.out.println("Affichage du nombre i en integer " + i);
		float j = (float)i;
	//	System.out.println("Affichage du nombre j en float " + j);
		double u = (double)i;
	//	System.out.println("Affichage du nombre u en double " + u);
		
		u += 2.55555555555555555555555;
		u += (int)u;
/*		System.out.println("Affichage du nombre u en double  après lui avoir additionner 2.55555555555555555555555  " + u);	
		System.out.println("Affichage du nombre u en integer  " + (int)u);	
		System.out.println("Affichage du nombre u en integer après lui avoir additionner 2.55555555555555555555555 " + u);
*/	
	/*Conversion d'un string*/
		
		int ui = 123;
		String uj = new String();
		uj = uj.valueOf(ui);
		int uk = Integer.valueOf(uj).intValue();
		
		
		/*Depuis Java 7 le formatage des nombres*/
		
		double nombre = 1000000000000d; // cast en d
		System.out.println("Affichage du nombre " + nombre);
		//Peut s'écrire ainsi
		double nombre2 = 1____000____000___000_000d; // cast en d
		//Le nombre d'underscore n'a pas d'importance
		System.out.println("Affichage du nombre " + nombre2);
		//Voici quelques autres exemple d'utilisation
		int entier = 32_000;
		System.out.println("Affichage du nombre " + entier);
		double monDouble = 12_34_56_78_89_10d; // cast en d
	System.out.println("Affichage du nombre " + monDouble);
		double monDouble2 = 1234_5678_8910d;   // cast en d
		System.out.println("Affichage du nombre " + monDouble2);	
		

		
	}
}
