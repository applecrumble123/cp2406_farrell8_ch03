// This application gets a user's name and displays a greeting
import java.util.Scanner;
public class FixDebugThree3
{
   public static void main(String args[])
   {
      getName();
      displayGreeting();
   }
   private static String getName()
   {
      String name;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter name: " );
      name = input.next();
      return name;
   }
   private static void displayGreeting()
   {
      System.out.println("Hello, " + getName() + "!");
   }
}
