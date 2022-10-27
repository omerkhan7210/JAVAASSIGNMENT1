
import java.util.Scanner;

public class Store {
	
	static Scanner sc = new Scanner(System.in);
	
	private String name,location;
	private Product[] productList;
	private int nbProduct;
	
	public Store(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}

	public void addProduct(Product p) {
		
		if(nbProduct<=100) {
			for(int i=0;i<nbProduct;i++) {
				System.out.print("Enter Product " + (i+1) + " Name: ");
				p.setName(name);
				productList[i].setName(name);;
			}
		}else {
			System.out.print("Max 100 products can be added!");
		}
		
	}
	
	public boolean searchProduct(String productName) {
	
		
		for(int i=0;i<nbProduct;i++) {
			return productList[i].equals(productName);
		}
		return false;
	}
	
	public Product deleteProduct(String productName) {
		
		Product p = new Product();
		
		for(int i=0;i<nbProduct;i++) {
			if(productList[i].equals(productName)) {
				return p;
			}
			
		}
		return null;
	}
	
	public void displayAll() {
		for(int i=0;i<nbProduct;i++) {
			productList[i].getName();
		}
	}
	
	
}

