package org.example.e36;

import java.util.Scanner;

public class E36LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to enter their monthly rent expense
        System.out.println("Please enter your monthly rent expense");

        // Capture the rent expense input
        int rent = scanner.nextInt();

        // Print prompt for user to enter their monthly food expense
        System.out.println("What is your monthly food expense?");

        // Capture the food expense input
        int food = scanner.nextInt();

        // Print prompt for user to enter their monthly transportation expense
        System.out.println("What is your monthly transportation expense?");

        // Capture the transportation expense input
        int trans = scanner.nextInt();

        // Print prompt for user to enter their monthly entertainment expense
        System.out.println("Please enter your monthly entertainment expense?");

        // Capture the entertainment expense input
        int entertainment = scanner.nextInt();

        if (rent > food && trans > entertainment) {
            System.out.println("You are prioritizing essentials well.");
        } else if (rent > food || trans > entertainment) {
            System.out.println("You are on the right track, but could improve.");
        } else if (rent < food && trans < entertainment) {
            System.out.println("You need to rethink your spending priorities.");
        }


    }
}
