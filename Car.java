package com.Rakesh;
//creating  class Car
public class Car {
	      //declaring variables
          private String make , model;
          private short year;
          private int price;
          //creating constructor with parameter
          public Car(String make,String model,short year,int price)
          {
        	  this.make=make;
        	  this.model=model;
        	  this.year=year;
        	  this.price=price;
          }
          //creating method 
          public void display() {
        	  System.out.println("MAKE"+" "+make);
        	  System.out.println("MODEl"+" "+model);
        	  System.out.println("YEAR"+" "+year);
        	  System.out.println("PRICE"+" "+price);
          }
          public static void main(String[] args)
          {
        	  Car car=new Car("tata","f20",(short)2012,200000);
        	  car.display();
        	  
          }
          
}
