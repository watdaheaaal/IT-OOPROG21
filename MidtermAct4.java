/*
   Name: James Gabriel B. Turceno
   Course: BSIT - II
   
   Description:
   
   Create a calculator that repeatedly asks the user to enter two numbers and an operation (+,-,*,/). 
   Use a switch to handle the operation and a while loop to allow the user to perform multiple calculations until they type "no".
   Requirements:
   
   Use Scanner for input.
   Use switch to select the operation.
   Use while loop for repetition.
*/

import java.util.Scanner;

class MidtermAct4 {
   public static void main(String[] args){
      Scanner scanf = new Scanner(System.in);
      int num1, num2;
      float out;
      String choice = "yes";
      char oper;
      
      while(!choice.equalsIgnoreCase("no")) {
      
      System.out.printf("Enter two numbers: ");
      num1 = scanf.nextInt();
      num2 = scanf.nextInt();
      
      System.out.println("Operators: +,-,*,/ \n");
      System.out.printf("Select operation: ");
      oper = scanf.next().charAt(0);
      
      switch(oper){
         case '+':
            out = num1 + num2;
            System.out.printf("Sum: %d\n", (int)out);
            break;
         case '-':
            out = num1 - num2;
            System.out.printf("Difference: %d\n", (int)out);
            break;
         case '*':
            out = num1 * num2;
            System.out.printf("Product: %d\n", (int)out);
            break;
         case '/':
            if(num2 != 0){
                out = num1 / num2;
                System.out.printf("Qoutient: %.2f\n", out);
            }else{
               System.err.println("ERROR 404: Division cannot be divided by 0.");
            }
            break;
         default:
            System.err.println("ERROR 404: Invalid operator choice.");
      }
      
      System.out.printf("Do you want to use calc again? type yes and no ");
      choice = scanf.next();
      }
      
      scanf.close();
   }
}