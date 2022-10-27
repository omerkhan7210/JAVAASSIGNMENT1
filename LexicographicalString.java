import java.util.*;

public class LexicographicalString {

	public static void main(String[] args) {
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 1: ");
		str1 = sc.next();
		System.out.print("Enter String 2: ");
		str2 = sc.next();
		System.out.println("Comparing String 1 And String 2" );
	
		if(str1.compareTo(str2) > 0) {
			System.out.println(str1 + " is greater than " + str2);
		}else if(str1.compareTo(str2) < 0){
			System.out.println(str2 + " is greater than " + str1);
		}else {
			System.out.println(str1 + " is equal to " + str2);
		}
		
	}

}
