public class Exercise01 {

    public static void main(String[] args) {

        boolean happy = true;
        boolean sad = false;


        if (happy)
            System.out.println("I am happy");

        if (sad){
            System.out.println("Not good");
        }
//        else{
//            System.out.println("Not happy");
//        }



        //ternary operatos
        int x=5; int y =6;

        String result = (y > x) ? "Great" : "Not so great";

        System.out.println(result);

    }
}
