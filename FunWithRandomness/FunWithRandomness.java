//FunWithRandomness.java
//Jaylon Kiper
//10-9-18

import static java.lang.Math.*;

public class FunWithRandomness{

	public static void main(String[]args){
		
		final int START=1;
		final int END=10000;
		final int MAX_COUNT=5000;

		System.out.println("\nThe Value of Pi is: "+PI);
		System.out.println("\nThe Value of e is: "+E);

		System.out.println("\n We are creating "+MAX_COUNT+" numbers between "+START+" and "+END+" both inclusive.");
		
		//Create 5000 numbers between 1 and 10000 (both inclusive) using random() of Math class.
		int[]numbers=new int[MAX_COUNT];
		
		for(int count=0; count<numbers.length; count++)
			numbers[count]=(int)(random()*(END-START+1))+START;
		
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