//FunWithRandomness2.java
//Jaylon Kiper
//10-9-18

import java.util.Scanner;
import java.util.Random;

public class FunWithRandomness2{

	public static void main(String[]args){
		
		final int low;
		final int high;
		final int maxCount;

		Scanner scan=new Scanner(System.in);
		Random generator=new Random();

		System.out.print("Please enter the starting point for random numbers: ");
		low=scan.nextInt();
		System.out.println();

		System.out.print("Please enter the ending point for random numbers: ");
		high=scan.nextInt();
		System.out.println();

		System.out.print("Please enter how many random numbers you want to generate: ");
		maxCount=scan.nextInt();
		System.out.println();

		System.out.println("\n We are creating "+maxCount+" numbers between "+low+" and "+high+" both inclusive.");
		
		int[]numbers=new int[maxCount];
		
		for(int count=0; count<numbers.length; count++)
			numbers[count]=generator.nextInt(high-low+1)+low;
		
		System.out.println("\nThe first number is : "+numbers[0]);

		System.out.println("\nThe last number is : "+numbers[numbers.length-1]);
		
		System.out.println("\nFirst 10 numbers are:\n");
		for(int count=0; count < 10; count++)
			System.out.printf("%8d", numbers[count]);
		System.out.println();

		System.out.println("\nLast 10 numbers are:\n");
		for(int count=numbers.length-10; count < numbers.length; count++)
			System.out.printf("%8d", numbers[count]);
		System.out.println();
		
		int sum=0;
		for(int count=0; count < numbers.length; count++)
			sum=sum+numbers[count];

		System.out.println("\nThe number of elements in the array is : "+numbers.length+"\n");
		System.out.println("\nThe sum of all the elements of the array is : "+sum+"\n");
		System.out.println("\nThe average of all the elements of the array is : "+(double)sum/numbers.length+"\n");
	}
}