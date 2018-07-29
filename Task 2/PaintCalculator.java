import java.util.*;
import java.lang.Math;
public class PaintCalculator
{
    public static void main(String[] args)
    {
        double length;
        double width;
        double height;

        Scanner input = new Scanner (System.in);
        System.out.println("Enter length: ");
        length = input.nextInt();
        System.out.println("Enter width: ");
        width = input.nextInt();
        System.out.println("Enter height: ");
        height = input.nextInt();

        displayTotalArea(length, height, width);
        displayGallons(findTotalArea(length, height, width));
        displayPrice(get_Gallons_Needed(findTotalArea(length, height, width)), length, width, height);
    }

    private static double findTotalArea(double length, double height, double width)
    {
        return (length * width) + (length * height) + (height * width) ;
    }

    private static void displayTotalArea(double length, double height, double width)
    {
        System.out.println("The total wall area is " + findTotalArea(length, height, width) + "m^2");
    }

    private static double get_Gallons_Needed(double wallArea)
    {
        final double GALLON_PER_FEET = 1.0/350.0;
        return wallArea * GALLON_PER_FEET;
    }

    private static void displayGallons (double wallArea)
    {
        System.out.println("Number of Gallons needed is " + String.format("%.3f",get_Gallons_Needed (wallArea) ));
    }


    private static void displayPrice(double get_Gallons_Needed, double length, double width, double height)
    {
        System.out.println("The cost to paint a " + length + "-foot by " + width + "-foot with " + height +
                "-foot ceilings is $" + String.format("%.2f", Math.ceil(get_Gallons_Needed) * 32.0) + " and needs "
                        + String.format("%.3f",get_Gallons_Needed) + " gallons of paint.");
    }



}
