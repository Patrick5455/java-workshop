import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {

    public static void main(String[] args) {


        /*
        * The Fibonacci sequence is a series of numbers where each number is the sum of the previous two numbers.
        * Write a recursive method to generate the first 15 numbers of the Fibonacci sequence.
        * Note that the Fibonacci value for 0 is 0, and the Fibonacci value for 1 is 1.
        * The Fibonacci sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, and so on.
        * */

        for (int i = 0; i < 17; i++) {
            System.out.println( fibonacci(i) );
        }

    }

//    public static List<Integer> fibonacci(Integer number){
//        List<Integer>sequence = new ArrayList();
//        if(number ==1 || number ==0) {
//             sequence.add(number);
//        }
//
//        else {
//            int x = number - fibonacci(number).get(sequence.size());
//            System.out.println(number);
//        } return sequence;
//    }

        public static Integer fibonacci(Integer number) {
            if (number == 0 || number == 1) return number;
            else  return fibonacci(number -1) + fibonacci(number -2);
    }

}
