package net.pg3da97n.TD4;

import java.util.Scanner;

public class Exo1_tableaux_d_entier {
	public static void main(String[]args) {
	int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
	//ecrire un tableau d'entier 
	int[] tableau_integer;
	 tableau_integer = new int[8];
	 // La ligne 7 sert à initialiser une adresse mémoire dnas la pile pour le tableau var.
	 // La ligne 8 sert à créer un espace mémoire dans le tas elle sremplit le tableau avec des valurs par défault. 
	 System.out.println("Valeur par défault au format integer");
	 System.out.println(tableau_integer[0]);
	 
	 //Exemple avec d'autre type de structure de donnée.
		double[] tableau_double;
		tableau_double = new double[8];
		 System.out.println("Valeur par défault au format double");
		 System.out.println(tableau_double[0]);
		 
			boolean[] tableau_boolean;
			tableau_boolean = new boolean[8];
			 System.out.println("Valeur par défault au format boolean");
			 System.out.println(tableau_boolean[0]);
			 
				String[] tableau_string;
				tableau_string = new String[8];
				 System.out.println("Valeur par défault au format string");
				 System.out.println(tableau_string[0]);
				 
					char[] tableau_char;
					tableau_char = new char[8];
					 System.out.println("Valeur par défault au format char");
					 System.out.println(tableau_char[0]);
					 
					 //Question 1 et 2
					 Scanner sc = new Scanner(System.in);
					 System.out.println("Entrer le nombre rechercher");
					 int val;
					 val = sc.nextInt();
					 
					 boolean Testreponse = false;
					 int occurence = 0;
					 for(int i = 0;i<tab.length;i++) {
						 if(tab[i]==val) {
							 occurence = i;
							 Testreponse = true;
						 }				 
					 }
					 if(Testreponse == true) {
						 occurence = occurence + 1;
				     System.out.println("Occurence du tableau contenant la valeur: " + occurence);	 
					 }else {
					     System.out.println("le tableau ne contient pas la valeur entrée");							 
					 }
					 // Question 3
					int a = 0;
					while(!Testreponse || a<tab.length) {		

					 if(tab[a]==val) {
						 Testreponse = true;
					 }	
						a++;
					}
	}
}
