import java.util.Scanner;

public class WHILEnPremierREFAIRE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lire un nombre N et déterminer s’il est un nombre premier.
		
		int n;
		int d;
		Scanner scanner;
		
		System.out.println("Saisir un nombre.");
		scanner = new Scanner(System.in);
		n = scanner.nextInt();
		d=n-1;
		
		while (!(n%d==0)) {
			d=d-1;
		}
		if (d==1){
			System.out.println("Le nombre est premier.");
		}
		else {
			System.out.println("Le nombre n'est premier.");
		}
	}
}
