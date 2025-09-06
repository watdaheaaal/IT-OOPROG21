/*
   Name: Turceno, James Gabriel B.
   Course / Year: BSIT - II
   Date: 23rd day of August, year 2025
   
   Simple Calculator with Validation
   Write a program that
   Accepts two numbers and an operation symbol (+, -, *, /).

   Use nested conditions to check if the second number is zero when dividing.

   Use a switch case to perform the operation

*/

import java.util.Scanner;

class PrelimAct6 {
   public static void main (String[] args){
   
      Scanner scanf = new Scanner(System.in);
      double num1, num2, out;
      char operator;
      
      System.out.printf("Enter 1st number: ");
      num1 = scanf.nextDouble();
      
      System.out.printf("Enter 2nd number: ");
      num2 = scanf.nextDouble();
      
      System.out.printf("List of operators: +, -, *, / \n");
      System.out.printf("\nSelect an operator: ");
      operator = scanf.next().charAt(0);      
      switch(operator){
         case '+':
            out = num1 + num2;
            System.out.printf("Sum: %.0f", out);
            break;
            
         case '-':
            out = num1 - num2;
            System.out.printf("Difference: %.0f", out);
            break;
            
         case '*':
            out = num1 * num2;
            System.out.printf("Product: %.0f", out);
            break;
                     
         case '/':
            if (num2 == 0){
               System.out.printf("ERROR 404: Cannot divide by 0");
            }else{
               out = num1 / num2;
               System.out.printf("Qoutient: %.2f", out);
            }
            break;
            
         default:
            System.out.println("ERROR 404: Invalid Operator, please try again.");
      }
   }
}