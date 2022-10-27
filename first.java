import java.util.*;

public class first {
	public static void main(String[] args) {

		int a,b,choice;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 for ADDITION\nPress 2 for SUBTRACTION\n Press 3 for Multiplication\n Press 4 for DIVISION\n");
		choice = sc.nextInt();
		System.out.println("Enter two integers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(choice == 1) {
			int sum = a+b;
			System.out.println(sum);
		}else if(choice == 1) {
			int minus = a-b;
			System.out.println(minus);
		}
		else if(choice == 1) {
			int mul = a*b;
			System.out.println(mul);
		}
		else if(choice == 1) {
			int div = a/b;
			System.out.println(div);
		}else {
			System.out.println("Error!You Have Entered An Invalid Option!!\n");
		}
		
	}
}
