package functionEx;

public class formuleFonction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		helloWorld(); //rappel de fonction affichiage directe
		helloName("Paul"); //rappel de fonction affichiage directe
		
		
		
		System.out.println("Veuillez saisir un nombre svp.");
		int resultat = addition (sc.nextInt(),sc.nextInt());
		System.out.println(resultat);
		public static void helloWorld () {
			System.out.println("Hello World");
		}
		public static void helloName(String name) {
			System.out.println("Hello" + name);
			
		}

	}

}
