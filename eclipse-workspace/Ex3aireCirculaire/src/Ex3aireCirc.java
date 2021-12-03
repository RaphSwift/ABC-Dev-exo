import java.util.Scanner;

public class Ex3aireCirc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Traduction du pseudo code en code java
		
				//DECLARATION DES VARIABLES
				//Réel r
				float r;
				//Réel aireR
				double airer;
				//Réel angleA
				double anglea;
				
				//INPUT
				
				//écrire "Afficher le rayon R d'un cercle"
				System.out.println("Afficher le rayon R d'un cercle");
				//lire r
				Scanner sc = new Scanner(System.in);
				r = sc.nextFloat();
				//écrire "Afficher an angle a"
				System.out.println("Afficher an angle a");
				//lire angleA
				anglea = sc.nextFloat();
				
				//PROCCESSING
				
				//aireR <--(4pR²A/360)
				airer=(4*Math.PI*Math.pow(r,2)*anglea/360);
				
				//output
				
				//écrire "L'aire de secteur circulaire est:", aire
				System.out.println("L'aire de secteur circulaire est:"+airer);
	}

}
