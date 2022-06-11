//RandomNumbers.java
//Jaylon Kiper
//11-21-18

import static java.lang.Math.*;
import java.util.Scanner;

public class RandomNumbers{
	
	public static void main(String[]args){
		
		int number;
		int low;
		int high;
		
		Scanner scan=new Scanner(System.in);
	
		System.out.print("Please enter how many random numbers you want to generate: ");
		number=scan.nextInt();
		System.out.println();
		
		System.out.print("Please enter the lowest integer: ");
		low=scan.nextInt();
		System.out.println();

		System.out.print("Please enter the highest integer: ");
		high=scan.nextInt();
		System.out.println();
		
		int[]randomNumbers=new int[number]
		
		for(int i=0; i<randomNumbers.length; i++){
		randomNumbers[i]=(int)(random()*(high-low+1)+low;
		}
		
		final int numbersPerLine;
		
		System.out.print("Please enter how many lines you want to be printed: ");
		numbersPerLine=scan.nextInt();
		System.out.println();
		
		for(int i=0; i<numbersPerLine.length; i++){
			if(i%10==0)
				System.out.print("\n\t"+randomNumbers[i]);
			else
				System.out.print("\t"+randomNumbers[i]);
		}
	}
}