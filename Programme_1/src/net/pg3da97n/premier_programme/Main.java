package net.pg3da97n.premier_programme;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		
		//Les racourcies pour affecter des nombres en java
		
		int age = 18;
		int note1 = 20;
		int note2 = 30;
		int note3 = 40;
		
		// On affecte + 1 a cette valeur 
		age++;
		System.out.println("age = " + age);
		
		// On affecte - 1 a cette valeur 
		age--;
		System.out.println("age = " + age);	
		
		//On veut ajouter 10 a cette valeur
		age += 10;
		System.out.println("age = " + age);	
		
		//On veut soustraire 10 a cette valeur
		age -= 10;
		System.out.println("age = " + age);	

		int calcul = (note1 + note2 + note3)/3;

		System.out.println(calcul);
	}

}
