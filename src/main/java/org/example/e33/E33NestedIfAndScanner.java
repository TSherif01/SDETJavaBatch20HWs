package org.example.e33;

import java.util.Scanner;

public class E33NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner (System.in);
        // Print prompt for user to enter a number
        System.out.println("Please enter a number");
        // Capture the number input
        int number = scanner.nextInt();
        // Classify the number

        // Use an if-else statement to check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("Value is even");
            if (number > 1000) {
                System.out.println("Even value is large");
            } else {
                System.out.println("Even value is just right");
            }
        } else {
            System.out.println("Value is odd");
            if (number > 1000) {
                System.out.println("Odd value is large");
            } else {
                System.out.println("Odd value is just right");
            }
        }
        // Create a Scanner object to read input from the console



    }
}
