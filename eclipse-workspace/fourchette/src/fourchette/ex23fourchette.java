package fourchette;

import java.util.Random;
import java.util.Scanner;

public class ex23fourchette {
	public static void main(String[] args) {

		//L'ordinateur « choisit » un nombre entier compris entre 0 et 100. 
		//Le joueur essaie de le deviner. 
		//Lors de chaque essai, l'ordinateur affiche la « fourchette » 
		//dans laquelle se trouve le nombre qu'il a choisi. 
		//Le choix du nombre par l'ordinateur sera simulé par génération d'un 
		//nombre aléatoire : N <-- RANDOM(0,100)

		
		int nbComputer;
		int nbGamer;
		boolean find=false;
		int nbTries=0;

		int min=0;
		int max=100;
		Scanner sc = new Scanner(System.in);
		Random aleas=new Random();
		nbComputer=aleas.nextInt(101);
		
		do {
			System.out.println("Enter a number between " + min + " and " + max + ".");
			nbGamer  = sc.nextInt();
				
			if (nbGamer>nbComputer){
				max=nbGamer;	
			}
			else if (nbGamer<nbComputer){
				min=nbGamer;
			}
			else
			{
				System.out.println("Bingo! You found it! The number you've been looking for is: "+ nbGamer);
				find =true;
			}
			nbTries++;
			
		} while (!find);
		
		System.out.println("You had " + nbTries +" tries.");
		System.out.println("Try again ;))");
		sc.close();
	}
}