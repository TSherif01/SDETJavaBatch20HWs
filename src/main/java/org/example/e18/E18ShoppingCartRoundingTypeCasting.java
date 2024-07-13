package org.example.e18;

public class E18ShoppingCartRoundingTypeCasting {
    public static void main(String[] args) {
        // Declare the double variables and assign values
        double item1 = 99.99;
        double item2 = 33.3;
        double item3 = 7.3;

        // Calculate total cost
        double totalCost = item1 + item2 + item3;

        // Type cast the double to an int to round it down
        int roundedCost = (int) totalCost;

        // Print the results
        System.out.println("The original total cost is $" + totalCost + " and the rounded cost is $" + roundedCost);

    }
}
