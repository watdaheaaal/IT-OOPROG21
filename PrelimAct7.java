/*
Name: Turceno, James Gabriel B.
Course / Year: BSIT-II
PrelimAct 7:  
Make a program that Takes a score (0–100). Use nested conditions to check pass/fail. If passed, use a switch case:

90–100: "Excellent"

75–89: "Good"

60–74: "Fair"

If failed, print "Failed."
*/

import java.util.Scanner;

class PrelimAct7 {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int grade;

        System.out.print("Enter Grade between 0-100: ");
        grade = scanf.nextInt();


        if (grade < 0 || grade > 100) {
            System.out.println("ERROR 404: Enter a grade between 0-100");
        } 

        else if (grade < 60) {
            System.out.println("Failed.");
        } 
  
        else {
            int category;

            // Convert grade to category
            if (grade >= 90 && grade <= 100) {
                category = 1; // Excellent
            } else if (grade >= 75 && grade <= 89) {
                category = 2; // Good
            } else if (grade >= 60 && grade <= 74) {
                category = 3; // Fair
            } else {
                category = 0; // Invalid, just a fallback
            }

            // Switch based on the category
            switch (category) {
                case 1:
                    System.out.println("Excellent");
                    break;
                case 2:
                    System.out.println("Good");
                    break;
                case 3:
                    System.out.println("Fair");
                    break;
                default:
                    System.out.println("ERROR 404: Invalid number please try again.");
            }
        }
    }
}
