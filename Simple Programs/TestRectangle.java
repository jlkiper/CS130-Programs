//TestRectangle.java
//Jaylon Kiper
//11-6-18

public class TestRectangle{
	
	public static void main(String[]args){
		Rectangle rect1=new Rectangle();
		rect1.printRectangle();
		
		Rectangle rect2=new Rectangle(2.5,2.0);
		rect2.printRectangle();
		
		Rectangle rect3=rect2;
		rect3.printRectangle();
		System.out.println("\nIt is "+(rect3==rect2)+" that rect2 and rect3 are the same.\n");
		
		Rectangle rect4=new Rectangle(rect3);
		System.out.println("It is "+rect3.equals(rect4)+" that rect4 is a copy of rect3.");
		
		rect3.setLength(5.1);
		rect3.setWidth(2.0);
		rect3.printRectangle();
		
		System.out.println("The length of rect3 is: "+rect3.getLength());
		System.out.println("The width of rect3 is: "+rect3.getWidth());
		System.out.println("The area of rect4 is: "+rect4.area());
		System.out.println("The perimeter of rect4 is: "+rect4.perimeter());
	}
}