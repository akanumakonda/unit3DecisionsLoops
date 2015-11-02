import java.util.Scanner;

public class Substrings_pair
{
    public static void for_loop()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scan.next();
        int numLetters = word.length();
        for (int i = 1;
            i <= (numLetters+ 1);
            i++)
            {
                int count = 0;
                while ((count + i) <= numLetters)
                    {
                        String sub = word.substring(count, (count +i));
                        System.out.println(sub);
                        count ++;
                    }                
            }
    }
}
