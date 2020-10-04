public class VariablesImmutability {

    public static void main(String[] args) {

        final String hello ="value"; // final variables cannot be changed

        // hello = "new vlaue" would lead to compilation error

        var s = new String("Testing out " +
                "Local Variable Type Inference in Java  -> var");
    System.out.println(s);

    var i = Integer.parseInt("45");

    System.out.println(i);

    var j = Integer.valueOf("567");

    System.out.println(j);

    }

}
