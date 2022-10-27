
public class Product {
	
	 String name;
	 int quantity;
	 double price;
	
	
	public Product(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
}
