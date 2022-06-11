//TestUtility.java
//Jaylon Kiper
//11-27-18

public class TestUtility{
	
	public static void main(String[]args){
		int numb1=-28,numb2=13,numb3=37,numb4=1113,numb5=6;
		
		double numb6=5.2;
		
		String str="Computer";
		
		String str1="Program";
		
		String sub=str.substring(2,5);
		
		String sub1=str1.substring(3);
		
		System.out.println("Check isEven:"+"\n\tIt is "+Utility.isEven(numb1)+" that "+numb1+" is even.");
		System.out.println("Check isEven:"+"\n\tIt is "+Utility.isEven(numb2)+" that "+numb2+" is even.");
		
		System.out.println("Check isOdd:"+"\n\tIt is "+Utility.isOdd(numb2)+" that "+numb2+" is odd.");
		System.out.println("Check isOdd:"+"\n\tIt is "+Utility.isOdd(numb5)+" that "+numb5+" is odd.");
		
		System.out.println("Check isPrime:"+"\n\tIt is "+Utility.isPrime(numb3)+" that "+numb3+" is prime.");
		System.out.println("Check isPrime:"+"\n\tIt is "+Utility.isPrime(numb4)+" that "+numb4+" is prime.");
		
		System.out.println("Check isPerfect:"+"\n\tIt is "+Utility.isPerfect(numb5)+" that "+numb5+" is a perfect number.");
		System.out.println("Check isPerfect:"+"\n\tIt is "+Utility.isPerfect(numb4)+" that "+numb4+" is a perfect number.");
		
		System.out.println("Check isASubString:"+"\n\tIt is "+Utility.isASubString(sub,str)+" that "+sub+" is a sub string.");
		System.out.println("Check isASubString:"+"\n\tIt is "+Utility.isASubString(sub1,str)+" that "+sub1+" is a sub string.");
		System.out.println();
		
		int c,fact = 1;
     
		System.out.println("Enter an integer to calculate it's factorial: "+numb2);
     
		if (numb2 < 0)
         System.out.println("Number should be non-negative.");
		else
		{
         for (c = 1; c <= numb2; c++)
            fact = fact*c;
     
         System.out.println("Factorial of "+numb2+" is = "+fact);
		}
		System.out.println();
		
		long d,fact1 = 1;
     
		System.out.println("Enter an integer to calculate it's factorial: "+numb4);
     
		if (numb4 < 0)
         System.out.println("Number should be non-negative.");
		else
		{
         for (d = 1; d <= numb4; d++)
            fact1 = fact1*d;
     
         System.out.println("Factorial of "+numb4+" is = "+fact1);
		}
		System.out.println();
		
		double e,fact2 = 1;
     
		System.out.println("Enter an integer to calculate it's factorial: "+numb6);
     
		if (numb6 < 0.0)
         System.out.println("Number should be non-negative.");
		else
		{
         for (e = 1.0; e <= numb6; e++)
            fact2 = fact2*e;
     
         System.out.println("Factorial of "+numb6+" is = "+fact2);
		}
		System.out.println();
	}
}