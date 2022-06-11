//MyProgram.java
//Jaylon Kiper
//This program reads a word from the keyboard , stores it in.
//The variable word prints on the screen.

import java.util.Scanner;

public class MyProgram{
	static public Scanner scan = new Scanner(System.in);
	public static void main(String[]args){
		String word;
		System.out.print("Please enter a word: ");
		word = scan.next();
		System.out.println("");
		System.out.print("Here is the word read:"+ word);
	}
}