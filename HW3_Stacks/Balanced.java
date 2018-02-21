import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Emma Perez on 2/22/16.
 */
public class Balanced {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner scan = new Scanner(new InputStreamReader(System.in));


        String line;

        while ((line = scan.nextLine()).length() > 0) {

            for (int i = 0; i < line.length(); i++) {

                char c = line.charAt(i);

                switch (c) {
                    case '(':
                        stack.push(c);
                        break;

                    case '{':
                        stack.push(c);
                        break;

                    case '[':
                        stack.push(c);
                        break;

                    case ')':
                        if (c == ')' && stack.isEmpty()) {
                            System.out.println("imbalanced");
                        } else if (c == ')' && stack.peek() == '(') {
                            stack.pop();
                        }
                        break;


                    case '}':
                        if (c == '}' && stack.isEmpty()) {
                            System.out.println("imbalanced");
                        } else if (c == '}' && stack.peek() == '{') {
                            stack.pop();
                        }
                        break;

                    case ']':
                        if (c == ']' && stack.isEmpty()) {
                            System.out.println("imbalanced");
                        } else if (c == ']' && stack.peek() == '[') {
                            stack.pop();
                        }
                        break;

                    default:
                        System.out.println("imbalanced");
                        break;
                }

            }


            if (!(stack.isEmpty())) {
                System.out.println("imbalanced");
            } else {
                System.out.println("blanced");

            }
            stack.clear();
        }

    }
}
