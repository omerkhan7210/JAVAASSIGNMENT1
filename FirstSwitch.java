import java.util.*;

public class FirstSwitch {
	public static void main(String[] args) {

		int a,b,choice;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 for ADDITION\nPress 2 for SUBTRACTION\nPress 3 for Multiplication\nPress 4 for DIVISION\n");
		choice = sc.nextInt();
		System.out.println("Enter two integers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		switch(choice) {
		case 1:
			int sum = a+b;
			System.out.println(sum);
			break;
			
		case 2:
			int minus = a-b;
			System.out.println(minus);
			break;
			
		case 3:
			int mul = a*b;
			System.out.println(mul);
			break;
			
		case 4:
			int div = a/b;
			System.out.println(div);
			break;
		
		default:
			System.out.println("Error!You Have Entered An Invalid Option!!\n");
			break;
		}
		
	}
}
