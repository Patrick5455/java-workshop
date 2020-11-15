package chp5_Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ThrowingExceptions {

    /*
    /You can choose not to deal with some caught exceptions in your code at a low
    level as done with try/catch blocks.. It could be interesting to filter
    out an exception's parent class and focus on detecting a subclass that might be
    of more importance to us.
    The throws keyword is used in the definition of the method you are creating
    and where the exception may occur.
     */

    public static void main(String[] args) throws IOException {

//        List<String> lines = Collections.EMPTY_LIST;
//
//        try{
//            lines = Files.readAllLines(Paths.get("readme.txt"));
//        }
//        catch (NoSuchFileException e){
//            System.out.println("Exception: File not found");
//        }
        /*
        /We are throwing any IOException that is occurring during rutime.
        In this way, we can focus on catching the one that actually happens:
        NoSuchFileException.
        It is possible to throw more than one exception type in this way by
        separating them using commas.
        e.g

        public static void main(String[] args) throws IOException, NullPointerException {

        The ont thing that is not possible is having an exception class and its subclass
        being thrown in the same definition - just as we saw when trying to catch multiple
        exceptions in a single catch statement. It is also interesting to see that
        throws is operating at a certain scope; for example, we could
        disregard a certain exception within a method in a class but not a different one.
         */


        /*
        /On the other hand, there is yet another keyword that you wil
        find relevant for dealing with exceptions as you advance in your
        understanding of the term .
        The throw keyword (note that this is not throws) will explicitly invoke an
        exception.
        You can use this to create your own exceptions and try them out in your code,

        We will demonstrate how you can create your won exception, and then we will use throw as part
        of the example to also see how exceptions propagate.

        The main reason to use throw is if you want your code to hand over an
        exception occurring within your class to another one higher up in the hierarchy.
                 */

        //Example

        String text = null;

        try {
            System.out.println(text.length());
        } catch (Exception e) {
            System.out.println("Exception: this should be a NullPointerException");
            throw new RuntimeException();
        }


        /*
        The reason for this is the call to throw new RuntimeException() that we issued in the catch block. As you can see, when dealing with the exception, we are provoking a different exception. This can be very useful for catching exceptions and piping them through your own exceptions, or simply catching the exception, giving a meaningful message to help the user understand what went down, and then letting the exception continue its own path, and eventually crashing the program if the exception is not handled at a higher level in the code.
        /
         */



    }

    }

