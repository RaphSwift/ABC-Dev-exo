package conversionCF;

import java.util.Scanner;

public class conversionCF 

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exercice 2.2.1 : Soit "X" la valeur à convertir.
		//Formule °F vers °C : °C = (X − 32) * 5/9
		//Formule °C vers °F : °F = (X * 9/5) + 32
		//L'utilisateur saisit une valeur numérique comprise entre -459.67 et 5 000 000 
		//suivi de l'unité de température : 
		// ▪ C pour Celsius //▪ F pour Fahrenheit
		//La valeur et l'unité de température sont séparés par un espace (exemple: 32 C pour 32 degrés Celsius). Si la valeur est 
		//hors limite, l’utilisateur recommence la saisie. 
		//Pour information, le zéro absolu correspond à -459.67 Degrés Fahrenheit ou -273.15 degrés Celsius. En physique, rien 
		//ne peut être plus froid que le zéro absolu !
		//La température de la plus basse jamais enregistrée sur Terre est de -95 degrés Celsius.
		//Le programme affiche le résultat de la conversion sous forme de nombre réel double précision.
		//Exemple d’affichage en mode Console :
		//Programme de conversion Celsius <-> Fahrenheit.
		//Saisir une température avec son unité de mesure (C ou F) : 
		//17 C
		//17 °C = 62.6 °F 
		// F = (C * 9/5) + 32;
		// C = (F − 32) * 5/9;
		// n = -459.67 et 5 000 000;
		//double conversion;


		double conversion;

		String saisie = "";		

		Scanner sc= new Scanner(System.in); 
		//boolean saisieOK=false;
		double nbs;
		String type;
		do {

			System.out.println("Saisir une température avec son unité de mesure séparé par un espace (C ou F)");

			saisie = sc.nextLine();

			String []monTableau = saisie.split(" ");

			nbs  = Double.parseDouble(monTableau[0]);
			type = monTableau[1];
		}
		
		while ( nbs<-459.67 || nbs>5000000);


		if (type.equals("F")) {
			conversion = (nbs - 32) * 5/9;
			System.out.println("Egal à :" + Math.round(conversion) + "C° Celsius");
		}
		else {
			conversion = ((nbs*9)/5) + 32;
			System.out.println("Egal à :" + Math.round(conversion) + "F Fahrenheit");

		}


	}

}
