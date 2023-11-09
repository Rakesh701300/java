package com.Rakesh;
import java.util.*;
public class DemoMethod {

    int id_no;
    String name;
    String course;
    float avg_marks;
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
    public static void main(String[] args){
      
               DemoMethod   bj=new DemoMethod();
                bj.read();
                bj.showdata();
      
         }
}
