import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//Traduction du pseudo code en code java
		//DECLARATION DES VARIABLES
		//Réel nombre1
		float nombre1;
		//Réel nombre2
		float nombre2;
		//Réel moyenne
		float moyenne;
		
		//SAISIES
		//ECRIRE "Introduce the 1st"		
		System.out.println("Introduce the 1st");
		//LIRE nombre1
		Scanner sc = new Scanner(System.in);
		nombre1 = sc.nextFloat();		
		System.out.println("Vous avez saisie nombre1="+nombre1);
		
		//ECRIRE "Introduce the 2st"
		//System.out.println("Introduce the 2st");
		System.out.println("Introduce the 2nd");
		//LIRE nombre2
		nombre2 = sc.nextFloat();
		System.out.println("Vous avez saisie nombre2="+nombre2);
		
		//TRAITEMENT
		//moyenne <--(nombre1+nombre2)/2
		moyenne = (nombre1+nombre2)/2;
		
		//AFFICHAGE
		//ecrire "des la valeur moyenne est:" moyenne
		System.out.println("la moyenne des 2 nombres=" +moyenne); 
	}
}
