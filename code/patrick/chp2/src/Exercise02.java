public class Exercise02 {

    public static void main(String[] args) {


        // comparing strings

        String a = "c";

        String b = "dog";

        String c = "cat";

        String d =  (a.equals(b)) ? "dog is dog" : "dog is not dog";

        String e =  (a.equals(c)) ? "dog is cat" : "dog is  not cat";

        String f = (!a.equals(c)) ? "cat is not dog" : "cat is dog";

        System.out.printf("%s%n%s%n%s", d, e, f);


    }
}
