package com.Rakesh;
import java.util.*;
//creating class 
public class Student {
	//declaring variables
	private int Idno;
	private String name;
	private String course;
	private float average;
	//creating read method
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student id");
		Idno=sc.nextInt();
		System.out.println("Enter Student name");
		name=sc.next();
		System.out.println("Enter Student course");
		course=sc.next();
		System.out.println("Enter Student average marks");
		average=sc.nextFloat();
        sc.close();
	}
	//creating display method
	public void display()
	{
		System.out.println("Id"+" "+Idno);
		System.out.println("name"+" "+name);
		System.out.println("course"+" "+course);
		System.out.println("average"+" "+average);
		
	}
	public static void main(String[] args)
	{
		Student obj=new Student();
		obj.read();
		obj.display();
	}
}
