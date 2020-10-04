public class OOP {

    public static void main(String[] args) {

        OOP oop = new OOP();

        oop.checkInstance(45.9);
    }


    public void checkInstance(Number val){

        if(val instanceof Integer)
            System.out.println("val is an instance of Integer");

        if (val instanceof Double)
            System.out.println("val is an instance of Double");
    }
}
