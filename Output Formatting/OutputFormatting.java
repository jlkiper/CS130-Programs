//OutputFormatting.java
//Jaylon Kiper
//10-9-18

public class OutputFormatting{
	
	public static void main(String[]args){
		
		int numbers[] = new int [args.length];
		
		//Copy the array of arguments into numbersHeadings array.
		
		for (int count = 0; count < args.length; count++)
			numbers [count] = Integer.parseInt (args [count] );
		
		//Print Multiplication Table Headings.
		System.out.printf( "%n%10s", "MultipesOf ");
		for (int i=0; i < numbers.length; i++)
			System.out.printf( "% 10d", numbers[i]);
		System.out.println( "\n");
		
		//Print the Multiplication Table, multiplying a give number by a number from 1 to 10.
		
		for (int count = 1; count < 11; count++){
			System.out.printf(" % 10d", count);
			for (int i=0; i < args.length; i++)
				System.out.printf(" % 10d", count * numbers[i]);
			System.out.println();
		}//Closes Outer for Loop
		
		double x = 15.674, y = 235.73, z = 9525.9864;
		System.out.println("\nOutputting the values of x,y,and z with two decimal places. ");
		System.out.printf(" Value of x = %.2f%n",x);
		System.out.printf(" Value of y = %.2f%n",y);
		System.out.printf(" Value of z = %.2f%n",z);
		
		System.out.println("\nOutputting the values of x,y,and z with three decimal places. ");
		System.out.printf(" Value of x = %.3f%n",x);
		System.out.printf(" Value of y = %.3f%n",y);
		System.out.printf(" Value of z = %.3f%n",z);
		
		System.out.println("\nOutputting the values of x,y,and z with four decimal places. ");
		System.out.printf(" Value of x = %.4f%n",x);
		System.out.printf(" Value of y = %.4f%n",y);
		System.out.printf(" Value of z = %.4f%n",z);
		
		System.out.println("\nOutputting the values of x,y,and z with two decimal places aligned. ");
		System.out.printf(" Value of x = %10.2f%n",x);
		System.out.printf(" Value of y = %10.2f%n",y);
		System.out.printf(" Value of z = %10.2f%n",z);
		
		System.out.println("\nOutputting the values of x,y,and z with three decimal places aligned. ");
		System.out.printf(" Value of x = %10.3f%n",x);
		System.out.printf(" Value of y = %10.3f%n",y);
		System.out.printf(" Value of z = %10.3f%n",z);
		
		System.out.println("\nOutputting the values of x,y,and z with four decimal places aligned. ");
		System.out.printf(" Value of x = %10.4f%n",x);
		System.out.printf(" Value of y = %10.4f%n",y);
		System.out.printf(" Value of z = %10.4f%n",z);
	}//Closes Main
}//Closes Class