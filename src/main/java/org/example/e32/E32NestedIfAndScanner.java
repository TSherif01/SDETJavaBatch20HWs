package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner (System.in);
        // Print prompt for user to enter gender
        System.out.println("Please enter your gender: M or F");
        // Capture the gender input
        String gender = scanner.next();
        // Print prompt for user to enter age
        System.out.println("Please enter your age");
        // Capture the age input
        int age = scanner.nextInt();
        // Classify based on gender and age
        if (age > 25) {

            if (gender.equals("F")) {
            System.out.println("Woman");
        } else {
            System.out.println("Man");
        }
        }

        if (age < 25){

            if (gender.equals("F")) {
            System.out.println("Girl");
        } else {
            System.out.println("Boy");
        }
        }

        // Create a Scanner object to read input from the console



    }
}
