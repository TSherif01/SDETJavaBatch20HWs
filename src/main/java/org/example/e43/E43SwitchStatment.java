package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to enter their electricity usage in kWh
        System.out.println("Enter your electricity usage in kWh");

        // Capture the usage input
        int usage = scanner.nextInt();
        double bill = 0;
        int range = usage / 100;
        // Calculate bill using switch statement
        switch (range) {
            case 0:
                bill = usage * 0.12;
                break;
            case 1:
                bill = usage * 0.15;
                break;
            case 2:
                bill = usage * 0.20;
                break;
            default:
                if (usage >= 301) {
                    bill = usage * 0.25;
                } else {
                    System.out.println("Invalid usage entered");
                    return;
                }
                    break;
                }
                // Print the bill
                System.out.printf("Your electricity bill is $%.2f%n", bill);

                // Output: Your electricity bill is $____
        }
    }
