package org.example.e14;

public class E14PizzaPartyModulus {
    public static void main(String[] args) {
        // Declare the int variables and assign values
        int totalSlices = 14;
        int friends = 7;

        // Calculate slices per person
        int slicesPerPerson = totalSlices/friends;
        int leftoverSlices = totalSlices%slicesPerPerson;

        // Print the results
        System.out.println("Each person gets " + slicesPerPerson + " of slices.");
        System.out.println("There are " + leftoverSlices + " leftovers.");
    }
}
