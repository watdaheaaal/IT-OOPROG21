/*
Name: James Gabriel B.
Course: BSIT - II
Description:

Ask the user to input a number between 1 and 7. Use a switch to print the corresponding day of the week.
Keep asking until the user enters e to exit.
Requirements:
Use Scanner for input.
Use switch to determine day.
Use do-while loop to repeat.

*/
import java.util.Scanner;

class MidtermAct5 {
   public static void main(String[] args){
      Scanner scanf = new Scanner(System.in);
      int num;
      char choice;
      
      do{
      System.out.printf("Enter a number between 1 to 7: ");
      num = scanf.nextInt();
      
      switch(num){
         case 1:
            System.out.println("Today is Monday\n");
            break;
         case 2:
            System.out.println("Today is Tuesday\n");
            break;
         case 3:
            System.out.println("Today is Wednesday\n");
            break;
         case 4:
            System.out.println("Today is Thursday\n");
            break;
         case 5:
            System.out.println("Today is Friday\n");
            break;
         case 6:
            System.out.println("Today is Saturday\n");
            break;
         case 7:
            System.out.println("Today is Sunday\n");
            break;
         default:
            System.err.println("ERROR 404: Invalid number of choice.");
      }
      System.out.printf("Do u want to know what Day is todaY? \ny for yes and n for no\nmake ur choice: ");
      choice = scanf.next().charAt(0);
      
      }while(choice != 'e');
   }
}