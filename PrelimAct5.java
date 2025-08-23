import java.util.Scanner;

class PrelimAct5 {
   public static void main(String[] args){
      
      Scanner scanf = new Scanner(System.in); 
      int random, guess;
      int min = 1;
      int max = 5;
      boolean right = true;
      boolean wrong = false;
      
      System.out.printf("Select a random number: ");
      guess = scanf.nextInt();
      
      random = min + (int) (Math.random() * max);
      
      if(guess == random){
         System.out.printf("You're guessing number %d \n that is " +right, random);
      }
      else{
         System.out.printf("I'm guessing number %d \n that is " +wrong, random);
      }

   }
}