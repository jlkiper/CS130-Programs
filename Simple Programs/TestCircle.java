//TestCircle.java
//Jaylon Kiper
//11-7-18

public class TestCircle{
	
	public static void main(String[]args){
		Circle circle1=new Circle();
		circle1.printCircle();
		
		Circle myCircle=new Circle(3.0,4.0);
		myCircle.printCircle();
		
		Circle mystery=new Circle(1.0,3.5,3.7);
		mystery.printCircle();
		
		Circle circle4=new Circle(myCircle);
		System.out.println("It is "+myCircle.equals(circle4)+" that circle4 is a copy of myCircle.");
		
		myCircle.setX(9.1);
		myCircle.setY(6.0);
		myCircle.setRadius(10.0);
		myCircle.printCircle();
		
		System.out.println("The xCoordinate of myCircle is: "+myCircle.getX());
		System.out.println("The yCoordinate of myCircle is: "+myCircle.getY());
		System.out.println("The radius of myCircle is: "+myCircle.getRadius());
		System.out.println("The area of circle4 is: "+circle4.area());
		System.out.println("The circumference of circle4 is: "+circle4.circumference());
	}
}