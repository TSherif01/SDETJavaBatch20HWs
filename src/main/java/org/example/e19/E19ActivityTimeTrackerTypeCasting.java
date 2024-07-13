package org.example.e19;

public class E19ActivityTimeTrackerTypeCasting {
    public static void main(String[] args) {
        // Declare the double variables and assign values
        double activity1 = 23.13;
        double activity2 = 10.1;
        double activity3 = 34.2;

        // Calculate total time
        double totalTime = activity1 + activity2 + activity3;

        // Type cast the total time to an int to get total minutes
        int totalMinutes = (int) totalTime;

        // Calculate hours and remaining minutes
        int hours = totalMinutes/60;
        int minutes = totalMinutes % 60;

        // Print the results
        System.out.println("The original total time is " + totalTime);
        System.out.println("The converted time is " + hours + " hr and " + minutes + " mins.");

    }
}
