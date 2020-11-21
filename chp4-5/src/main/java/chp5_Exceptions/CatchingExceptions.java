package chp5_Exceptions;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CatchingExceptions {

    //There are two ways to handle exceptions: Catching and Throwing

    public static void main(String[] args) {

        //declare a list that will contain all of the files inside of the
        //readme.txt file

        List<String> lines = Collections.EMPTY_LIST;

        String text = null;
        System.out.println("Go Java Go!");

        try {
            //nulled strings should crash the program
            System.out.println(text.length());
        } catch (NullPointerException ex) {
            System.out.println("Exception: cannot get the text's length");
        }
        System.out.println("done");


        /*
        we have wrapped the potentially broken code inside a try-catch statement.
        The result of this code listing is very different
        from the result that we saw previously:/
         */

        //We can also place several catch statements after existing try statement.

        try {
            lines = Files.readAllLines(Paths.get("readme.txt"));
        } catch (NoSuchFileException e) {
            System.out.println("Exception: File Not Found");
            e.printStackTrace(); //shows the full exception stack
        } catch (IOException e) {
            System.out.println("Exception: IOException");
            e.printStackTrace(); // shows the full exception stack
        }

        //you will never see this print
        Iterator<String> iterator = lines.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



        //It is possible to handle exceptions coming from different class,
        //such as IOException and NullPointerException.
        //When dealing with exceptions that are not a subclass of one another.
        //It is possible to catch both exceptions using a logical OR operator.


        try{
            lines = Files.readAllLines(Paths.get("readme.txt"));
        }
        catch (NullPointerException | IOException e){
            System.out.println("Exception: File not found or NullPointer");
            e.printStackTrace();
        }
        //You will never see this print
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        /*
        /As you can see, it is possible to handle both exceptions in a single catch statement.
        However, if you want to handle the exceptions differently, you wil have to work
        with the object contatining the information about the exception, which, in thsi case is
        e.
        The Keyword you need to distinguis the between the exception that you may
        be handling simultaneousl is instanceof, as shown in the following example
         */

        try{
            lines = Files.readAllLines(Paths.get("readme.txt")); }

        catch (NullPointerException | IOException e){

            if(e instanceof NullPointerException)
                System.out.println("Exception: File not Found");

            if(e instanceof IOException)
                System.out.println("Exception: NullPointer");
        }

       /*
       /The fact is that you can daisy chain as many catch statements as you need to.
       If you use the second method that we discussed in this chapter (that is, using the OR statement),
       then you should remember that it is not possible to have a subclass together with its parent class.
       For example, it is not possible to have NoSuchFileException and IOException together in the same statement –
       they should be placed in two different catch statements.
        */

}}


