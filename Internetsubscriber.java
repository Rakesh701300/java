package com.Rakesh;
import java.util.*;
//creating class by classname Internetsubscriber
public class Internetsubscriber {
		      public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter the total data consumed in GB
		        System.out.print("Enter the total data consumed in GB: ");
		        double totalDataConsumed = scanner.nextDouble();

		        double billAmount;

		        // Calculate the bill amount based on the provided logic
		        if (totalDataConsumed < 10) {
		            billAmount = 300.0; // Basic charge
		        } else if (totalDataConsumed >= 10 && totalDataConsumed <= 30) {
		            billAmount = 300.0 + 5.0 * (totalDataConsumed - 10);
		        } else {
		            billAmount = 400.0 + 3.0 * (totalDataConsumed - 30);
		        }

		        // Display the calculated bill amount
		        System.out.println("Monthly Bill Amount: Rs. " + billAmount);

		        scanner.close();
		    }
		}
