//RandomNumbers1.java
//Jaylon Kiper
//11-21-18

import static java.lang.Math.*;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers1{
	
	public static void main(String[]args){
		
		int number;
		int low;
		int high;
		
		Scanner scan=new Scanner(System.in);
		
		Random generator=new Random();
	
		System.out.print("Please enter how many random numbers you want to generate: ");
		number=scan.nextInt();
		System.out.println();
		
		System.out.print("Please enter the lowest integer: ");
		low=scan.nextInt();
		System.out.println();

		System.out.print("Please enter the highest integer: ");
		high=scan.nextInt();
		System.out.println();
		
		int[]randomNumbers=new int[number];
		
		final int numbersPerLine;
		
		System.out.print("Please enter how many lines you want to be printed: ");
		numbersPerLine=scan.nextInt();
		System.out.println();
		
		for (int count=0;count<randomNumbers.length;count++){
			randomNumbers[count]=generator.nextInt(high-low+1)+low;
		}
		
		System.out.println("The elements of the array are:");{
			for(int i=0;i<numbersPerLine;i++)
				if(i%10==0)
					System.out.print("\n\t"+randomNumbers[i]);
				else
					System.out.print("\t"+randomNumbers[i]);
		}
	}
}