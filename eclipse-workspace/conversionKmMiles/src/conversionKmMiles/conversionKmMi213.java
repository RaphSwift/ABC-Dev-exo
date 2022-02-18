package conversionKmMiles;

import java.util.Scanner;

public class conversionKmMi213 {

	// L’utilisateur peut saisir plusieurs valeurs à convertir.
	//Il saisit une valeur à convertir avec son unité de mesure (km ou mi).
	//Si aucune unité de mesure n’est indiquée, le programme considère la valeur en kilomètres.
	//A l’appui de la touche « Entrée », la valeur saisie est enregistrée dans un tableau en mémoire.
	//L’utilisateur peut enregistrer autant de valeurs qu’il souhaite.
	//Si l’utilisateur saisit la commande « go », le programme convertit toutes les valeurs 
	//mémorisées et affiche le résultat de chaque conversion.
	//La commande « quit » permet de quitter le programme. Tant que cette commande n’est pas saisie, 
	//l’utilisateur peut continuer à faire des conversions.
	/**
	 * 1-récuperer les valeurs
	 * 2- stocker chaque valeur + unité dans un tableau tableauDeConversion
	 * 3- so l'utilisateur saisit GO --> affichage des conversions
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);

		System.out.println("");
		/** var String saisie en cours */
		String valeurAConvertir;
		String[] tableauDeConversion=null;
		Boolean go = false;
		int index=0;


		do {
			System.out.println("Saisir une valeur à convertir.");
			valeurAConvertir = sc.nextLine();
			if(valeurAConvertir.equals("go")) {
				go=true;
			}
			else {
				tableauDeConversion [ index ]=valeurAConvertir;
				index++;
			}
		}while(go==false);

		/* 1- Parcourir tableauDeConversion
		 * 2- Pour chaque valeur du tableau, effectuer la conversion
		 * 
		 */

		for (int i = 0; i < index; i++) {

		}

		System.out.println("Programme terminé.");

		sc.close();
	}


	// fin du main
	public static void convertirUneValeur( String valeur)
	{
		String [ ] valeurEtUnite = valeur.split(" ");
		String unite;
		double conversion;
		String uniteResultat;
		if (valeurEtUnite.length >1) {
			unite = valeurEtUnite[1];
		}
		else {
			unite= "km";
		}
		conversion = Double.parseDouble(valeurEtUnite[0]);
		if (unite.equals("km")){
			conversion = (conversion /1.609);
			uniteResultat = "mi";
		}
		else {
			conversion = (conversion *1.609);
			uniteResultat = "km";
		}
		System.out.println(valeur+ " = " + conversion +" "+uniteResultat);
	}
}