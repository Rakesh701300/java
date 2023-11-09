package com.Rakesh;
import java.util.Scanner;
public class OddEven {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int oddCount = 0;
	        int evenCount = 0;

	        int number;
	        while (true) {
	            System.out.print("Enter a number (or 0 to exit): ");
	            number = scanner.nextInt();

	            if (number == 0) {
	                break;
	            }

	            // Check if the number is even or odd
	            if (number % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	        // Print the total count of even and odd numbers
	        System.out.println("Total even numbers: " + evenCount);
	        System.out.println("Total odd numbers: " + oddCount);
	    }
	}
