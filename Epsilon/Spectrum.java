import java.util.Scanner;

/**
 * Write a description of class Spectrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spectrum
{
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
        System.out.println("Please enter a wavelength");
        Scanner s = new Scanner(System.in);
        double w = s.nextDouble();
        if (w > .1)
        {
            System.out.println("Radio Waves");
        }
        else if (w > Math.pow(10,-3))
        {
            System.out.println("Microwaves");
        }
        else if (w > (7*Math.pow(10,-7)))
        {
            System.out.println("Infrared");
        }
        else if (w > (4*Math.pow(10, -7)))
        {
            System.out.println("Visible Light");
        }
        else if (w > Math.pow(10, -8))
        {
            System.out.println("Ultraviolet");
        }
        else if (w > Math.pow(10, -11))
        {
            System.out.println("X-rays");         
        }
        else 
        {
            System.out.println("Gamma rays");
        }
    }
}
