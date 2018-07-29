import java.util.*;
public class MetricConversion
{
    public static void main (String[] args)
    {
        int inch;
        int gallons;

        System.out.println("Enter number of inches: ");
        Scanner input = new Scanner(System.in);
        inch = input.nextInt();
        System.out.println("Enter number of gallons: ");
        gallons = input.nextInt();
        conversionToInch(inch);
        conversionToLiters(gallons);
    }

    private static void conversionToInch (int inch)
    {
        double centimeters;
        centimeters = inch * 2.54;
        System.out.println(inch + " inch/ inches is equals to " + centimeters + " centimeters.");
    }

    private static void conversionToLiters (int gallons)
    {
        double liters;
        liters = gallons * 3.7854;
        System.out.println(gallons + " gallons is equals to " + liters + " liters" );

    }
}
