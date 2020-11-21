package chp5_Exceptions;

public class ExceptionIntroduction {

    /*
    /Exceptions are not errors, or, more accurately,
    exceptions are not bugs, even if you might perceive them to be when they crash your programs!
    Exceptions are situations that occur in your code when there is
    a mismatch between the data you are handling and the method or command you are using to process it.
    In Java, there is a class that is dedicated to errors.
    Errors are unexpected situations that affect programs on the JVM level.
    For example, if you fill-up the program stack through an unconventional use of memory, then your whole JVM will crash.
    Unlike errors, exceptions are situations that your code, when properly designed, can catch on the fly.
    Exceptions are not as drastic as errors,
    even if the result for you, the developer,
    will be the same – that is, a non-working program.
     */


    public static void main(String[] args) {
        //Purposeful crash program

        String text = null;
        System.out.println(text.length()); //NullPointerException






    }

}
