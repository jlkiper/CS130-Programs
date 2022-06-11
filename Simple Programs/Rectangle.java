//Rectangle.java
//Jaylon Kiper
//11-6-18

public class Rectangle{
	private double length;
	private double width;
	
	public Rectangle(){
		length=1.0;
		width=1.0;
	}
	public Rectangle(double l, double w){
		length=l;
		width=w;
	}
	public Rectangle(Rectangle rect){
		this.length=rect.length;
		this.width=rect.width;
	}
	public void setLength(double length){
		this.length=length;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public boolean equals(Rectangle rect){
		if((length==rect.length)&&(width==rect.width))
			return true;
		else{
			return false;
		}
	}
	public double area(){
		return length*width;
	}
	public double perimeter(){
		return 2.0*(length+width);
	}
	public void printRectangle(){
		String str="";
		str=str+"\nHere is the information about Rectangle:\n";
		str=str+"\tThe length is "+String.format("%10.2f",length);
		str=str+"\n\tThe width is "+String.format("%10.2f",width);
		str=str+"\n\tThe Area of the Rectangle is "+String.format("%10.2f",area());
		str=str+"\n\tThe Perimeter of the Rectangle is "+String.format("%10.2f",perimeter());
		
		System.out.println(str);
	}
}