package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to answer if it is the weekend
        System.out.println("Is it the weekend? true/false");

        // Capture the weekend input
        boolean weekend = scanner.nextBoolean();

        // Determine the subject based on the input
        System.out.println("Are you available? true/false");

        // If it is the weekend
        boolean available = scanner.nextBoolean();

        //    Set subject to "Java"
        String subject;
        // Otherwise
        //    Set subject to "manual testing"
        if (weekend == true && available == true) {
            subject = "java";
        } else if (!weekend && available == true) {
            subject = "manual testing";
        } else {
            subject = "not available";
        }
        // Print the subject suggestion
        System.out.println("Today you will be learning " + subject);
        // Output: Today you will be learning ____


    }
}
