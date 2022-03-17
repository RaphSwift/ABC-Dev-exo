package ex34triNombre;

import java.util.Scanner;

public class triNombreEx34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*Exercice 3.4 : Tri d'un tableau 
		Nous désignerons par a1, a2, ..., aN les éléments d'un tableau à trier par ordre croissant.
		On commence par chercher l'indice du plus petit des éléments, soit j cet indice. 
		On permute alors les valeurs de a1 et aj .
		On cherche ensuite l'indice du plus petit des éléments a2, a3, ..., 
		an et on permute avec a2, etc.*/

		Scanner sc = new Scanner(System.in);

		int nbN;
		int [] tableau = new int [6];
		int temp=0;

		System.out.println("Veuillez entrer 6 nombres séparés par un espace.");

		for (int i=0; i<tableau.length; i++) {
			nbN = sc.nextInt();
			tableau[i]=nbN;
		}

		for (int i=0; i<tableau.length; i++) {



			for	(int j=i; j<tableau.length; j++) {
				if	(tableau[i]>tableau[j]) {
					temp=tableau[i];
					tableau[i]=tableau[j];
					tableau[j]=temp;
					j--;
				}
			}
			System.out.print(tableau[i]+" ");	 
		}
		sc.close();
	}
}