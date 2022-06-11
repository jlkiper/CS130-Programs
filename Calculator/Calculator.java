//Calculator.java
//Written by Jaylon Kiper
//9/7/18 CS130-03

import java.util.Scanner;

public class Calculator{

	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int first;
		int second;
		
		System.out.print("Please enter the first operand:");
		first = scan.nextInt();
		System.out.println();
		
		System.out.print("Please enter the second operand:");
		second = scan.nextInt();
		System.out.println();
		
		
		System.out.println("The value of the first operand is:"+first);
		System.out.println("The value of the second operand is:"+second);
		
		System.out.println();
		
		System.out.println("\n The sum of the two integers is:"+(first+second));
		
		System.out.println("\n The difference of the two integers is:"+(first-second));
		
		System.out.println("\n The product of the two integers is:"+(first*second));
		
		System.out.println("\n The quotient is:"+(first/second));
		
		System.out.println("\n The remainder is:"+(first%second));

	}//main
}//class