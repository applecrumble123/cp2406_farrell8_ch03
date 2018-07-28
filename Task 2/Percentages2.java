import java.util.*;
public class Percentages2
{
    public static void main (String[] args)
    {
        double num_One;
        double num_Two;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number one: ");
        num_One = input.nextDouble();
        System.out.println("Enter number two: ");
        num_Two = input.nextDouble();
        computePercent2(num_One, num_Two);

    }

    private static void computePercent2 (double num_One, double num_Two)
    {
        double num_Three = num_One / num_Two * 100;
        System.out.println(num_One + " is " + num_Three + " percent of " + num_Two);
    }
}
