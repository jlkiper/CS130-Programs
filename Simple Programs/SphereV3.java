//SphereV3.java
//Jaylon Kiper
//10-30-18

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SphereV3{
	public static Scanner scan=new Scanner(System.in);
	
	public static void main(String[]args){
		double radius=readRadius();
		double volume=computeVolume(radius);
		double area=computeArea(radius);
		printSphere(radius,volume,area);
		
		System.exit(0);
	}
	
	public static double readRadius(){
		String strRadius;
		strRadius=JOptionPane.showInputDialog("Please enter the radius of the sphere: ");
		double radius=Double.parseDouble(strRadius);
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
		String title="Here is the information about the Sphere:\n";
		String str="\tThe radius of the sphere is: "+String.format("\t%10.2f",r);
		str=str+"\n\tThe surface area of the sphere is: "+String.format("%10.2f",a);
		str=str+"\n\tThe volume of the sphere is: "+String.format("\t%10.2f",v);
		System.out.println(str);

	JOptionPane.showMessageDialog(null,str,title,JOptionPane.INFORMATION_MESSAGE);	
	}
}