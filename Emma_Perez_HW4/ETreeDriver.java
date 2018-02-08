import java.util.Scanner;

/**
 * Created by emmaperez on 3/10/16.
 */
public class ETreeDriver extends ETree
{


    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String input;
        while((input = scan.nextLine()).length()>0)
        {

            ETree tree = new ETree();
            Node n = tree.build(input);
            tree.printNode(n);
            System.out.println(tree.evaluate(n));


        }
    }
}
