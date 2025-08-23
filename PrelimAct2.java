/*
   Name: Turceno, James Gabriel B.
   Course / Year: BSIT - II
   Date: 16th day of August, year 2025
   
   prelimAct 2

*/

import java.util.Scanner;

class PrelimAct2{
   public static void main(String[] args){
   
   float itemPrice, discAmount, discPrice; 
 
   
   Scanner scan = new Scanner(System.in);
   
   System.out.printf("Enter item price: ");
   itemPrice = scan.nextFloat();
   
   System.out.printf("Enter discount: ");
   discAmount = scan.nextInt();
   
   
   discPrice = itemPrice - discAmount;
   
   System.out.printf("Total Price: %.2f", discPrice);
   
   }
}