import java.util.Scanner;

public class LOOPSdowhilesipasfatigué {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		//Chaine tired


		//ecrire "I'll code some lines in JAVA"
		//ecrire "Am I tired?" yes/no

		//while NOTtired = "!yes"
		//ecrire "I'll take a nap"
		//lire tired



		//ecrire "Am I still tired?"
		//lire   tired

		//EndWhile


		String tired;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("I'll code some lines in JAVA");
			System.out.println("Am I tired? yes/no");
			tired = sc.next();
		}
			while (!tired.equals("yes"));
				System.out.println("I'll take a nap");
				System.out.println("Am I still tired? yes/no");
				tired = sc.next();
		}
	}