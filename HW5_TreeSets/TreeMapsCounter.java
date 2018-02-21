import java.util.Scanner;
import java.util.TreeMap;

/**
 * Emma Perez
 */
public class TreeMapsCounter {

    public static void main (String [] args)
    {
        TreeMap<String , Integer > tm = new TreeMap<>();
        Scanner scan = new Scanner(System.in);

        String line;
        while((line = scan.nextLine()).length() > 0){

            Scanner ls = new Scanner(line);

            while(ls.hasNext())
            {
                String word = ls.next();
                if(tm.containsKey(word)){
                    tm.put(word, (tm.get(word))+1);
                }
                if(! tm.containsKey(word))
                {
                    tm.put(word, 1);
                }
            }
        }
        for(String all: tm.keySet())
        {

            System.out.println(all + " : " + tm.get(all));
        }
    }
}
