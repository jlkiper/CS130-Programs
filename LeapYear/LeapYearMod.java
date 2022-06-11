//LeapYearMod.java
//Jaylon Kiper
//Date: 10-27-18

import java.util.Scanner;

public class LeapYearMod{
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int year=1583, sen=1111;
		
		
			while(year>1582 || year!=sen){
			System.out.print("Enter a year:\n[1111 to Quit} ");
			year=scan.nextInt();
		
			if (year<1582 || year==sen)
			break;
			
			if ((year%4==0 || year%400==0)&&(year>1999 || year%100!=0))
				System.out.println(" This is a leap year.\n");
			else
				System.out.println(" This is not a leap year.\n");
		}
	
			if (year<1582)
				System.out.println("\n \"The calendar starts from 1582\" Thank you!!!)");
	
	}
}