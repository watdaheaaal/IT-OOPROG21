/*
   Name: Turceno, James Gabriel B.
   Course / Year: BSIT - II
   Description: create a java program that will allow the user to enter 2 integer numbers: start and end. It will display all perfect square values of all even numbers from start to end.
   
*/

import java.util.Scanner;

public class PerfectSquareEven {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter two numbers (start and end): ");
        int start = scanf.nextInt();
        int end = scanf.nextInt();

        System.out.println("Perfect squares of even numbers:");

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) { // check if even
                int square = i * i;
                System.out.printf("%d x %d = %d\n", i, i, square);
            }
        }

        scanf.close();
    }
}
