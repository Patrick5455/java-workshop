public class InnerClasses {


    private class MyInnerClass{
        void PrintInnerClass(){
            System.out.println("This is an inner class");
        }
    }

    // method to access inner cclass
    public void accessInnerClass(){
        MyInnerClass myInnerClass = new MyInnerClass();

        myInnerClass.PrintInnerClass();
    }

    public static void main(String[] args) {

        InnerClasses innerClasses = new InnerClasses();

        innerClasses.accessInnerClass();
    }

}
