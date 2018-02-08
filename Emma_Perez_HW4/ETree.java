import java.util.Scanner;
import java.util.Stack;

/**
 * Created by emmaperez on 3/8/16.
 */
public class ETree {


    class Node {
        public boolean isOperator;
        public String operator;
        public Node right;
        public Node left;
        public double value;

        public Node(Node right, String op, Node left) {
            this.right = right;
            this.left = left;
            this.operator = op;
        }

        public Node(Double value) {
            this.value = value;
        }

        public String toString() {
            return (right == null && left == null) ? Double.toString(value) : "(" + left.toString() + operator + right.toString() + ")";
        }

    }


    private Node root;

    public Node build(String postfix) {
        Stack<Node> stack = new Stack<>();
        Scanner scan = new Scanner(postfix);
        for (int i = 0; i < postfix.length(); i++) {

            if (scan.hasNextDouble()) {
                double d = scan.nextDouble();
                Node dn = new Node(d);
                dn.value = d;
                dn.isOperator = false;
                stack.push(dn);

            }

            else if (scan.hasNext()) {
                String operator = scan.next();
                Node tree = new Node(null, null, null);
                tree.operator = operator;
                tree.right = stack.pop();
                tree.left = stack.pop();

                stack.push(tree);
            }
        }
        root = stack.pop();
        return root;
    }

    public void printNode(Node n) {

        System.out.println(root);

    }

   double evaluate(Node n) {

       if ( n.left == null && n.right == null){
           return n.value;
       }
       double e1 = evaluate(n.left);
       double e2 = evaluate(n.right);
       if (n.operator.equals("+")) {
           return e1 + e2;
       }
       else if (n.operator.equals("-")) {
           return e1 - e2;
       }
       else if (n.operator.equals("*")) {
           return e1 * e2;
       }
       else {
           return e1 / e2;
       }


   }

}


