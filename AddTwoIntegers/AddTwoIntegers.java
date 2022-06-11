//AddTwoIntegers.java
//Written by Jaylon Kiper
//9/4/18 CS130-03
//This program adds two integers.

import java.util.Scanner;

public class AddTwoIntegers{//class

	public static void main(String[]args){//main
		Scanner scan = new Scanner(System.in);
		
		int first;
		int second;
		
		System.out.print("Please enter the first integer:");
		first = scan.nextInt();
		System.out.println();
		
		System.out.print("Please enter the second integer:");
		second = scan.nextInt();
		System.out.println();
		
		int sum = first+second;
		
		System.out.println("The first operand is:" +first);
		System.out.println("The second operand is:" +second);
		
		System.out.println();
		System.out.println("The sum of the two integers is:" +sum);
    }//main
}//class
