

/**
 * Write a description of class CountingMatches here.
 * 
 * @author (Anusha Anumakonda) 
 * @version (10/27/15)
 */
public class CountingMatches
{
    public static int countSpaces( String str)
    {
        int spaces = 0;
        
        for( int i = 0;
            i < str.length();
            i++)
        {
            char ch = str.charAt( i);
            if (ch == ' ' )
            {
                spaces++;
            }
    }
    return spaces;

}
}
