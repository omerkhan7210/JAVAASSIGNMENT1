
import java.util.Scanner;



public class Book {
	
	private String title,author;
	private double price;
	
	//DEFAULT CONSTRUCTOR
		public Book() {
			
		}
		
		//FULL STATE CONSTRUCTOR
		public Book(String title,String author,double price){
			this.title = title;
			this.author = author;
			this.price = price;
		}
		
		
		//USED TO SET THE TITLE
		public void setTitle(String newTitle) {
			this.title = newTitle;
		}
		//USED TO SET THE Author
		public void setAuthor(String newAuthor) {
			this.author = newAuthor;
		}
		//USED TO SET THE Price
		public void setPrice(double newPrice) {
			this.price = newPrice;
		}
		
		//USED TO SET THE TITLE
		public String getTitle() {
			return title;
		}
		//USED TO SET THE Author
		public String getAuthor() {
			return author;
				}
		//USED TO SET THE Price
		public double getPrice() {
			return price;
		}
		
		
	
}
