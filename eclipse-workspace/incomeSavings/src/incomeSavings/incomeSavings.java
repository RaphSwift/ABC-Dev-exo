package incomeSavings;

public class incomeSavings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int income = 2000;
		int savings = 500;
		

		// add up 100 to your savings ./
		savings = savings + 100;
		// or
		savings+=100;

		// take off 50 from your income ;/
		income = income - 50;
		// or 
		income -= 50;
		

		//update your savings deadline
		int numbreOfDaysSavings = (5000 - income) / 500;

		//update again your income
		income = income + (30 - 10) * 7;
		
		System.out.println(numbreOfDaysSavings + " savings deadline" );
	}
}
