package org.example.e12;

public class E12CalculateCostArithmeticConcat {
    public static void main(String[] args) {
        // Declare the float variables and assign values
        float item1 = 13.3f;
        float item2 = 11.1f;
        float item3 = 7.99f;
        float item4 = 33.63f;
        // Calculate the total cost

        float totalCost = (item1+item2+item3+item4);

        // Calculate the average cost

        float  averageCost = totalCost/4;

        // Print the results
      //  System.out.println("The total cost is " + totalCost);
        //System.out.println("The average cost is " + averageCost);

        System.out.println("The total cost is " + totalCost);
        System.out.println("The average cost is " + averageCost);
    }
}
