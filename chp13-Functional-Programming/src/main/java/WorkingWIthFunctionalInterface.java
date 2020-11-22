public class WorkingWIthFunctionalInterface {


    public static void main(String[] args) throws InterruptedException {


        /*
        * Lambda Expressions
        * Along with the functional improvements in Java 8,
        * there also came Lambda expressions.
        * One of the primary improvements with lambdas is the code readability – most of the boilerplate code for interfaces is now gone.
        *
        * A very commonly used interface is the Runnable interface;
        * it's used in multithreaded applications to perform any type of task in the background,
        * such as downloading a large file from a network.
        * In Java 7 and earlier versions, you'd often see the Runnable interface used as an anonymous instance:*/


      Thread thread1 =   new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World -> thread1");

            }
        });


      Thread thread2 = new Thread(new Runnable() {
          @Override
          public void run() {
              System.out.println("Hello World 2 -> thread2");
          }
      });


      thread1.start();
      System.out.println(thread1.getState().toString());
      thread2.start();


//        Since Java 8, the preceding five lines of code can now be simplified by using a lambda expression instead:

        new Thread(() -> {System.out.println("Thread 3 -> inside lambda");}).start();

    }

}
