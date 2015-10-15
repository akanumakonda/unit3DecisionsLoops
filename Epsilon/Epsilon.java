

import java.util.Scanner;

 /**
     * Reads a floating point number if zero it will pring zero, Otherwise positive or negative add small it is less than 1
     */
public class Epsilon
{

    public static final double EPSILON = 1e-12;

    public static void main( String[] arg )
    {
    Scanner in = new Scanner( System.in );
    System.out.print( "Enter a floating-point number: " );
    double i = in.nextDouble();

    String adj = "";
    if( Math.abs( i ) < 1.0 )
    {
        adj = "small";
    }
    else if( Math.abs(i) > 1000000 )
    {
        adj = "large";
    }

    if( Math.abs( i - 0 ) < EPSILON )
    {
        System.out.println( "It's a zero." );
    }
    else if( i > 0 )
    {
        System.out.println( "It's a " + adj + " positive number." );
    }
    else
    {
        System.out.println( "It's a " + adj + " negative numbrer." );
    }
    }
}
