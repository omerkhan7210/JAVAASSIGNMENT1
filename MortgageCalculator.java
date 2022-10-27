import java.util.*;

public class MortgageCalculator {
	public static void main(String[] args) {
		int principal,years,months;
		float interest,annual_r;
		double exp1,exp2,mortgage;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To Mortgage Calculator\n");
		System.out.println("Enter Principal: ");
		principal = sc.nextInt();
		System.out.println("Enter Annual Interest Rate: ");
		interest = sc.nextFloat();
		System.out.println("Enter Period(Years): ");
		years = sc.nextInt();
		
		annual_r = (interest/12)/100;
		months = years*12;
		
		exp1 = Math.pow(1+annual_r, 2);
		exp2 = exp1 - 1;
		mortgage = (principal*exp1)/exp2;
		
		System.out.println(mortgage);
		
	}
}
