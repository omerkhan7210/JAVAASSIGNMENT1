
import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		char alphabet;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter An Alphabet: ");
		alphabet = sc.next().charAt(0);
		if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
			System.out.println("You Have Entered A Vowel!");
		}else if(!Character.isAlphabetic(alphabet)) {
			System.out.println("You Have Not Entered An Alphabet!");
		}
		else {
			System.out.println("You Have Entered A Consonant!");
		}
	}

}
