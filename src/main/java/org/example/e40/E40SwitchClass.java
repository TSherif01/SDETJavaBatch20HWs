package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to enter the name of the instructor
        System.out.println("Enter the name of your instructor.");

        // Capture the instructor name input
        String name = scanner.next();
        String responsibility;

        // Determine the responsibility based on the instructor's name using a switch statement
        switch (name) {
            case "Ashgar":
            responsibility = "Will take care of Java Assignment";
            break;

            case "Moazzam":
            responsibility = "Will take care of SDLC Assignment";
            break;

            case "Weqas":
            responsibility = "Will take care of Selenium Assignment";
            break;

            case "Asel":
            responsibility = "Will take care of every Assignment";
            break;

            default:
            responsibility = "Invalid instructor selected";
            break;
        }

        // Print the responsibility
        System.out.println(responsibility);

    }
}
