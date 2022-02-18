import java.util.Scanner;

public class conversionKmMl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//L'utilisateur saisit une valeur en kilomètres comprise entre 0.01 et 1 000 000. 
		//Si la valeur est hors limite, l'utilisateur 
		//est invité à saisir une nouvelle valeur.
		//Formule km vers mi : 1 miles = 1.609 kilomètres
		//Le programme affiche le résultat de la conversion sous forme de nombre réel 
		//double précision.

		String distanceAConvertir;
		String[] tableauDeConversion;
		double valeur;
		String uniteDeMesure;
		double conversion;

		Scanner sc = new Scanner (System.in);

		do {
			System.out.println("Entrer une valeur suivie de MI ou KM, la valeur doit etre entre 0.01 et 1 000 000.");
			
			distanceAConvertir = sc.nextLine().toLowerCase(); //"12 mi"

			tableauDeConversion = distanceAConvertir.split(" ");

			valeur = Double.valueOf(tableauDeConversion[0]); //conversion de String en Int 

		}
		while (valeur<0.01 || valeur>1000000) ;

		
		if(tableauDeConversion.length > 1) {
			uniteDeMesure = tableauDeConversion[1];
		}
		else {
			uniteDeMesure = "km";
		}

		uniteDeMesure = uniteDeMesure.toLowerCase();


		if (uniteDeMesure.equals ("km")) {
			// conversion de km vers mi
			conversion = (valeur/1.609);
			System.out.println("La distance " +valeur+ " en km vaut " + conversion+ " miles.");

		}
		else {
			//conversion mi vers km
			conversion =(valeur*1.609);
			System.out.println("La distance " +valeur+ " en mi vaut " + conversion+ " kilometres.");

		}

		//afficher du resultat

		sc.close();
	}
}

