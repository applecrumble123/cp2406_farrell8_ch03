import java.util.*;
public class Insurance
{
    public static void main (String[] args)
    {
        int current_Year;
        int birth_Year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current year: ");
        current_Year = input.nextInt();
        System.out.println("Enter birth year: ");
        birth_Year = input.nextInt();
        displayPremium(current_Year, birth_Year);
    }
    private static int get_Years(int current_Year, int birth_Year)
    {
        int num_Of_decade = (current_Year - birth_Year) /10;
        return (num_Of_decade + 15) * 20;
    }

    private static void displayPremium(int current_Year, int birth_Year)
    {
        System.out.println("The amount is $" + get_Years(current_Year, birth_Year));
    }
}
