public class NumbersDemo
{
    public static void main (String[] args)
    {
        int num_One = 5;
        int num_Two = 10;
        displayTwiceTheNumber(num_One, num_Two);
        displayNumberPlusFive(num_One, num_Two);
        displayNumberSquared(num_One, num_Two);

    }

    private static void displayTwiceTheNumber(int num_One, int num_Two)
    {
        System.out.println("Twice of " + num_One + " is " + (num_One*2) + ". Twice of " + num_Two + " is "
        + (num_Two*2));
    }

    private static void displayNumberPlusFive(int num_One, int num_Two)
    {
        int num_Three = num_One + 5;
        int num_Four = num_Two + 5;
        System.out.println(num_One + " + 5 is equals to " + num_Three + ". " + num_Two + " + 5 is equals to "
                + num_Four);
    }

    private static void displayNumberSquared(int num_One, int num_Two)
    {
        int num_Three = num_One*num_One;
        int num_Four = num_Two*num_Two;
        System.out.println(num_One + " squared is " + num_Three + ". " + num_Two + " squared is " + num_Four + ".");
    }
}
