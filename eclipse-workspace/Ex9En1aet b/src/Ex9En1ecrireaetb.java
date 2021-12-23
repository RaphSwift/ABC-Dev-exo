import java.util.Scanner;

public class Ex9En1ecrireaetb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//réel a
		//réel b
		
		//écrire "Saisir a"
		//écrire "Saisir b"
		//lire a
		//lire b

		//si (a>b)       alors

		//écrire ‘’Afficher a> b’’
		//Sinon si (a<b) alors
		//écrire ‘’Afficher a < b‘’
		//Sinon
		//Ecrire ‘’Afficher a=b’’
		//Finsi

		float a;
		float b;

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Saisir a");
		a = sc.nextFloat();
		System.out.println("Saisir b");
		b = sc.nextFloat();
		
		if (a>b) {
			System.out.println("Afficher a>b");
		}	
		else if (a<b) {
			System.out.println("Afficher a<b");
		}
		else {
			System.out.println("Afficher a=b");
		}
	}
}