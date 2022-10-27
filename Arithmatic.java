
import java.util.*;

public class Arithmatic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Arithmatic Operations");
		System.out.print("Input Two Integers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = x+y;
		int diff = x-y;
		int product = x*y;
		
		System.out.println("Additon Of " + x + " + " + y + " = " + sum);
		System.out.println("Difference Of " + x + " - " + y + " = " + diff);
		System.out.println("Product Of " + x + " * " + y + " = " + product);
	}
}
