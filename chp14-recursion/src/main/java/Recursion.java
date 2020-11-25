public class Recursion {

    public static void main(String[] args) {
        factorial(6);

    }

    public  static int factorial(int number){

        if (number ==1) return 1;

        else {
            int x = (number * factorial(number -1));
            System.out.println(x);
            return x;
        }

    }
}
