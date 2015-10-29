import java.util.Scanner;

public class Substrings_pair
{
    public static void for_loop()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scan.next();
        int numLetters = word.length();
        /*for (int i = 2;
            i <= (numLetters );
            i++)
            {
                for ( int count = 0;
                    count <= (numLetters);
                    count++)
                    {
                        String sub = word.substring(count, i);
                        System.out.println(sub);
                    }
                
            }*/
        for(int i = 0; i < word.length(); i++)
            {
             char ch = word.charAt(i);
             
            }
         
        while (ch<=numLetters)
        {
            System.out.println(ch);
            ch++;
        }
    }
}
