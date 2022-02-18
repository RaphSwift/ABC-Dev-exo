import java.util.Scanner;

public class retiredGood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		System.out.println("Enter your age, please.");
		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		String result = getRetired(age);
		System.out.println(result);

		scanner.close();
	}

	public static String getRetired(int age) {


		if (age > 60 ) {
			int ageDifference = (age - 60);
			return "You are retired for " + ageDifference + " years.";
		}
		if (age==60) {
			return "Your are retired.";
		}
		else {
			int remainingYears = (60-age);
			return remainingYears +" more years to get retired.";	
		}
	}
}
