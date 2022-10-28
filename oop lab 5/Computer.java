import java.util.*;

public class Computer {
	
	public String name,type,proc,ram,hdd,drive,motherb;
	
	//DEFAULT CONSTRUCTOR
	public Computer() {
		
	}
	
	//FULL STATE CONSTRUCTOR
	public Computer(String name,String type,String proc,String ram,String hdd,String drive,String motherb){
		this.name = name;
		this.type = type;
		this.proc = proc;
		this.ram = ram;
		this.hdd = hdd;
		this.drive = drive;
		this.motherb = motherb;
	}
	
	//MAKING AN INSTANCE/OBJECT OF CLASS COMPUTER
	//MAKING USE OF FULL STATE CONSTRUCTOR BY USING DEFINED/PARAMETERIZED VALUES
	static Computer c1 = new Computer("Dell","mini","i7","8GB","500GB","CD","Lenovo");
	
	public static Scanner sc = new Scanner(System.in);
	
	
	//METHOD FOR GETTING THE USER'S COMPUTER'S INFO
	public static void get() {
		//for choosing y or n
		char choice;
		//for choosing the number of line
		int option;
		
		sc.nextLine();
		System.out.print("1)Enter The Name Of Your Computer: ");
		c1.name = sc.nextLine();
		System.out.print("2)Enter The Type Of Your Computer: ");
		c1.type = sc.nextLine();
		System.out.print("3)Enter The Processor Of Your Computer: ");
		c1.proc = sc.nextLine();
		System.out.print("4)Enter The Ram Of Your Computer: ");
		c1.ram = sc.nextLine();
		System.out.print("5)Enter The Hard Disk Drive Size Of Your Computer: ");
		c1.hdd = sc.nextLine();
		System.out.print("6)Enter The Optical Drive Of Your Computer: ");
		c1.drive = sc.nextLine();
		System.out.print("7)Enter The Name Of Your Computer's Motherboard: ");
		c1.motherb = sc.nextLine();
		
		System.out.print("Do You Want To Change Any Of The Above Provided Info?(Press Y or N): ");
		choice = sc.next().charAt(0);
		
		if(choice == 'Y' || choice == 'y') {
			
			System.out.print("Enter The Number Of Line Which You Want To Edit(1 to 7): ");
			option = sc.nextInt();
			
			sc.nextLine();
			switch(option) {
			
			case 1:
				System.out.print("1)Enter The Name Of Your Computer: ");
				c1.name = sc.nextLine();
				break;
				
			case 2:
				System.out.print("2)Enter The Type Of Your Computer: ");
				c1.type = sc.nextLine();
				break;
			
			case 3:
				System.out.print("3)Enter The Processor Of Your Computer: ");
				c1.proc = sc.nextLine();
				break;
			
			case 4:
				System.out.print("4)Enter The Ram Of Your Computer: ");
				c1.ram = sc.nextLine();
				break;
				
			case 5:
				System.out.print("5)Enter The Hard Disk Drive Size Of Your Computer: ");
				c1.hdd = sc.nextLine();
				break;
				
			case 6:
				System.out.print("6)Enter The Optical Drive Of Your Computer: ");
				c1.drive = sc.nextLine();
				break;
				
			case 7:
				System.out.print("7)Enter The Name Of Your Computer's Motherboard: ");
				c1.motherb = sc.nextLine();
				break;
				
			default:
				System.out.print("The Number You Entered Was Incorrect or Not Found!! ");
				break;
			}	
		}
		
	}
	
	//METHOD TO DISPLAY THE USER'S COMPUTER'S INFO
	public static void display() {
		System.out.println("The Name Of Your Computer: " + c1.name);
		
		System.out.println("The Type Of Your Computer: " + c1.type);
	
		System.out.println("The Processor Of Your Computer: " + c1.proc);
	
		System.out.println("The Ram Of Your Computer: " + c1.ram );

		System.out.println("The Hard Disk Drive Size Of Your Computer: " + c1.hdd);
	
		System.out.println("The Optical Drive Of Your Computer: " + c1.drive );
		
		System.out.println("The Name Of Your Computer's Motherboard: " + c1.motherb);
	}

	
	
	public static void main(String[] args) {
		int option;
		
		
		while(true) {
		System.out.println("\nPRESS 1 TO INPUT YOUR COMPUTER'S INFO");
		System.out.println("PRESS 2 TO DISPLAY YOUR COMPUTER'S INFO");
		System.out.println("PRESS 3 TO EXIT");
		option = sc.nextInt();
			switch(option) {
				case 1:
					get();
					break;
				
				case 2:
					display();
					break;

				case 3:
					return;

				default:
					System.out.println("INVALID OPTION ENTERED!");
					break;
			}
		
		}
		
	}

}
