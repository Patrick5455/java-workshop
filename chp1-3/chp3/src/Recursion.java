public class Recursion {

    public static void main(String[] args) {

        int result = factorial(Integer.parseInt(args[0]));

        System.out.println(result);

    }

    public static Integer factorial(int n){

        if (n==1)
            return 1;

      return   n*factorial(n-1);
    }
}
