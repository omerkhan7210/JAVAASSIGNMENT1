import java.util.*;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float faren,cel;
		System.out.println("Conversion Of Celsius To Farenheit");
		
		cel = 289;
		faren = (cel * 9/5) + 32;
		System.out.println("289 Degree Celsius to Farenheit = " + faren + "F");
		
		cel = 400;
		faren = (cel * 9/5) + 32;
		System.out.println("400 Degree Celsius to Farenheit = " + faren + "F");
		
		cel = -36;
		faren = (cel * 9/5) + 32;
		System.out.println("-36 degree Celsius to Farenheit = " + faren + "F");
		
		cel = -180;
		faren = (cel * 9/5) + 32;
		System.out.println("-180 degree Celsius to Farenheit = " + faren + "F");
		
		
	}
}
