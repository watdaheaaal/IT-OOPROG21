/*
   Name: Turceno, James Gabriel B.
   Course / Year: BSIT-II
   
   Description: create a java program that will allow the user to input any number from 1 to 5. 
   The program will keep on asking an input from the user until it encounters a negative value. 
   Calculate and display the total sum and product of all the inputted numbers.
*/

import java.util.Scanner;

class MidtermAct3 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int num1;
        int sum = 0;
        int product = 1;

        do {
            System.out.print("Enter a number between 1-5 (negative to stop): ");
            num1 = scanf.nextInt();

            if (num1 > 0 && num1 <= 5) {  
                sum += num1;
                product *= num1;
            } else if (num1 >= 5) {
                System.out.println("Please enter a number between 1-5.");
            }

        } while (num1 >= 0);  

        System.out.printf("Total sum: %d\n", sum);
        System.out.printf("Total product: %d\n", product);

        scanf.close();
    }
}
