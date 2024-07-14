package org.example.e27;

public class E27GradeCalculatorElseIf {
    public static void main(String[] args) {
        // Hint: Declare 'score' as an int and assign 85 to it
        int score = 85;
        // Hint: Use if-else if statements to check grades A, B, C, D, F in order
        // Hint: Print the grade using System.out.println()
        if (score>90) {
            System.out.println("A");
        }else if (score>80) {
            System.out.println("B");
        }else if (score>70) {
            System.out.println("C");
        }else if (score>60) {
            System.out.println("D");
        }else if (score>50) {
            System.out.println("F");
        }

        // Expected output: "Your grade is: B"
    }
}