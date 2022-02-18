
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ageATester = 18;
		String result = estIlMajeur(ageATester);
	} //fin main


	public static String estIlMajeur(int age) {
		if(age >=18) {
			return "Majeur!";
		}
		else {
			return "Mineur!";
		}
	}
}
