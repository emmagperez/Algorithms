/**
 * Created by emmaperez on 2/13/18.
 */
public class Fibonacci {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int answ = 0;

        while(answ <= 100 ){
            answ = num1 + num2;
            num1 = num2;
            num2 = answ;
            System.out.println(answ);

        }
    }
}
