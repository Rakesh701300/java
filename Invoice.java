package com.Rakesh;
import java.util.Scanner;

class Invoice {
    private String invoiceId;
    private double invoicePrice;
    private String vendorName;
    private String invoiceName;
    private String location;

    // Default constructor
    public Invoice() {
    }

    // Method to add an invoice by reading from the user
    public void addInvoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Invoice ID: ");
        invoiceId = scanner.nextLine();
        System.out.print("Enter Invoice Price: ");
        invoicePrice = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline character
        System.out.print("Enter Vendor Name: ");
        vendorName = scanner.nextLine();
        System.out.print("Enter Invoice Name: ");
        invoiceName = scanner.nextLine();
        System.out.print("Enter Location: ");
        location = scanner.nextLine();
    }

    // Method to display all data members of the invoice
    public void displayInvoice() {
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Invoice Price: " + invoicePrice);
        System.out.println("Vendor Name: " + vendorName);
        System.out.println("Invoice Name: " + invoiceName);
        System.out.println("Location: " + location);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of invoices (n): ");
        int n = scanner.nextInt();

        // Create an array to store 'n' Invoice objects
        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            invoices[i] = new Invoice();
            System.out.println("Enter details for Invoice " + (i + 1) + ":");
            invoices[i].addInvoice();
        }

        System.out.println("Invoice Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Invoice " + (i + 1) + ":");
            invoices[i].displayInvoice();
            System.out.println();
        }
    }
}
