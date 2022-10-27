import java.util.*;

public class PatientInfo {
	 int pNum;
	 int pAge;
	 long pContact;
	 int pBill;
	 String pName,pEmail,pComplain;
	
	 void Take_Patient_Data() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Patients Info----");
		System.out.print("Please Enter Your Number: ");
		pNum = sc.nextInt();
		
		System.out.print("Please Enter Your Name: ");
		pName = sc.next();
		System.out.print("Please Enter Your Age: ");
		pAge = sc.nextInt();
		System.out.print("Please Enter Your Email: ");
		pEmail = sc.next();
		System.out.print("Please Enter Your Contact: ");
		pContact = sc.nextInt();
		System.out.print("Please Enter Your Complain: ");
		pComplain = sc.next();
		
	}
	
	void Print_Receipt() {
		
		System.out.println("----Patients Receipt----");
		System.out.println("Patient's Number: " + pNum);
		System.out.println("Patient's Name: " + pName);
		System.out.println("Patient's Age: " + pAge);
		System.out.println("Patient's Email: " + pEmail);
		System.out.println("Patient's Contact: " + pContact);
		System.out.println("Patient's Complain: " + pComplain);
		
	}
	
	public static void main(String[] args) {
		PatientInfo p1 = new PatientInfo();
		System.out.println("Welcome To Our Hospital!");
		p1.Take_Patient_Data();
		p1.Print_Receipt();
		
	}

}
