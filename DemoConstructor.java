package com.Rakesh;

import java.util.Scanner;

public class DemoConstructor {
	 int id_no;
	 String name;
	 String course;
	 float avg_marks;
	 public DemoConstructor(int id,String sname,String scourse,float avg) {
	     id_no=id;
	     name=sname;
	     course=scourse;
	     avg_marks=avg;
	 }
	    public void read(){
	         Scanner sc=new Scanner(System.in);
	         System.out.println("Enter your Id");
	         id_no=sc.nextInt();
	         System.out.println("Enter Your name");
	         name=sc.next();
	         System.out.println("Enter course");
	         course=sc.next();
	         System.out.println("Enter avg marks");
	         avg_marks=sc.nextFloat();
	         sc.close();
	       }
	    public void showdata()
	     {
	      System.out.println("IDNO"+id_no); 
	       System.out.println("NAME"+name); 
	        System.out.println("COURSE"+course); 
	       System.out.println("AVG_MARKS"+avg_marks);
	        if(avg_marks>=75)
	            {
	            System.out.println("Grades+A");
	            }
	           else{
	                 System.out.println("Grades+A");
	                 }
	    }
	 public static void main(String[] args)
	 {
		 DemoConstructor ob=new DemoConstructor(12,"rakesh","c++",123);
		 ob.showdata();
		 ob.read();
		 ob.showdata();
	 }

}
