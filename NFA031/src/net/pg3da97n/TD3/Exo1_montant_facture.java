package net.pg3da97n.TD3;

import java.io.InputStream;
import java.util.Scanner;

public class Exo1_montant_facture {
	public static void main(String[]args){
	
		//Définition des variables
		double pHT = 0,pTTC = 0;
		int tTVA = 0;
		
		System.out.println("Veuillez rentrer un prix HT");
		Scanner sc = new Scanner(System.in);
		pHT= sc.nextDouble();
	    
	    System.out.println("Veuillez rentrer un taux de TVA a 0 normal ou 1 reduit ou 2 intermédiaire");

	    tTVA= sc.nextInt();
	    
	    if( tTVA == 0){
	    	pTTC = pHT + (pHT*0.2);
	    	}else if(tTVA == 1){
	    		pTTC=pHT + (pHT*0.055);
	    		}else if(tTVA == 2){
	    			pTTC=pHT + (pHT*0.1);	
	    }
	System.out.println("La somme TTC: "+pTTC); 

	}
}
