package com.Rakesh;

import java.util.Scanner;

public class StudentRecord{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = 10;
        int[] rollNo = new int[numStudents];
        String[] names = new String[numStudents];
        double[] averageMarks = new double[numStudents];

        // Read and store student records
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            rollNo[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Average Marks: ");
            averageMarks[i] = scanner.nextDouble();
        }

        // Display the student list who scored above 60 as average marks
        System.out.println("\nStudents who scored above 60:");
        for (int i = 0; i < numStudents; i++) {
            if (averageMarks[i] > 60) {
                System.out.println("Roll No: " + rollNo[i]);
                System.out.println("Name: " + names[i]);
                System.out.println("Average Marks: " + averageMarks[i]);
                System.out.println();
            }
        }
    }
}

