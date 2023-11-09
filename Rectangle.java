package com.Rakesh;
//creating class with class name Rectangle
public class Rectangle {

	int length,breadth; //variables declaration
	//creating Constructor by Constructor name Rectangle
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	
	}
	//creating method by method name getArea of return type integer
	public int getArea()
	{
		return length*breadth;
	}
	public static void main(String[] args)
	{
		Rectangle rectangle1=new Rectangle(5,7);//creating object1
		Rectangle rectangle2=new Rectangle(8,7);//creating object2
		//calling methods
		int area1=rectangle1.getArea();
		int area2=rectangle2.getArea();
		if(area1>area2)
		{
			System.out.println("Rectangle1>Rectangle2");
		}
		else if(area1<area2)
		{
			System.out.println("Rectangle1<Rectangle2");
		}
		else
		{
			System.out.println("They are equal");
		}
	}
}
