import java.util.Scanner;

public class LireNdiviseurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lire un nombre entier et déterminer tous ses diviseurs autres que 1 et lui-même.
		
		int n; //entier n
		int diviseur; //entier nTest
		boolean allbut1andself = false;
		Scanner scanner;

		scanner = new Scanner(System.in);

		System.out.println("Enter a number, please.");
		n = scanner.nextInt();

		for (diviseur = 2; diviseur <=(n-1);diviseur++) {
			if (n % diviseur == 0 ) {

				System.out.println (diviseur + " "+"is the devisor of " + n );
				allbut1andself = true;
			}
			scanner.close();
		}
		if (allbut1andself = false){
			System.out.println("No divisors");
		}
		scanner.close();
	}
}