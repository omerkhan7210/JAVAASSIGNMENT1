import java.util.*;

public class Weekdays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter A Number: ");
		num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("The 1st Day Of The Week Is Monday!");
			break;
		case 2:
			System.out.println("The 2nd Day Of The Week Is Tuesday!");
			break;
		case 3:
			System.out.println("The 3rd Day Of The Week Is Wednesday!");
			break;
		case 4:
			System.out.println("The 4th Day Of The Week Is Thursday!");
			break;
		case 5:
			System.out.println("The 5th Day Of The Week Is Friday!");
			break;
		case 6:
			System.out.println("The 6th Day Of The Week Is Saturday!");
			break;
		case 7:
			System.out.println("The 7th Day Of The Week Is Sunday!");
			break;
		default:
			System.out.println("The Number You Entered Doesn't Have Any Day!!");
			break;
		}

	}

}
