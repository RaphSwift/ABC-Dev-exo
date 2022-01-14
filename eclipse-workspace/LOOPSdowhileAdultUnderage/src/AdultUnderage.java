import java.util.Scanner;

public class AdultUnderage {

	public static void main(String[] args) {

		Scanner scanner;
		String name;
		int age;

		scanner = new Scanner(System.in);
		System.out.println("Enter your name, please.");
		name = scanner.next();
		System.out.println("Thank you" + " " + name + ".");

		do {
			System.out.println("Enter your age, please.");
			age = scanner.nextInt();
		}
		while (age<0);
	
		System.out.println("Thank you" + " " + name + ". You are" + " "+age + ".");
		
		if (age >=18) {
			System.out.println("You are a gown-up.");
		}
		else {
			System.out.println("You are an underage individual.");
		}
	}
}
