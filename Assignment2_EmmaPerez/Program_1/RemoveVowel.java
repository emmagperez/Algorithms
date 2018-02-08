
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by Emma Perez on 2/14/16.
 * simple program to remove vowels from a series of words. 
 */

public class RemoveVowel
{
    public static void main (String [] args)
    {
        LinkedList<String> ll = new LinkedList<String>();

        System.out.println("Enter a series of words followed by a space. Type 'quit' and press 'enter' when you wish to stop");
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext())
        {
            String word = scan.next();
            ll.add(word);
            if (word.equalsIgnoreCase("quit"))
            {  break;}
        }

        ll.removeLast();

        System.out.println("List before deletion: " + ll);

        ListIterator<String> iter = ll.listIterator();
        while (iter.hasNext())
        {
            String word = iter.next();
            if ("aeiou".indexOf(Character.toLowerCase(word.charAt(0))) >= 0)
            {
                iter.remove();
            }
        }

        System.out.println("List after deletion: " + ll);

    }

}
