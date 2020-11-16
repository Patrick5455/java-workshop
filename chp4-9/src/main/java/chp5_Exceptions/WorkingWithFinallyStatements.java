package chp5_Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class WorkingWithFinallyStatements {

    //The finally block can be used to execute some common
    //code after any of the catch blocks used to handle a series of
    //different exceptions ins the code.

    //FInally block are useful for closing resources e,g files after an exception occurred

    public static void main(String[] args) {

        List<String> lines = Collections.EMPTY_LIST;

        try{
            lines = Files.readAllLines(Paths.get("readme.txt"));
        }

        catch (NoSuchFileException ne){
            ne.getMessage();
        }
        catch (IOException e){
            e.getMessage();
        }

        finally {
            System.out.println("Exception: Case closed");
        }

    }


}
