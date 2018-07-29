import java.util.*;
public class BookstoreCredit
{
    public static void main(String[] args)
    {
        String name;
        double grade_Point_Average;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = input.nextLine();
        System.out.println("Enter grade point average: ");
        grade_Point_Average = input.nextDouble();
        getCredit(name, grade_Point_Average);

    }

    private static void getCredit (String name, double grade_Point_Average)
    {
        double credit = grade_Point_Average * 10;
        System.out.println(name + " has " + grade_Point_Average + " grade point average and thus have " + credit +
                " credits.");
    }
}
