import java.util.*;

public class Ocurrances {

	public static void main(String[] args) {
		int num;
		int[] array = new int[10];  
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number Of Elements Of The Integer Array: ");
		num = sc.nextInt();
		for(int i = 0;i < num;i++ ) {
			System.out.print("Enter Number " + (i+1) + ": ");
			 array[i] = sc.nextInt();
		}
		int maxValue=array[0];
		int minValue=array[0];
		int maxIndex=0;
		int minIndex=0 ;
		for(int i = 0;i < num;i++ ) {
			if(array[i] > maxValue) {
				maxValue = array[i];
				maxIndex = i+1;
			}
			if(array[i] < minValue) {
				minValue = array[i];
				minIndex = i+1;
			}
		}
		
		
		System.out.println("The Maximum Value Present In The Array Is: " + maxValue);
		System.out.println("Index Of " + maxValue + " Is: " + maxIndex);
		
		System.out.println("The Minimum Value Present In The Array Is: " + minValue);
		System.out.println("Index Of " + minValue + " Is: " + minIndex);
		
		System.out.println("Difference Of Max Value And Min Value Is: " + maxValue + " - " + minValue + " = " +(maxValue - minValue) );
		System.out.println("Difference Of Max Value Index And Min Value Index Is: " + maxIndex + " - " + minIndex + " = " + Math.abs((maxIndex - minIndex)) );

	}

}
