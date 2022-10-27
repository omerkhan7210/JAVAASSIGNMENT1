
public class StringParser {
 public static void main(String[] args) {
	 String str = "Hello! I am string in java.I have several function and I am very \"Important\" #string_is_important";
	 System.out.println("Original: " + str);
	 System.out.println("Splitting at ! :" + str.substring(0, 6));
	 System.out.println("After ! till Java:" + str.substring(7, 26));
	 System.out.println("After . till # :" + str.substring(27, 76));
	 System.out.println("After # till end :" + str.substring(77, 97));
 }
}
