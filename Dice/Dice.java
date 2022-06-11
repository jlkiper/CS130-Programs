//Dice.java
//Jaylon Kiper
//10-3-18

public class Dice{

	public static void main(String[]args){
		
	int[]numbers = new int[6];
	
	int sum = 0;
	int low = 1;
	int high = 50;
	int randNum;
	
	for(int count = 0; count < 6; count ++){
	randNum = (int)(Math.random()*(high-low+1))+low;
	
	System.out.println("Please generate 6 random numbers between 1 and 50:"+ randNum);
	sum= sum + randNum;
	numbers[count] = randNum;
	}//169
    }
}