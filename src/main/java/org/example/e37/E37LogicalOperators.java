package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to answer if they are thirsty
        System.out.println("Are you thirsty? true/false");

        // Capture the thirsty input
        boolean thirsty = scanner.nextBoolean();

        // Print prompt for user to answer if they are sleepy
        System.out.println("Are you sleepy? true/false");

        // Capture the sleepy input
        boolean sleepy = scanner.nextBoolean();

        String drink;
        // Determine the drink based on the inputs
        if (thirsty && !sleepy) {
            drink = "water";
        } else if (thirsty && sleepy) {
            drink = "coffee";
            } else if (!thirsty && sleepy) {
            drink = "tea";
        } else {
            drink = "nothing";
        }
        // Print the drink suggestion
        System.out.println("Looks like you need to drink " + drink);

        // Output: Looks like you need to drink ___
    }
}
