//LeapYear.java
//Jaylon Kiper
//Date: 10-27-18

import java.util.Scanner;

public class LeapYear{
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int year;
		
	    System.out.print("Enter a year:\n[>1582] ");
	    year=scan.nextInt();
		System.out.println();
		
		if (year < 1582)
			System.out.println ("ERROR!!! \"The calender starts from 1582\".");
		else{
			if ((year%4==0 || year%400==0)&&(year>1999 || year%100!=0))
				System.out.println(" This is a leap year.");
			else
				System.out.println(" This is not a leap year.");
		}
	}
}