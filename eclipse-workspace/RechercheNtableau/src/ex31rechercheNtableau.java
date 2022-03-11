import java.util.Scanner;

public class ex31rechercheNtableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] tableau = new int [] {3,7,9,14,22};
		
		int nbN;
		int valeurIndice =-1;
		int indice = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Chercher si un nombre donné N figure parmi les éléments.");
		nbN = sc.nextInt();
		
		
		for (int valeur:tableau) {
			if(nbN == valeur) {
				System.out.println("Le numéro recherché est dans l'indice " +indice + ".");
				valeurIndice = indice;
				
			}
			indice++;
		}
		if (valeurIndice==-1) {
			System.out.println("Nombre non trouvé.");
		}
		sc.close();
	}
}
