package org.example.e16;

public class E16DistanceConversionModulus {
    public static void main(String[] args) {
        // Declare the int variable and assign a value
        int totalMeters = 1030;

        // Calculate kilometers and meters
        int kilometers = totalMeters/1000;
        int meters = totalMeters%1000;

        // Print the results
        System.out.println("1030 meters is equal to " + kilometers + "km and " + meters + "m.");


    }
}
