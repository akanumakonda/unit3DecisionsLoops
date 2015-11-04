import java.util.Scanner;

public class Numerical_Methods
{
    public static void fibonacci_num()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter n: ");
        int count = 3;
        int n = scan.nextInt();
        int fold1 = 1;
        int fold2 = 1;
        int fnew = 0;
        while (count <= n)
        {
            fnew = fold1 + fold2;
            fold2 = fold1;
            fold1 = fnew; 
            count++;
        }
        System.out.println(fnew);
}
}
