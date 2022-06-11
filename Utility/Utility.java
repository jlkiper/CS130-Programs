//Utility.java
//Jaylon Kiper
//11-21-18

import static java.lang.Math.*;

public class Utility{
	
	public static boolean isEven(int N){
		if(N%2==0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int N){
		if(N%1==0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int N){
		for(int i=2;i<N/2;i++){
			if(N%i==0){
				return false;
			}
		}
		return true;
	}

	public static boolean isPerfect(int N){
		int sum=0;
		for(int i=1;i<N;i++){
			if(N%i==0)
				sum=sum+i;
		}
		return (sum==N);
	}
	
	public static boolean isASubString(String sub,String str){
		int found=str.indexOf(sub,0);
		if(found<0)
			return false;
		else
			return true;
	}

	public static int factorial(int N){
		int fact=1;
		for(int i=1;i<=N;i++)
			fact=fact*i;
		return fact;
	}
	
	public static long factorial(long N){
		long fact=1;
		for(long i=1;i<=N;i++)
			fact=fact*i;
		return fact;
	}
	
	public static double factorial(double N){
		double fact=1.0;
		for(double i=1;i<=N;i++)
			fact=fact*i;
		return fact;
	}
}