import java.util.Scanner;

public class nbPersonnesEx272 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exercice 2.7.2 : Afficher le nombre de personnes de chaque catégorie
		//Compléter l'algorithme précédent pour répondre à la demande suivante:
		//Si toutes les personnes ont moins de 20 ans, affichez 
		//« TOUTES LES PERSONNES ONT MOINS DE 20 ANS ».
		//Si aucune personne n'a moins de 20 ans, affichez 
		//« TOUTES LES PERSONNES ONT PLUS DE 20 ANS ».
		//Sinon, affichez le nombre de personnes pour chaque catégorie (« - de 20, + de 20, = à 20).


		Scanner sc = new Scanner(System.in);
		int [] age = new int[10];
		int nbAge=0;
		int nbYoung=0;
		int nbOld=0;
		int nb20=0;

		System.out.println("Enter 10 numbers, please.");

		for (int i = 0; i < age.length; i++) {
			System.out.println("Enter number N"+ (i+1) +", please.");
			age[i]=sc.nextInt();
		}
		for (int element : age) {
			System.out.print(element+ "");
		}
		System.out.println();

		for (int i = 0; i < age.length; i++) 
		{

			if (age[i]<20) {
				nbYoung++;	
			} 
			else if(age[i]==20) {
				nb20++;
			}

			else {
				nbOld++;
			}
		}
		if (nbYoung==10) {
			System.out.println("They are all under 20.");

		} 
		else if(nbOld==10 )  {
			System.out.println("They are all above 20.");

		}
		else {
			System.out.println("There are " + nbYoung + " people under 20, " + nbOld + " over 20 and " + nb20 + " young people of 20.");
		}


		//		for (int i=0; i<age.length; i++) {
		//			nbAge=sc.nextInt();
		//			if (nbAge<20) {
		//				ageCount++;
		//			}
		//		}

		sc.close();
	}
}
