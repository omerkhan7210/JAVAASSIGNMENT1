import java.util.*;

public class TimeDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year,month,day,hour,min,sec;
        //INITIALIZING WITH DEFAULT CONSTRUCTOR
        Time t = new Time();

        //SETTING VALUES BY SETTERS
		System.out.print("1)Enter The Year: ");
		year = sc.nextInt();
        t.setYEAR(year);
		System.out.print("2)Enter The Month: ");
		month = sc.nextInt();
        t.setMONTH(month);
		System.out.print("3)Enter The Day: ");
		day = sc.nextInt();
        t.setDAY(day);
		System.out.print("4)Enter Hours: ");
		hour = sc.nextInt();
        t.setHOUR(hour);
		System.out.print("5)Enter Minutes: ");
		min = sc.nextInt();
        t.setMIN(min);
		System.out.print("6)Enter Seconds: ");
		sec = sc.nextInt();
        t.setSECS(sec);

        //GETTING VALUES BY GETTERS
        System.out.println("Current Date is: " + t.getDAY() + ", " + t.getMONTH() + ", " + t.getYEAR());
        System.out.println("Current Time is: " + t.getHOUR() + ": " + t.getMIN() + ": " + t.getSECS());

        //INITIALIZING WITH SECOND OVERLOADED CONSTRUCTOR
        Time t2 = new Time(2022,10,28);
        System.out.println("Current Date is: " + t2.getDAY() + ", " + t2.getMONTH() + ", " + t2.getYEAR());

        //INITIALIZING WITH THIRD OVERLOADED CONSTRUCTOR
        Time t3 = new Time(2022,10,28,8,30,10);
        System.out.println("Current Date is: " + t3.getDAY() + ", " + t3.getMONTH() + ", " + t3.getYEAR());
        System.out.println("Current Time is: " + t3.getHOUR() + ": " + t3.getMIN() + ": " + t3.getSECS());

        sc.close();
    }
}
