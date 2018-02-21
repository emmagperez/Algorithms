import java.util.Comparator;
import java.util.TreeSet;

/**
 * Emma Perez
 */

public class TreeSetCompare
{
    public static void main(String [] args)
    {

        TreeSet<String> tree = new TreeSet <>(new Comparing());
        tree.add("hello");
        tree.add("wuddup");
        tree.add("a1");
        tree.add("a2");

        for(String str: tree)
        {
            System.out.println(str);
        }

    }

}

class Comparing implements Comparator<String>
{

    public int compare(String s1, String s2)
    {
        if(s1.length() == s2.length())
            return s2.compareTo(s1);
        if(s1.length()< s2.length())
            return -1;
        if(s2.length()< s1.length())
            return 1;
        return 1;
    }

}




