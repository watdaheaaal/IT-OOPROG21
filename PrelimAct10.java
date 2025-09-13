/*
  Name: Turceno, James Gabriel B.
  Course/Year: BSIT - II
  Date: Saturday, 13th day of September, Year 2025
  
  Description: Employee Role and Overtime Pay
  	Write a program that:
    Accepts an employee role (1 for Manager, 2 for Developer, 3 for Intern) and hours worked.
    Use a switch case for role:
    Inside each case, use a nested condition:
    If hours > 40, calculate and display overtime pay.
    Otherwise, display standard salary.
  
*/

import java.util.Scanner;

class PrelimAct9{
  public static void main(String[] args){
     Scanner scanf = new Scanner(System.in);
        double salary;
        int employeeRole, hoursWorked;
        int manager = 500;
        int developer = 300;
        int intern = 100;
        
        System.out.printf("Employment roles: \n1: Manager \n2: Developer \n3: Intern\n\n");
        System.out.printf("What is your employment role: ");
        employeeRole = scanf.nextInt();
        
        switch(employeeRole){
            case 1:
                System.out.printf("Enter number of hours worked: ");
                hoursWorked = scanf.nextInt();
                
                if(hoursWorked > 40){
                    salary = manager * ((double)hoursWorked * 1.5);
                    
                    System.out.printf("\n\nyour salary: %.2f", salary);
                }else{
                    salary = manager * hoursWorked;
                    System.out.printf("Your standard salary: %.2f", salary);
                }
                break;
                
            case 2:
                System.out.printf("Enter number of hours worked: ");
                hoursWorked = scanf.nextInt();
                
                if(hoursWorked > 40){
                    salary = developer * ((double)hoursWorked * 1.5);
                    
                    System.out.printf("\n\nyour salary: %.2f", salary);
                }else{
                    salary = developer * hoursWorked;
                    System.out.printf("Your standard salary: %.2f", salary);
                }
                break;
                
            case 3:
                System.out.printf("Enter number of hours worked: ");
                hoursWorked = scanf.nextInt();
                
                if(hoursWorked > 40){
                    salary = intern * ((double)hoursWorked * 1.5);
                    
                    System.out.printf("\n\nyour salary: %.2f", salary);
                }else{
                    salary = intern * hoursWorked;
                    System.out.printf("Your standard salary: %.2f", salary);
                }
                break;
                
            default:
                System.out.println("ERROR 404: Invalid number of choice. \nPlease try again.");
        }
  }
}
