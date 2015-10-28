
public class RewriteLoopsPair
{
public static void addingToValue() 
{
    int s = 0;
    int i = 1;
   while (i<=10)
   {
    s+=i;
    i++;

    }
    System.out.println(s);
}
public static void forLoop()
{
    int s =0;
    for (int i= 1; i <= 10;i++)

    {
        s= s+i;
    }
    System.out.println(s);
}
}