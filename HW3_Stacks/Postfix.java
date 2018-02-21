
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by emmaperez on 2/25/16.
 */
public class Postfix {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();

        Scanner scan = new Scanner(System.in);

        String line;

        while ((line = scan.nextLine()).length() > 0) {

            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {

                if (lineScanner.hasNextDouble()) {
                    double num = lineScanner.nextDouble();
                    stack.push(num);

                } else {

                    String operator = lineScanner.next();
                    switch (operator) {
                        case "*":
                            if (stack.isEmpty()) {
                                System.out.println("Error");
                            } else {
                                double mNum1 = stack.pop();
                                double mNum2 = stack.pop();
                                double multiplied = mNum2 * mNum1;
                                stack.push(multiplied);
                            }
                            break;
                        case "/":
                            if (stack.isEmpty()) {
                                System.out.println("Error");
                            } else {
                                double dNum1 = stack.pop();
                                double dNum2 = stack.pop();
                                double divided = dNum2 / dNum1;
                                stack.push(divided);
                            }
                            break;
                        case "+":
                            if (stack.isEmpty()) {
                                System.out.println("Error");
                            } else {
                                double aNum1 = stack.pop();
                                double aNum2 = stack.pop();
                                double added = aNum2 + aNum1;
                                stack.push(added);
                            }
                            break;
                        case "-":
                            if (stack.isEmpty()) {
                                System.out.println("Error");
                            } else {
                                double sNum1 = stack.pop();
                                double sNum2 = stack.pop();
                                double subtracted = sNum2 - sNum1;
                                stack.push(subtracted);
                            }
                            break;
                        default:
                            System.out.println("Error");
                    }

                }


            }

            System.out.println(stack);
            double evaluated = stack.pop();
            System.out.println(evaluated);


        }
    }

}

