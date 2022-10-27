
import java.util.Scanner;

public class Sum2 {
	static int result=1;
	
		static int sum(int num) {
		if(num > 1) {
			return num * sum(num-1);//RECURSION	
		}else {
			return 1;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num = sc.nextInt();
		if(num < 0) {
			System.out.println("Error!you have entered a negative integer!");
		}else {
			int result = sum(num);
			System.out.print("The Sum Of " + num + " is " + result);
		}

	}

}
