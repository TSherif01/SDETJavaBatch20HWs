package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to enter their mark
        System.out.println("Please enter your mark.");

        // Capture the mark input
        int mark = scanner.nextInt();

        char grade = '-';
        // Determine the grade based on the mark
        if (mark >= 1 && mark <= 25) {
            grade = 'F';
        } else if (mark >= 26 && mark <= 45) {
            grade = 'E';
        } else if (mark >= 46 && mark <= 50) {
            grade = 'D';
        } else if (mark >= 51 && mark <= 60) {
            grade = 'C';
        } else if (mark >= 61 && mark <= 80) {
            grade = 'B';
        } else if (mark > 80 && mark <= 100) {
            grade = 'A';
        } else {
            System.out.println("Please enter valid mark");
        }
        // Print the grade
        System.out.println("Your grade is " + grade);
        // Output: Your grade is ____


    }
}
