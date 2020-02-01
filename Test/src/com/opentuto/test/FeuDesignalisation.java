package com.opentuto.test;

public class FeuDesignalisation {

	private int couleur;
	private int position;
	private static double hauteur = 12.0; /*attribut statique*/
	
	public FeuDeSignalisation(int couleurInit) {/*un premier constructeur*/
		couleur = couleurInit;
		position = 0;
	}
	public FeuDesignalisation(int couleurInit, int positionInit) {
		
		/*Le constructeur est surchargé*/
		
		couleur = couleurInit;
		
		position = positionInit;
		
	}
	public static void setHauteur(double nouvelleHauteur) {
		/*cette méthode statique accède à l'attribut statique */
		hauteur = nouvellehauteur;
		
	}
	
	public void changeCouleur(int nouvelleCouleur) {
		/*Méthode agisant sur les objets "feux"*/
		
		couleur = nouvelleCouleur;
		
		System.out.println("ma couleur est" + couleur);
	}
	
	public static void getHauteur() {
		/*Cette méthode statique accède à l'attribut statique*/
		
		System.out.println("La hauteur des feux est " + hauteur);
		
	}
	public void clignote() {
		System.out.println("Première manière de clignoter");
		for(int i=0; i<2;i++) {
			for(int j=0;j<2;j++)
				System.out.println("je suis éteint");
			
			for(int j=0; j<2; j++)
				System.out.println("je suis allume");
		}
	}
	
	public void clignote(int a) { // première surchage de la méthode
		System.out.println("deuxieme maniere clignoter");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<a;j++)
				System.out.println("je suis eteint");
			for(int j=0; j<a;j++)
				System.out.println("je suis allume");
		}
	}
	public int clignote(int a,int b) {
		System.out.println("troisième manière de clignoter");
		
		for(int i = 0;i<2;i++) {
			for(int j=0;j<a;j++)
				System.out.println("je suis éteint");
			for(int j=0;j<b;j++)
				System.out.println("je suis allume");
		}
		return b;
	}
}

public class Principale{
	/* en Java le fichier et la classe contenant le main doivent être appelé de la même façons*/
	
	public static void main (Sting[]args) {
		
		/*C'est la manière d'écrire le main*/
		
		FeuDesignalisation unFeu = new FeuDeSignalisation(1,3);
		
		//Création avec le deuxième constructeur
		
		FeuDeSignalisation unAutreFeu = new FeuDeSignalisation(1);
		
		/* ...avec le premier constructeur*/
		
		unFeu.changeCouleur(3);
		
		/*appel d'une méthode non statique sur l'objet "un Feu" */
		
		unFeu.setHauteur(8,9);
		
		/*appel de la méthode statique à partir de l'objet */
		
		FeuDeSignalisation.getHauteur();
		
		/*appel de la méthode statique à partir de la classe cettr fois */
		
		unAutreFeu.setHauteur(10.6);
		
		/*tous les feux voient leur hauteur modifiée*/
		
		unFeu.getHauteur();/* applef de la méthid statisque à partir de l'objet*/
		
		System.out.print("**********************CLIGNOTEMET****************************");
		
		UnFeu.clignote();/*Première mannière de clignoter*/
		
		unFeu.clignote(3);/*Deuxième manière*/
		
		int b = unFeu.clignote(2,3); /*C'est possible au vu du return*/
		
	}
}

