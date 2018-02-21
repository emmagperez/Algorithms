import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Emma Perez on 2/14/16.
 */
public class AddToBeginning
{
    public static void main (String [] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();

        final long startTimeA = System.currentTimeMillis();

        for (int i = 0 ; i < 1E5 ; i ++)
        {
            arr.add(0, i);

            if( i % 10000 == 0 )
            {
                final long curTimeA = System.currentTimeMillis();
                System.out.println("Time, every 100th element (arraylist): " + (curTimeA - startTimeA));
            }
        }

        final long endTimeA = System.currentTimeMillis();

        System.out.println("Total time (arraylist): " + ( endTimeA - startTimeA));



        LinkedList<Integer> ll = new LinkedList<>();

        final long startTimeL = System.currentTimeMillis();

        for ( int j = 0 ; j < 1E5 ; j ++)
        {
            ll.add(0, j);

            if( j % 10000 == 0 )
            {
                final long curTimeL = System.currentTimeMillis();
                System.out.println("Time, every 100th element (linkedlist): " + (curTimeL- startTimeL));
            }
        }

        final long endTimeL = System.currentTimeMillis();

        System.out.println("Total time (linkedlist): " + ( endTimeL - startTimeL));
    }
}
/**
 When I was running the program “AddToBeginning” Linkedlists run
 a lot faster when adding to the beginning rather than the end.
 On my fist run, the total time for the arraylist was 1553 while
 the linkedlist's total time was only 22. Big difference!
 */

