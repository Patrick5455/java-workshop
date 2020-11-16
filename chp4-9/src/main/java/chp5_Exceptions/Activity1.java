package chp5_Exceptions;

public class Activity1 {

    /*
    /Designing an Exception Class Logging Data

We have seen examples of how to log exceptions and how to throw them.
We have also learned how to create exception classes and throw them. With all that information, the goal of this activity is to create your own exception class that should log the different exceptions in terms of severity.
You should make an application that is based on the arguments to the program, and the program will respond to the logging exceptions in different ways. Just to have a common ground, use the following standard:

    If the input is number 1, issue the NullPointerException with a severity level of SEVERE.
    If the input is number 2, issue the NoSuchFileException with a severity level of WARNING.
    If the input is number 3, issue the NoSuchFileException with a severity level of INFO.
    In order to make this program, you will need to consider making your own methods for issuing exceptions, such as the following:

    public static void issuePointerException() throws NullPointerException {
        throw new NullPointerException("Exception: file not found");
    }
    public static void issueFileException() throws NoSuchFileException {
        throw new NoSuchFileException("Exception: file not found");
    }
     */
}
