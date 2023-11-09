package com.Rakesh;

public class Product1 {
	    // Data members
	    private int prdid;
	    private String prddescription;
	    private String batchcode;
	    private double price;
	    private double profit;

	    // Method to add product with arguments
	    public void addProduct(int prdid, String prddescription, String batchcode, double price) {
	        this.prdid = prdid;
	        this.prddescription = prddescription;
	        this.batchcode = batchcode;
	        this.price = price;
	        
	        // Display the values to the user
	        System.out.println("Product ID: " + this.prdid);
	        System.out.println("Product Description: " + this.prddescription);
	        System.out.println("Batch Code: " + this.batchcode);
	        System.out.println("Price: " + this.price);
	    }

	    // Method to calculate profit with return type and no arguments
	    public double calculateProfit() {
	        if (price >= 10000 && price <= 100000) {
	            profit = 0.10 * price;
	        } else if (price > 100000 && price <= 500000) {
	            profit = 0.15 * price;
	        } else if (price > 500000) {
	            profit = 0.20 * price;
	        } else {
	            profit = 0; // If price doesn't fall into any category, profit is zero
	        }
	        return profit;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        Product1 product = new Product1();
	        product.addProduct(1, "mega Product", "Af0123", 75000.0);
	        double profit = product.calculateProfit();
	        System.out.println("Profit: " + profit);
	    }
	}
