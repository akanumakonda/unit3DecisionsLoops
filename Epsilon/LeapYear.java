import java.util.Scanner;
/**
 * Write a description of class LeapYear here.
 * 
 * @anusha anumakonda
 * @version (a version number or a date)
 */
public class LeapYear
{
    /** description of instance variable x (add comment for each instance variable) */
    private static int year;

    /**
     * Default constructor for objects of class LeapYear
     */
    public LeapYear()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        // put your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        year = s.nextInt();
        year = year;
        isLeapYear(year);
    }
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     */
    public static void isLeapYear(int y)
    {
        // put your code here
        if (((year%4)!= 0) || ((year%100) == 0) && ((year%400) != 0))
        {
            System.out.println("This is not a leap year");
        }
        else 
        {
            System.out.println("This is a leap year");
        }

    }
}
