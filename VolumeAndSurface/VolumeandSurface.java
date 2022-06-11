//VolumeandSurface.java
//Jaylon Kiper
//Date: 10-26-18

import java.util.Scanner;

public class VolumeandSurface{
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		double radius,volume,surfaceArea,pi=3.14;
		
		System.out.print("Enter the radius: ");
		radius=scan.nextDouble();
		System.out.println();
		
		volume= (4.0/3.0)*pi*(radius*radius*radius);
		
		surfaceArea= 4*pi*(radius*radius);
		
		System.out.print("Volume: "+volume);
		System.out.println();

		System.out.print("Surface Area: "+surfaceArea);
		System.out.println();
	}
}