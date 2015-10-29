
public class NestedLoops_pair
{
    public static void for_loop()
    {
        final int LIMIT = 2;
        for( int count = 1;
        count <= LIMIT;
        count++)
        {
            for ( int count2 = 1;
            count2<= 4;
            count2++)
            {
                System.out.println(count+ "\t" + count2);
            }
        }
    }
}
