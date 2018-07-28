public class Percentages
{
    public static void main (String[] args)
    {
        double num_One = 2.0;
        double num_Two = 5.0;
        computePercent(num_One, num_Two);

    }

    private static void computePercent (double num_One, double num_Two)
    {
        double num_Three = num_One / num_Two * 100;
        System.out.println(num_One + " is " + num_Three + " percent of " + num_Two);

    }
}
