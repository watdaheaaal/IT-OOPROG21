
import java.util.Scanner;

class PrelimAct4 {
   public static void main(String[] args){
      
      Scanner scanf = new Scanner(System.in);
      
      System.out.printf("Enter a  noun:  ");
      String noun1 = scanf.nextLine();
      
      System.out.printf("Enter another noun: ");
      String noun2 = scanf.nextLine();
      
      System.out.printf("Enter an adjective: ");
      String noun3 = scanf.nextLine();
      
      System.out.printf("Enter a past-tense verb: ");
      String noun4 = scanf.nextLine();
      
      System.out.printf("\n\nMary had a little %s \nIt's %s was silly as %s \nAnd everywhere that Mary %s \nThe %s was sure to go.", noun1, noun2, noun3, noun4, noun1);
   }
}