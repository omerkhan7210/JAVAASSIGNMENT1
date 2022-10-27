
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Word To Check If It Is A Palindrome Or Not: ");
		String word = sc.nextLine();
		
		if(checkPalindrome(word)) {
			System.out.println(word + " is a palindrome!");
		}
		else {
			System.out.println(word + " is not a palindrome!");
		}
	}
	
	public static Boolean checkPalindrome(String word) {
		String reversedWord = "";
		char[] ch = word.toCharArray();
		for(int i=word.length()-1;i>=0;i--) {
			reversedWord += ch[i];
		}
		
		if(word.toLowerCase().equals(reversedWord.toLowerCase())) {
			return true;
		}else {
			return false;
		}
	}
}
