import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Emma Perez on 2/14/16.
 */
public class ArrayListVSLinkedList
{

    public static void main (String [] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();

        final long startTimeA = System.currentTimeMillis();

        for( int i = 0; i < 1E7; i ++)
        {
            arr.add(i);

            if(i % 100000 == 0 )
            {
                final long curTimeA = System.currentTimeMillis();
                System.out.println("Time, every 100000th element(arraylist): "+(curTimeA - startTimeA));
            }
        }
        final long endTimeA = System.currentTimeMillis();

        System.out.println("Total time (arraylist) : " + (endTimeA - startTimeA));



        LinkedList<Integer> ll = new LinkedList<>();

        final long startTimeL = System.currentTimeMillis();

        for( int j = 0; j < 1E7 ; j ++)
        {
            ll.add(j);
            if(j % 100000 == 0)
            {
                final long curTimeL = System.currentTimeMillis();
                System.out.println( "Time, every 100000th element (linked list):" + (curTimeL - startTimeL));
            }

        }
        final long endTimeL = System.currentTimeMillis();

        System.out.println("Total time (linked list): " + (endTimeL - startTimeL));


    }


}
/**
 * When I was running the program “ArraylistVSLinkedlists” (which
 was adding to the end of the lists) the first thing that I
 noticed was that the linked list took longer to execute than the
 arraylist. But what I thought was interesting about it was that
 at first it seems like the linkedlist was executing faster. In
 my run, for the first and second "100,000th" elements the linked
 list ran at 0 and 9 milliseconds while arraylists were at 0 and
 18 milliseconds. So the arraylist was taking double the amount
 of time as the linkedlist was. As soon as the linked list gets
 to the 1,000,000 element or the 10th 100,000th element, it gets
 exceedingly slower.
 */
 

