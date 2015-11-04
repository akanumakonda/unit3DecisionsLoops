import java.util.Random;
//each intersection is 10 points

public class DrunkardsWalk
{
    public static void getCoordinate()
    {
     int x  = 0;
     int y = 0;
     Random rand = new Random();
     for (int counter = 1;
           counter<= 100;
           counter ++)
           {
               int direction = rand.nextInt(4);
               if (direction == 1)
               {
                   x+= 10;
                }
               else if (direction == 2)
               {
                   y += 10;
                }
                else if (direction == 3)
                {
                    x -=10;
                }
                else 
                {
                    y -= 10;
                }
               
            }
    System.out.println("(" + x + "," + y + ")");
}
}
