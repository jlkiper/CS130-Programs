//Circle.java
//Jaylon Kiper
//11-7-18

public class Circle{
	private double xCoordinate;
	private double yCoordinate;
	private double radius;
	
	public Circle(){
		xCoordinate=0.0;
		yCoordinate=0.0;
		radius=1.0;
	}
	public Circle(double x, double y){
		xCoordinate=x;
		yCoordinate=y;
	}
	public Circle(double x, double y, double r){
		xCoordinate=x;
		yCoordinate=y;
		radius=r;
	}
	public Circle(Circle circ){
		this.xCoordinate=circ.xCoordinate;
		this.yCoordinate=circ.yCoordinate;
		this.radius=circ.radius;
	}
	public void setX(double xCoordinate){
		this.xCoordinate=xCoordinate;
	}
	public void setY(double yCoordinate){
		this.yCoordinate=yCoordinate;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public void setCircle(double x, double y, double r){
		this.xCoordinate=xCoordinate;
		this.yCoordinate=yCoordinate;
		this.radius=radius;
	}
	public double getX(){
		return xCoordinate;
	}
	public double getY(){
		return yCoordinate;
	}
	public double getRadius(){
		return radius;
	}
	public double area(){
		return Math.PI*Math.pow(radius,2);
	}
	public double circumference(){
		return 2.0*Math.PI*radius;
	}
	public void printCircle(){
		String str="";
		str=str+"\nHere is the information about Circle:\n";
		str=str+"\tThe xCoordinate is "+String.format("%10.2f",xCoordinate);
		str=str+"\n\tThe yCoordinate is "+String.format("%10.2f",yCoordinate);
		str=str+"\n\tThe radius is "+String.format("%10.2f",radius);
		str=str+"\n\tThe Area of the Circle is "+String.format("%10.2f",area());
		str=str+"\n\tThe Circumference of the Circle is "+String.format("%10.2f",circumference());
		
		System.out.println(str);
	}
}