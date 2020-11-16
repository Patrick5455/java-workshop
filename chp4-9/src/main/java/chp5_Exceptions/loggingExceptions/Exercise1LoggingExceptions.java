package chp5_Exceptions.loggingExceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercise1LoggingExceptions {

    /*
    /There are two main actions that you can performing when catching
    exceptions, besides any type of creative coding you may want to do to
    respond to the situation: logging or throwing,

    Best practices for handling exceptions: Never do both throwing and logging at once.
     */

    public static void main(String[] args) {

        Logger logger = Logger.getAnonymousLogger();

        String s = null;

        try{
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            logger.log(Level.SEVERE, "Exception happened", e);
        }



        /*
        The log is useful because it tells us where the exception happened in the code and,
        additionally, helps us to find the place of where we can dig deeper into the code and fix any potential issues./
         */



    }


}
