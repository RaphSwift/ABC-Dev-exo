package ex35Palindrome;

import java.util.Scanner;

public class ex35palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Un palindrome est une chaîne de caractères que l'on peut lire
		identiquement de droite à gauche, et gauche à droite.
		Par exemple:
		AA. 38783. LAVAL. LAVAL A ETE A LAVAL. ET LA MARINE VA VENIR A MALTE
		Soit une chaîne de caractères terminée par un point. 
		Ecrivez l'algorithme d'un programme permettant d'affirmer si cette phrase 
		est ou non un palindrome.
		Si la chaîne de caractères n'est composée que du caractère '.', le message 
		'LA CHAINE EST VIDE' sera affiché.
		Proposez un jeu d'essai prévoyant les 3 cas suivants :
		▪ la phrase est vide
		▪ la chaîne de caractères n'est pas un palindrome
		▪ la chaîne de caractères est un palindrome*/

		Scanner sc = new Scanner(System.in);
		boolean polindrome=true;
		String phrase;

		phrase = sc.nextLine();

		System.out.println("Enter a" + phrase + ".");

		if (phrase.equals(".")) {
			System.out.println("The chain is empty.");
			
			else if{
				for(i=0; i<phrase; i++) {
					
				}
			}

		}	

	}

}
