import java.util.Scanner;

public class WhileNdiviseur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lire un nombre N et déterminer s’il est un nombre premier.
		//AVEC WHILE

		int n; //nombre
		int d; //diviseur
		Scanner scanner;

		System.out.println("Saisir un nomrbre.");
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		d=n-1;
		while (!(n%d==0)){
			d=d-1;//n--
			System.out.println(d);
		}
		if (d==1) {
			System.out.println("Le nombre est premier.");
		}
		else {
			System.out.println("Le nombre n'est premier.");
		}
	}
}
