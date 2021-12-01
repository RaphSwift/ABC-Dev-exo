package main;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//DECLARATION
		float rayon;
		float aire;
		float volume;
		//SAISIE
		Scanner sc = new Scanner(System.in); // OBJECT POUR LA LECTURE
		System.out.println("Veuillez saisir le rayon de la sphere : ");
		rayon = Float.parseFloat(sc.nextLine()); // ON RECUPERE LA LIGNE SOUS LA FORME D'UN FLOAT
		// TRAITEMENT
		aire = (float) ((float)4*Math.PI*Math.pow(rayon, 2));
		volume = (float) ((float)4/(float)3*Math.PI*Math.pow(rayon, 3));
		
		//AFFICHAGE
		System.out.println("La sphere a pour aire: " + aire + " et pour volume: " + volume);
		sc.close();
	}
}
