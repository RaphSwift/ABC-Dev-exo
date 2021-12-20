import java.util.Scanner;

public class Ex4sommeS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DECLARATION DES VARIABLES
		//réel SommeInit
		//réel Interet
		//entier NombreAnnees
		//réel InteretSimple
		//réel InteretCompose
		
		float sommeInit;
		float interet;
		float nombreAnnees;
		float interetSimple;
		float interetCompose;
		
		//INPUT
		//écrire "Saisir la somme initiale S placée sur un compte"
		//écrire "Saisir l'intérêt i offert par la banque"
		//écrire "Saisir le nombre n d'années de placement de la somme S"
		
		System.out.println("Saisir la somme initiale S placée sur un compte");
		Scanner sc = new Scanner(System.in);
		sommeInit = sc.nextFloat();
		
		System.out.println("Saisir l'intérêt i offert par la banque");
		interet = sc.nextFloat();
		
		System.out.println("Saisir le nombre n d'années de placement de la somme S");
		nombreAnnees = sc.nextFloat();
		
		
		//PROCCESSING
		//InteretSimple <--S ( 1 + n * i )
		//InteretComposé <--S ( 1 + i )n

		interetSimple = (float)(1 + nombreAnnees*interet);
		interetCompose = (float) ((float) sommeInit*(Math.pow((1 + interet),nombreAnnees)));
		
		
		//OUTPUT
		//écrire "Calculer la valeur somme S pendant n années avec interetSimple et interetComposé"
		System.out.println("La valeur somme"+sommeInit+"pendant"+nombreAnnees+" avec interetSimple"+interetSimple);
		System.out.println("La valeur somme S pendant n années avec interetCompose"+interetCompose);
	}
}
