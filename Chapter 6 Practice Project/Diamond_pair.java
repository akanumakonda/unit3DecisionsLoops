import java.util.Scanner;
public class Diamond_pair
{
    public static void space_diamond()
    { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int num = scan.nextInt();
        
        for(int count = 1;
            (count <= num);
            count +=2)
        {
            while (count <= (num + (num-1)) )
            {
                System.out.println("*");
            }
            for (int spaces = 1;
                (spaces <= num);
                spaces++)
                {
                    
                }
            count++;
        }
        
        
    }
}
