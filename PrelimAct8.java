/*
Bank Loan Eligibility Checker
Write a program that:
Accepts employment status (1 for Employed, 2 for Self-Employed, 3 for Unemployed) and salary.
Use a switch case on employment status:
Employed: Check with a nested condition: If salary ≥ 30,000, print "Loan Approved"; else "Loan Denied."
Self-Employed: If salary ≥ 50,000, print "Loan Approved"; else "Loan Denied."
Unemployed: Always print "Loan Denied."
*/

import java.util.*;

class PrelimAct8 {
   public static void main(String[] args){
   
      Scanner scanf = new Scanner(System.in);
      int salary, empStat, haha;
      
      
      System.out.printf("List Employment Status: \n1: Employed \n2: Self-Employment \n3: Unemployed\n");
      System.out.printf("Select employment status: ");
      empStat = scanf.nextInt();
      
      switch(empStat){
         case 1:
            System.out.println("You are employed and eligible to loan. \nEnter your salary: ");
            salary = scanf.nextInt();
            if(salary >= 30000){
               System.out.printf("Loan Approved!");
            }else {
               System.out.printf("Loan Denied!");
            }
            break;
            
         case 2:
            System.out.println("You are Self-employed and eligible to loan. \nEnter your salary: ");
            salary = scanf.nextInt();
            if(salary >= 50000){
               System.out.printf("Loan Approved!");
            }else {
               System.out.printf("Loan Denied!");
            }
            break;
            
         case 3:
            System.out.println("Loan Denied!");
            break;
         
         default:
            System.out.println("Loan Denied!");
            
      }
      
      scanf.close();
   }
}