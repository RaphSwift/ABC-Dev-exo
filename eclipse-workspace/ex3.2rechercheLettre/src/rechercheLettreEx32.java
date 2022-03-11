
import java.util.Scanner;

public class rechercheLettreEx32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Soit une chaîne de caractères terminée par le caractère « . ». 
		Donnez l'algorithme d'un programme qui compte le nombre d'occurrences d'une lettre donnée (« a » par exemple) 
		dans cette chaîne.
		Si la chaîne de caractères n'est composée que du caractère « . », le message « LA CHAINE EST VIDE » sera affiché.
		Proposez un jeu d'essai prévoyant les 3 cas suivants :
		▪ La phrase est vide
		▪ La lettre n'est pas présente
		▪ La lettre est présente plusieurs fois*/

		Scanner sc = new Scanner(System.in);

		String letterSearched;
		String text;
		int counter=0;

		System.out.println("Type a text.");
		text= sc.nextLine();

		if (text.equals(".")) {
			System.out.println("The sentense is empty.");
		}
		else {
			System.out.println("Enter the character.");
			letterSearched= sc.nextLine();
			for (int j = 0; j < letterSearched.length(); j++)
			{
				for (int i=0; i<text.length(); i++) {
					if(letterSearched.charAt(j)==(text.charAt(i))) {
						counter++;
					}
				}
				if (counter==0) {
					System.out.println("The character is not existant.");
				}
				else {
					System.out.println("The " + letterSearched + " exists " + counter + " times.");	
				}
			}
		}
		sc.close();
	}
}
