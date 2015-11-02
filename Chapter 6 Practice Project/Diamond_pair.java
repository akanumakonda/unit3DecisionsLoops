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
            count ++)
        
        {
            System.out.print("\n");
            for (int spaces = (count-1);
                (spaces <= num);
                spaces++)
                {
                    System.out.print("_");
                }
            for(int asterik = 1;
            asterik <= (count + (count-1));
            asterik+= 2)
            {
                System.out.print("*");
            }
            
        }
    }
}
