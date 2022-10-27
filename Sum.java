import java.util.*;

public class Sum {
	static void computePrimeSum(int num) {
		int count;

  		for (int i = 1; i <= num; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
				count++;
				break;
				}
			}

			if (count == 0) {
				System.out.println(i);
			}

		}
	}
  	
	static int computeOddSum(int num)
    {
		if(num<=0)
		{
		return 0;    
		}
		else if(num%2 != 0)
		{
		return (num+computeOddSum(num-1));
		}
		else
		{
		return computeOddSum(num-1);
		}
   	}

	static int computeEvenSum(int num)
	{
		if(num<=0)
		{
		   return 0;    
		}
		else if(num%2 == 0)
		{
			return (num+computeEvenSum(num-1));
		}
		else
		{
		   return computeEvenSum(num-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,number;
		System.out.println("Enter A Number to Print Prime Numbers:");
		num = sc.nextInt();
		computePrimeSum(num);
		do{
			System.out.println("Enter A Number to Get The Sum Of Odd And Even Number:");
			number = sc.nextInt();
			if(number%2 != 0){
				int resultOdd = computeOddSum(number);
				System.out.println("The Sum Of Odd Number uptil " + number + " is: " + resultOdd);
			}
			else{
				int resultEven = computeEvenSum(number);
				System.out.println("The Sum Of Even Number uptil " + number + " is: " + resultEven);
			}
		}while(number > 0);
		
		sc.close();
	}

}
