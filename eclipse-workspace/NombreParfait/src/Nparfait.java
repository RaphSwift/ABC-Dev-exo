import java.util.Scanner;

public class Nparfait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculer des premiers nombres parfaits. Un nombre est dit parfait s’il est égal 
		//à la somme de ses diviseurs, 1 compris. 

		int n; //entier nombre
		int d; //diviseur
		boolean toutSauf1EtLuiMeme = false;
		int sommeD=0;

		Scanner scanner; //déclaration scanner 
		scanner = new Scanner(System.in);

		System.out.println("Entrer un nombre.");
		n = scanner.nextInt();

		for (d=1; d<=(n-1);d++) {
			if(n%d==0) {
				System.out.println(d+" "+"est diviseur de "+n);
				toutSauf1EtLuiMeme = true;
				sommeD=d+sommeD;
			}
		}
		if (sommeD == n) {
			System.out.println("Le nombre est parfait.");
		}
		else {
			System.out.println("Le nombre n'est pas parfait.");
		}
		scanner.close();
	}
}