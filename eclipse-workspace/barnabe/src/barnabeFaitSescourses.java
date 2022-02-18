import java.util.Scanner;

public class barnabeFaitSescourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exercice 2.4 : Barnabé fait ses courses dans plusieurs magasins. 
		//Dans chacun, il a dépensé 1 euro de plus que la moitié de ce qu’il avait en entrant. 
		//Dans le dernier magasin, il dépense le solde.
		//Soit S la somme dont il disposait au départ (S > 1 euro). 
		//Représenter l’algorithme permettant de trouver le nombre de magasins dans lesquels il 
		//a acheté.


		float somme;
		float reste;
		int magasinsVisites=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une somme initiale.");
		somme = sc.nextFloat();
		reste = somme;

		do {
			reste=(reste/2)-1;
			magasinsVisites++;
		}
		while (reste>1);
		System.out.println("Vous avez visité " + magasinsVisites + " magasins.");
		sc.close();
	}
}