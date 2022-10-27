
public class ConstructorsTest {
	
	private String name;
	private int age;
	private double salary;
	private char gender;
	private static int id = 0;
	
	public void eating() {
		System.out.println("Eating");
	}
	
	public static int getId() {
		return id;
	}
	public static void setId(int newId) {
		id = newId;
	}
	
	public ConstructorsTest() {
		id++;
	}
	
	public ConstructorsTest(String name,int age,double salary,char gender) {
		this.name= name; 
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		id++;
	}
	
	

	public static void main(String[] args) {
		
		//THIS IS A EMPTY DEAFULT CONSTRUCTOR WITH NULL VALUES
		ConstructorsTest obj1 = new ConstructorsTest();
		ConstructorsTest obj2 = new ConstructorsTest();
		ConstructorsTest obj3 = new ConstructorsTest();
		
		System.out.println(obj2.getId());
		
		
		//THIS IS A FULL STATE OR PARAMETERIZED CONSTRUCTOR WITH PARAMETERIZED VALUES
		ConstructorsTest obj4 = new ConstructorsTest("affan",22,15.5,'M');
		System.out.println(obj4.name);

	}

}
