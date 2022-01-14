import java.util.Scanner;

public class Ex9En1ecrireaetb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a; 									//entier a
		int b; 									//entier b

		Scanner sc = new Scanner (System.in); 	//créer un scanner 
		
		System.out.println("Saisir a"); 		//ecrire "saisir a"
		a = sc.nextInt(); 						//lire a
		System.out.println("Saisir b"); 		//ecrire "saisir a"
		b = sc.nextInt(); 						//lire b
		
		if (a>b) {  							//si (a>b) 
			System.out.println("Afficher a>b"); //alors ecrire 'a > b'
		}	
		else if (a<b) { 						//sinon si (a<b) 
			System.out.println("Afficher a<b"); //alors ecrire 'a < b'
		}
		else {									//sinon 
			System.out.println("Afficher a=b"); //ecrire 'a = b'
		}
	}
}