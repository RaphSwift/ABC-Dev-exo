import java.util.Scanner;

public class Ex9En2ecrireabc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//réel a
		//réel b
		//réel c

		//écrire "Saisir a"
		//écrire "Saisir b"
		//écrire "Saisir c"
		//lire a
		//lire b
		//lire c

		//si (a<b<c)     alors

		//écrire "Afficher a<b<c"
		//Sinon si (a>b>c) alors
		//écrire "Afficher a>b>c"
		//Sinon
		//Ecrire "Afficher a=b"
		//Finsi

		float a;
		float b;
		float c;

		Scanner sc = new Scanner (System.in);

		System.out.println("Saisir a");
		a = sc.nextFloat();
		System.out.println("Saisir b");
		b = sc.nextFloat();
		System.out.println("Saisir c");
		c = sc.nextFloat();

		if ((a<b)&&(b<c)) {
			System.out.println("Afficher a<b<c");
		}	
		else if ((a<c)&&(c<b)) {
			System.out.println("Afficher a<c<b5");
		}
		else if ((b<a)&&(a<c)) {
			System.out.println("Afficher b<a<c");
		}
		else if ((b<c)&&(c<a)) {
			System.out.println("Afficher b<c<a");
		}
		else if ((c<b)&&(b<a)) {
			System.out.println("Afficher c<b<a");
		}
		else if ((c<a)&&(a<b)) {
			System.out.println("Afficher c<a<b");
		}
	}
}

