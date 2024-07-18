package org.example.e34;

import java.util.Scanner;

public class E34NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Print prompt for user to enter 3 distinct numbers separated by spaces
        System.out.println("Please enter 3 distinct numbers separated by spaces");
        // Capture the three numbers input
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        // Use nested if-else statements to find the largest number
        if (num1>num2) {
            if (num1>num3) {
                System.out.println("The largest number is " + num1);
                if (num2>num1) {
                    if (num2>num3) {
                        System.out.println("The largest number is " + num2);
                        if (num3>num2) {
                            if (num3>num1) {
                                System.out.println("The largest number is " + num3);
                            }
                        }
                    }
                }
            }
        }
    }
}
