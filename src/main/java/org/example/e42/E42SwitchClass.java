package org.example.e42;

import java.util.Scanner;

public class E42SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to enter the day of the week
        System.out.println("Enter the day of the week (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)");

        // Capture the day of the week input
        int dayOfWeek = scanner.nextInt();
        String activity;

        // Suggest activity using switch statement
        switch (dayOfWeek){
            case 1:
            activity = "Go to the gym";
            break;

            case 2:
            activity = "Attend a coding meetup";
            break;

            case 3:
            activity = "Go for a mid-week run";
            break;

            case 4:
            activity = "Take a cooking class";
            break;

            case 5:
            activity = "Movie night";
            break;

            case 6:
            activity = "Family day";
            break;

            case 7:
            activity = "Relax and recharge";
            break;

            default:
            activity = "Invalid day entered";
            break;
        }
        // Create a Scanner object to read input
        System.out.println(activity);
        // Print prompt for user to enter the day of the week

        // Suggest activity using switch statement

    }
}
