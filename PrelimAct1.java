/*
   Name: Turceno, James Gabriel B.
   Course / Year: BSIT - II
   Date: 16th day of August, year 2025
   
   prelimAct 1

*/

import java.util.Scanner;

class PrelimAct1 {
   public static void main(String[] args){
   
   int age;
   
   Scanner scanf = new Scanner(System.in);
   
   System.out.printf("Enter your age: ");
   age = scanf.nextInt();
   
   if (age < 18) {
      System.out.printf("You are not eligible to vote! "); 
   }else{
      System.out.printf("You are eligible to vote! ");
   }
   
   }
}