package org.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Declare a boolean variable isSunny
        boolean isSunny;

        // Print "Is it sunny outside? (true/false)"
        System.out.println("Is it sunny outside? (true/false)");

        // Capture the user's input and store it in isSunny
        isSunny = scanner.nextBoolean();

        {if (isSunny) {
            System.out.println("It is a sunny day, I should go somewhere!");
            System.out.println("What is the temperature outside?");
            int temp = scanner.nextInt();
            if (temp>85){
                System.out.println("I am going to the beach!");
            } else {
                System.out.println("I am going to the park!");
            }
        } else
            System.out.println("I stay home and practice Java");

        // Declare an integer variable temperature
        //int temp = scanner.nextInt();

        // Use an if-else statement to check if it is sunny
        //if (temp>85){
            //System.out.println("I am going to the beach!");
        //} else {
            //System.out.println("I am going to the park!");
        //}
    }

        //if (isSunny=false); {
            //System.out.println("I stay home and practice Java");
        //}

    }
}
