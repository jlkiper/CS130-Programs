//TriangleArea.java
//Jaylon Kiper
//Date: 10-26-18

import java.util.Scanner;
import java.text.DecimalFormat;

public class TriangleArea{
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		double a,b,c,s,area;
		
		System.out.print("Enter the length of side a: ");
		a=scan.nextDouble();
		System.out.println();
		
		System.out.print("Enter the length of side b: ");
		b=scan.nextDouble();
		System.out.println();
		
		System.out.print("Enter the length of side c: ");
		c=scan.nextDouble();
		System.out.println();
		
		s=(a+b+c)/2;
		area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area: "+fmt.format(area));
	}
}