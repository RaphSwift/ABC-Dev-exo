import java.util.Scanner;

public class Projet3Jalon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nTries=0;
		String userInput;
		String truePassword = "Bonjour";

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter your password.");
			userInput  = sc.nextLine();
			nTries++;
			
			if (userInput.equals(truePassword)){
				System.out.println("You are connected.");
			}
			else
			{
				System.out.println("Authentication failed.");
				System.out.println("Try again.");
			}
		}
		while (!truePassword.equals(userInput) && (nTries<3));
		sc.close();
	}
}