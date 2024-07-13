package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        int morningExpense = 100;
        int afternoonExpense = 50;
        int eveningExpense = 250;

        // Calculate total expense
        int sum = morningExpense + afternoonExpense + eveningExpense;
        System.out.println("Your total daily expense is: " + sum);

        // Define a budget
        int budget = 150;

        // Check if within budget
        if (sum<budget) {
            System.out.println("You are within budget.");
        }else{
            System.out.println("You are not within budget.");
        }
    }
    }

