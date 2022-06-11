//BinaryOutputRF.java
//Jaylon Kiper
//9-20-18
 import java.util.Scanner;

public class BinaryOutputRF {

	static Scanner console = new Scanner (System.in);
	public static void main (String[] args){
		int base;
		int number;

		System.out.print("Please enter the base: ");
		base = console.nextInt();
		System.out.println();

		System.out.print("Please enter the number: ");
		number = console.nextInt();
		System.out.println();

		System.out.println("Your base number is: " + number);
		System.out.println("Your base is :" + base);
		System.out.print("Your answer is: ");
		binaryOutput(number, base);

		System.exit(0);
		
	}//end main

	public static void binaryOuput(int number, int base){

		if(number != 0){
			
			binaryOutput(number/base, base);
			System.out.print(number % base);
		
		}//end if statement

	}//end binaryOutput

}//end class

