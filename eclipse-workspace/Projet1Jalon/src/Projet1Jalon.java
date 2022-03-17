import java.util.Scanner;

public class Projet1Jalon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter numbers between 5 and 10.");
		n = sc.nextInt();
		if (n>10) {
			System.out.println("Number too high.");
		}
		else if (n<5) {
			System.out.println("Number too low.");
		}
		else {
			System.out.println("OK.");
		}
		sc.close();
	}

}
