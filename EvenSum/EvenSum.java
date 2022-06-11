//EvenSum.java
//Jaylon Kiper
//Date: 10-29-18

import java.util.Scanner;

public class EvenSum{
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int intval, c=0;
		
		System.out.println("Enter the value: ");
		intval=scan.nextInt();
		
		if (intval<2)
			System.out.println("Error!!! Enter a value greater than 2");
		
		else{
			for(int i=2;i<=intval;i+=2)
				c=c+i;
				System.out.println("The Count Of Even Numbers is: "+c);
		}
	}
}