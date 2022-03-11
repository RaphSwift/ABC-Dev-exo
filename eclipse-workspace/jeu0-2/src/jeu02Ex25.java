import java.util.Random;
import java.util.Scanner;

public class jeu02Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Exercice 2.5 : Jeu du 0 - 2 
		//A tour de rôle, l'ordinateur et le joueur choisissent un nombre qui ne peut prendre que 
		//3 valeurs: 0, 1 ou 2.Le choix du nombre par l'ordinateur sera simulé par génération d'un 
		//nombre aléatoire : N <-- RANDOM
		//Si la différence entre les nombres choisi vaut :
		//▪ 2 : le joueur qui a proposé le plus grand nombre gagne un point.
		//▪ 1 : le joueur qui a proposé le plus petit nombre gagne un point.
		//▪ 0 : aucun point n'est marqué. 
		//Le jeu se termine quand un des deux joueurs (l'ordinateur ou le joueur humain) totalise
		//10 points ou quand l'être humain introduit un nombre négatif qui indique sa volonté d'arrêter 
		//de jouer.


		int nbComputer;
		int nbPlayer;
		int scorePlayer=0;
		int scoreComputer=0;
		boolean retry=true;
		Random aleas=new Random();
		Scanner sc = new Scanner(System.in);
		nbPlayer = sc.nextInt();


		while (retry){
			nbComputer=aleas.nextInt(3);
			System.out.println("Enter a number between 0 and 2.");
			nbPlayer=sc.nextInt();

			if ((nbPlayer < nbComputer) && ((nbComputer - nbPlayer)==2)) {
				System.out.println("Computer earned 1 point.");
				scoreComputer++;
			}
			else if ((nbPlayer > nbComputer) && ((nbPlayer - nbComputer)==2)) {
				System.out.println("Player earned 1 point.");
				scorePlayer++;
			}
			else if ((nbPlayer < nbComputer) && ((nbComputer - nbPlayer)==1)) {
				System.out.println("Player earned 1 point.");
				scorePlayer++;
			}
			else if ((nbPlayer > nbComputer) && ((nbPlayer - nbComputer)==1)) {
				System.out.println("Player earned 1 point.");
				scorePlayer++;
			}
			else {
				System.out.println("No points.");
			}
			System.out.println("The player earned " + scorePlayer + "and the computer earned " + scoreComputer + ".");
			if ((scoreComputer == 10) || (scorePlayer == 10)); {
				retry=false;
			
		
			}
		}
				sc.close();
		
	}
}