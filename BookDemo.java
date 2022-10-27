import java.util.*;

public class BookDemo {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String title,author;
		double price;
		
		//MAKING AN INSTANCE/OBJECT OF CLASS COMPUTER
		//MAKING USE OF FULL STATE CONSTRUCTOR BY USING DEFINED/PARAMETERIZED VALUES
		Book b1 = new Book("Developing Java Software","Russel Winderand",79.75);
		
		int option;
		char choice;
		
		do {
		System.out.println("\nPRESS 1 TO INPUT BOOK'S INFO");
		System.out.println("PRESS 2 TO DISPLAY BOOK'S INFO");
		option = sc.nextInt();
			switch(option) {
				case 1:
					sc.nextLine();
					System.out.print("Enter The Title Of The Book: ");
					title = sc.nextLine();
					b1.setTitle(title);
					
					System.out.print("Enter The Author Of The Book: ");
					author = sc.nextLine();
					b1.setAuthor(author);
					
					System.out.print("Enter The Price Of The Book: ");
					price = sc.nextDouble();
					b1.setPrice(price);
					break;
				
				case 2:
					System.out.println("The Title Of The Book Is: " + b1.getTitle());
					System.out.println("The Author Of The Book Is: " + b1.getAuthor());
					System.out.println("The Price Of The Book Is: " + b1.getPrice());
					break;
			}
		
		System.out.print("Do You Want To Go To The Main Menu Again?(Press Y or N): ");
		choice = sc.next().charAt(0);
		}while(choice == 'y' || choice == 'Y' );
		
		
		
	}

}
