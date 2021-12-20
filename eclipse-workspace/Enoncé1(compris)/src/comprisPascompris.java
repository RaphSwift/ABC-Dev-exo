import java.util.Scanner;

public class comprisPascompris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chchain answer1 
		//chchain answer2
		
		String answer1;
		String answer2;
		
		//write "Read carefully"
		System.out.println("Read carefully");
		//write "Did you understand"
		System.out.println("Did you understand?yes/no");
		//read answer1
		Scanner sc = new Scanner (System.in);
		answer1 = sc.next();
		//if (answer1=="no")
		if (answer1.equals("no")) {
			//write "Read it again"
			System.out.println("Read it again");
			//write "Did you understand?yes/no"
			System.out.println("Did you understand?yes/no");
			//read answer2
			answer2 = sc.next();
			if (answer2.equals("no")) {
				System.out.println("Ask for help");
			}
		}
		System.out.println("Write the psudocode");
		System.out.println("Check up the program");
		System.out.println("Write the program");
		System.out.println("Try the program");
	}
}