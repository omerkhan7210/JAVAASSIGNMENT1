
import java.util.Scanner;

public class Company {
	static Scanner sc = new Scanner(System.in);
	
	private String name;
	private Store[] arrayStore;
	private int nbStore;
	
	public Company(String name) {
		this.name = name;
	}
	
	public void addStore(Store store) {
	
		if(nbStore<=10) {
			for(int i=0;i<nbStore;i++) {
				System.out.print("Enter Store " + (i+1) + " Name: ");
				store.setName(name);
				arrayStore[i].setName(name);;
			}
		}else {
			System.out.print("Max 10 store can be added!");
		}
	}
	
	public int searchNbOfStore(String productName) {
		int n=0;
		
		for(int i=0;i<nbStore;i++) {
			 if(arrayStore[i].equals(productName)) {
				 n++;
				 return nbStore;
			 }
		}
		if(n==0) {
			return n;
		}
		return 0;
		
		
		
	}
	
	public void displayAll() {
		for(int i=0;i<nbStore;i++) {
			arrayStore[i].getName();
		}
	}
	
}
