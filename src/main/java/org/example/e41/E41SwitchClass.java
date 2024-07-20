package org.example.e41;

import java.util.Scanner;

public class E41SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print prompt for user to enter the time of day
        System.out.println("Enter the time of day (morning, afternoon, evening, night)");

        // Capture the time of day input
        String timeOfDay = scanner.next();
        String meal;

        // Recommend meal using switch statement
        switch (timeOfDay) {
            case "morning":
                meal = "Recommended meal: Breakfast";
                break;

            case "afternoon":
                meal = "Recommended meal: Lunch";
                break;

            case "evening":
                meal = "Recommended meal: Dinner";
                break;

            case "night":
                meal = "Recommended meal: Snack";
                break;
            default:
                meal = "Invalid time of day entered";
                break;
        }
        //    Print "Invalid time of day entered"
        System.out.println(meal);



    }
}
