import java.util.Scanner;

public class LOOPSsipasfatigué {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Chaine tired

		//ecrire "Am I tired?" yes/no
		//lire tired

		//while tired = "yes"
		//ecrire "I'll take a nap"
		//ecrire "Am I still tired?"
		//lire   tired

		//EndWhile

		//ecrire "I'll code some lines in JAVA"


		String tired;

		System.out.println("Am I tired? yes/no");
		Scanner sc = new Scanner(System.in);
		tired = sc.next();

		while (tired.equals("yes")) {
			System.out.println("I'll take a nap");
			System.out.println("Am I still tired? yes/no");
			tired = sc.next();
		}

		System.out.println("I'll code some lines in JAVA");
	}

}
