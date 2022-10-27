
import java.util.Scanner;

public class NumberSum {
	
	static int numsum(int num1,int num2) {
		if(num1 < num2) {
			return  num1 + numsum(num1+1,num2);
		}else {
			return num2;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
		if(num1 > num2) {
			System.out.println("Error!you have entered the first integer larger!");
		}else if(num1 == num2) {
			System.out.println("Error!you have entered the first integer equal to second!");
		}
		else {
			int result = numsum(num1,num2);
			System.out.print("The Sum Of Number Between " + num1 + " till " + num2 + " is " + result);
		}
	}
}
