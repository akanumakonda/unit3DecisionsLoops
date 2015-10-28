import java.util.Scanner;

public class RewriteLoopsPair2
{

public static void control()
{
    Scanner in = new Scanner(System.in);
    System.out.println("enter");
    int n = in.nextInt();
    double x = 0;
    double s;
    do
    {
        s= 1.0/(1+n*n);
        n++;
        x=x+s;
    }
    while(s>0.01);
    System.out.println(x);
}
public static void newOne()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter");
        int n = in.nextInt();
        double x = 0;
        double s= 1; 
        while(s>0.01)
        {
            s= 1.0/(1+n*n);
            n++;
            x=x+s; 
        }
        System.out.println(x);
}
}