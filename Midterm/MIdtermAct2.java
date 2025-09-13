/*
   Name: Turceno, James Gabriel B.
   Course / Year: BSIT - II
   Description: create a java program that will allow the user to input 20 numbers. 
   Calcuate the sum, difference, product, and quotient of all even numbers that are less than 100
   
*/

import java.util.Scanner;

class MidtermAct2 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int sum = 0, product = 1, countEven = 0;
        int diff = 0, quotient = 1;
        boolean firstEven = true;

        for (int i = 0; i < 20; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            int num = scanf.nextInt();

            if (num % 2 == 0 && num < 100) { // only even numbers < 100
                sum += num;
                product *= num;

                if (firstEven) {
                    diff = num;       // initialize difference
                    quotient = num;   // initialize quotient
                    firstEven = false;
                } else {
                    diff -= num;
                    quotient /= num;
                }

                countEven++;
            }
        }

        if (countEven > 0) {
            System.out.printf("Sum of even numbers < 100: %d\n", sum);
            System.out.printf("Difference of even numbers < 100: %d\n", diff);
            System.out.printf("Product of even numbers < 100: %d\n", product);
            System.out.printf("Quotient of even numbers < 100: %d\n", quotient);
        } else {
            System.out.println("No even numbers less than 100 were entered.");
        }

        scanf.close();
    }
}
