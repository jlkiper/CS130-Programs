//SphereV1.java
//Jaylon Kiper
//10-30-18

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SphereV1{
	public static Scanner scan=new Scanner(System.in);
	
	public static void main(String[]args){
		double radius=readRadius();
		double volume=computeVolume(radius);
		double area=computeArea(radius);
		printSphere(radius,volume,area);
	}
	
	public static double readRadius(){
		System.out.print("\n Please enter the radius of the sphere: ");
		double radius=scan.nextDouble();
		System.out.flush();
		System.out.println();
		return radius;
	}
	
	public static double computeVolume(double r){
		double volume=4.0*Math.PI*r*r*r/3.0;
		return volume;
	}
	
	public static double computeArea(double r){
		return 4.0*Math.PI*r*r;
	}
	
	public static void printSphere(double r, double v, double a){
		System.out.println("\nHere is the information about the Sphere:");
		System.out.printf("\n\tThe radius of the sphere is:\t\t%12.2f cm", r);
		System.out.printf("\n\tThe surface area of the sphere is:\t%12.2f cm square", a);
		System.out.printf("\n\tThe volume of the sphere is:\t\t%12.2f cc", v);
	}
}