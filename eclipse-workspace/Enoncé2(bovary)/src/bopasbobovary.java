import java.util.Scanner;

public class bopasbobovary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chainecharacter beauTemps
		//chainecharacter lectureBovary
		//chainecharacter etatVelo
		//chainecharacter reparationVelo
		//chainecharacter dispoBovary
		
		String beauTemps;
		String lectureBovary;
		String etatVelo;
		String reparationVelo;
		String dispoBovary;
		
		//écrire  "J’irai faire du vélo, s’il fait beau demain"
		//écrire  "Est-ce qu’il fait beau ? OUI/NON"
		//lire  beauTemps
		
		System.out.println("J’irai faire du vélo, s’il fait beau demain.");
		System.out.println("Est-ce qu’il fait beau ? oui/non");
		Scanner sc = new Scanner (System.in);
		beauTemps = sc.next();
		
		//si (beauTemps == ‘’oui’’)
		//alors
	 	//écrire  ‘’J’irai chez le garagiste, si le vélo n’est pas en état’’
		//écrire  ‘’Est-ce que le vélo est-il cassé ? OUI/NON ‘’
		//lire  etatVelo
		//si (etatVelo == ’’non’’)
		//alors
		//écrire  "J’irai chez le garagiste"
		//écrire  "Est-ce que la réparation est-elle rapide ? oui/non "
		//lire  reparationVelo
		//si (reparationVelo == "non")
		//alors
		//écrire  "J’irai ceuillir des joncs"
				//Finsi
		//Sinon
		//écrire  "J’irai faire du vélo"

		
		if (beauTemps.equals("oui")) {
			System.out.println("J’irai chez le garagiste, si le vélo n’est pas en état.");
			System.out.println("Est-ce que le vélo est-il cassé ? oui/non");
			etatVelo = sc.next();
			if (etatVelo.equals("non")) {
				System.out.println("J’irai chez le garagiste.");
				System.out.println("Est-ce que la réparation est-elle rapide ? oui/non ");
				reparationVelo = sc.next();
				if (reparationVelo.equals("non")) {
					System.out.println("J’irai ceuillir des joncs.");
				}
				else { 
					System.out.println("J’irai faire du vélo.");
				}
			}
			else {
				System.out.println("J’irai faire du vélo.");
			}
			
		//Sinon
		//écrire  ‘’Je ferai une lecture de Madame Bovary’’
		//écrire  ‘’Est-ce qu’il est dispo dans le salon? OUI/NON ‘’
		//lire  lectureBovary
		//si (lectureBovary == ‘’NON’’)
		//alors
		//écrire  ‘’J’irai à la biblioteque’’
		//écrire  ‘’Est-ce qu’il est dispo ? OUI/NON ‘’
		//lire  dispoBovary
		//si (dispoBovary == ‘’NON’’)
		//alors
		//écrire  ‘’Je prends un roman policier’’
		//Finsi
		//Finsi
		//écrire  ‘’Je m’installe confortablement et je lis’’
		//Finsi
		}
	else {
		System.out.println("Je ferai une lecture de Madame Bovary ? ");
		System.out.println("Est-ce qu’il est dispo dans le salon? oui/non");
		lectureBovary = sc.next();
			if (lectureBovary.equals("non")) {
				System.out.println("J’irai à la bibliothèque.");
				System.out.println("Est-ce qu’il est dispo ? oui/non");
				dispoBovary = sc.next();
				if (dispoBovary.equals("non")) {
					System.out.println("Je prends un roman policier.");
					}
				}
			System.out.println("Je m’installe confortablement et je lis.");
		}
	}
}