package com.Rakesh;

import java.util.Scanner;

public class Bill {
    private int billno;
    private String description;
    private double sales_amount;
    private double discount;
    private double amt_afterdiscount;

    public void readBill() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bill Number: ");
        billno = sc.nextInt();
        System.out.println("Enter Description: ");
        description = sc.next();
        System.out.println("Enter Sales Amount: ");
        sales_amount = sc.nextDouble();
    }

    public void calculateBill() {
        if (sales_amount > 50000) {
            discount = 0.10 * sales_amount;
        } else {
            discount = 0.02 * sales_amount;
        }
        amt_afterdiscount = sales_amount - discount;
    }

    public void showBill() {
        System.out.println("Bill Number: " + billno);
        System.out.println("Description: " + description);
        System.out.println("Sales Amount: " + sales_amount);
        System.out.println("Discount: " + discount);
        System.out.println("Amount After Discount: " + amt_afterdiscount);
    }

    public static void main(String[] args) {
        Bill bill1 = new Bill();
        Bill bill2 = new Bill();

        System.out.println("Enter details for Bill 1:");
        bill1.readBill();
        bill1.calculateBill();
        System.out.println("\nBill 1 details:");
        bill1.showBill();

        System.out.println("\nEnter details for Bill 2:");
        bill2.readBill();
        bill2.calculateBill();
        System.out.println("\nBill 2 details:");
        bill2.showBill();
    }
}
