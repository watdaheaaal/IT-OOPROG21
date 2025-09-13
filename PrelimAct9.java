/*
  Name: Turceno, James Gabriel B.
  Course/Year: BSIT - II
  Date: Saturday, 13th day of September, Year 2025
  
  Description: Movie Ticket Pricing Write a program that:
  Accepts movie type (1 for Regular, 2 for 3D, 3 for IMAX) and age.
  Use a switch case on movie type:
  Inside each case, use a nested condition:
  If age < 12 or age > 60, apply 50% discount.
  Otherwise, charge full price.
  
*/

import java.util.Scanner;

class PrelimAct9{
  public static void main(String[] args){

    Scanner scanf = new Scanner(System.in);
    int age, movieType;
    int m1 = 350;
    int m2 = 450;
    int m3 = 650;
    double price; 

    System.out.println("Movie Types: \n1: Regular \n2: 3D \n3: IMAX\n");
    System.out.printf("\nSelect movie type: ");
    movieType = scanf.nextInt();

    System.out.printf("Enter your age: ");
    age = scanf.nextInt();
    
    switch(movieType){
        case 1:
            if(age < 12 || age > 60){
                price = m1 * .50;
                System.out.printf("Total price: %.2f", price);
            }else{
                System.out.printf("Total price: %d", m1);
            }
            break;
        case 2:
            if(age < 12 || age > 60){
                price = m2 * .50;
                System.out.printf("Total price: %.2f", price);
            }else{
                System.out.printf("Total price: %d", m2);
            }
            break;
        case 3:
            if(age < 12 || age > 60){
                price = m3 * .50;
                System.out.printf("\nTotal price: %.2f", price);
            }else{
                System.out.printf("\nTotal price: %d", m3);
            }
            break;
        default:
            System.out.println("ERROR 404: Invalid number of choice please try again.");
    }
  }
}
