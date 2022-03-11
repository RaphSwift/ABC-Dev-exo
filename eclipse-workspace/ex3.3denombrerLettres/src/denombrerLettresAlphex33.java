import java.util.Scanner;

public class denombrerLettresAlphex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Exercice 3.3 : Dénombrer les lettres de l'alphabet dans un tableau 
	Lire un texte d'au moins 120 caractères (à contrôler). 
	Compter et afficher le nombre d'occurrences (d'apparitions) de chacune des lettres
	 de l'alphabet */

		char[] alphabet=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int count;
		String text;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter a text of 120 characters.");
			text= sc.nextLine().toLowerCase();
			System.out.println(text.length());
		}
		while (text.length()<120);

		for (int i=0; i<alphabet.length; i++){
			count=0;
			for (int j=0; j<text.length();j++) {
				if (text.charAt(j)==(alphabet[i])) {
					count++;
				}
			}
			if (count>=1) {
				System.out.println("The letter " + alphabet[i]+ " found in the text appears " + count + " times.");
			}
		}
		sc.close();
	}
}
