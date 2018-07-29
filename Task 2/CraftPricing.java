import java.util.*;
public class CraftPricing
{
    public static void main (String[] args)
    {
        String name_Of_Product;
        double cost_Of_Product;
        double num_Of_Hours;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter name of product: ");
        name_Of_Product = input.nextLine();
        System.out.println("Enter cost of product: ");
        cost_Of_Product = input.nextDouble();
        System.out.println("Enter number of hours: ");
        num_Of_Hours = input.nextDouble();
        displayResult(name_Of_Product, cost_Of_Product, num_Of_Hours);
    }
    private static double total_Cost(double cost_Of_Product, double num_Of_hours)
    {
        return((cost_Of_Product + 12) * num_Of_hours) + 7;
    }
    private static void displayResult (String name_Of_Product, double cost_Of_Product, double num_Of_Hours)
    {
        System.out.println(name_Of_Product + " cost $" + total_Cost(cost_Of_Product, num_Of_Hours));
    }
}
