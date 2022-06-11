//Exam2.java
//Jaylon Kiper
//10-2-18

import java.util.Scanner;

public class Exam2{
	static public Scanner scan = new Scanner(System.in);
	public static void main(String[]args){
		System.out.println("Exams are never fun.");
		System.out.println("This is a slash /.");
		double number1, number2;
		double radius = 5.2;
		final double PI= 3.141592;
		System.out.print("Please enter the first number:");
		number1 = scan.nextDouble();
		System.out.print("Please enter the second number:");
		number2 = scan.nextDouble();
		System.out.println("The first number is:"+number1);
		System.out.println("The second number is:"+number2);
	}
}