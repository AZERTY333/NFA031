package net.pg3da97n.Apprentissage;

public class Les_condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int monnaie = 2000;
		
		if(monnaie == 2000) {
		    System.out.println("la monnaie est égal à 2000");	
		}else {
		    System.out.println("la monnaie n'est pas égal à 2000");	
			
		}
		
		if(monnaie == 2000 && monnaie == 5000) {
		    System.out.println("la monnaie est égal à 2000 et 5000");	
		}else {
		    System.out.println("la monnaie n'est pas égal à 2000 et 5000");	
			
		}
		
		if(monnaie == 2000 && monnaie != 2000 || monnaie != 5100 ) {
		    System.out.println("la monnaie est égal à 2000 et 5000");	
		}else {
		    System.out.println("la monnaie n'est pas égal à 2000 et 5000");	
			
		}
		
		if(monnaie != 2000 && monnaie != 5000 || monnaie != 5100 ) {
		    System.out.println("la monnaie est égal à 2000 et 5000");	
		}else if(monnaie >= 2000){
		    System.out.println("la monnaie n'est pas égal à 2000 et 5000");	
			
		}else {
		    System.out.println("la monnaie n'est pas égal à 2000 et 5000");				
		}
		
		
		
		// La structure switch
		// cette structure fait la même chose que else if mais de façons plus optimisé.
		// Structure

			/*{
			
			  case Argument:
			
			    Action;
			
			    break;        
			
			  default:
			
			    Action;             
			
			}
			    La classe évalue l'expression figurant après le switch (ici Variable).

    Si la première languette (case /*Valeur possible de la variable:) correspond à la valeur de /*Variable, l'instruction figurant dans celle-ci sera exécutée.

    Sinon, on passe à la languette suivante, et ainsi de suite.

    Si aucun des cas ne correspond, la classe va exécuter ce qui se trouve dans l'instruction default:/*Action;. Voyez ceci comme une sécurité.
			
			*/
		
		int note = 10; //On imagine la note maximale est 20
		
		switch(note) {
		case 0:
		System.out.println("Ouch !");
		break;
		case 10:
		System.out.println("Vous avez juste la moyene !");
		break;
		case 20:
		System.out.println("Parfait !");
		break;
		default:
		System.out.println("Il faut d'avantage travailler");
		}
		
	}

}
