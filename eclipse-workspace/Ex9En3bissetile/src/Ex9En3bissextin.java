import java.util.Scanner;

public class Ex9En3bissextin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reel anneeA
		//écrire "Saisir anneeA "
		//lire anneeA

		//Si (« anneeA » / 4 ) ET NOT(« anneeA / 100 ») alors
		//Ecrire « L’année est bissexile »
		//Sinon 
		//Ecrire « Non Bissextile selon le cas » 
		//finsi

		int anneeA;
		
		System.out.println("Saisir anneeA");
		Scanner sc = new Scanner (System.in);
		anneeA= sc.nextInt();
		if (anneeA % 4 == 0) {
			
			if ((anneeA % 100 == 0) && (anneeA % 400 != 0)){
			}
			System.out.println("L’année est bissexile");
		}
		else {
			System.out.println("L’année est non Bissextile");
		}
	}
}