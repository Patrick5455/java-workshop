import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;

public class FileReadWrite {

    public static void main(String[] args) throws IOException {

        /*Using the Java NIO, the way to read and write to file
        * is using Files.createFIle(newFilePath)
        *    Files.createDirectory(newDirPath)
        *
        *
        * As a good practice, you should check whether directories
        * and/or files exist prior to creating any with the same name.
        *
        * We do this using Files.exists(path)
        * */


        String pathString = System.getProperty("user.home")+"/javaTemp/";

        Path pathDirectory = Paths.get(pathString);

        if(Files.exists(pathDirectory))
            System.out.println("directory already exists");

        else {
            //Create  New Directory
            Files.createDirectories(pathDirectory);
            System.out.println("File was created");
        }

        /*Create a File inside the directory*/
        String fileName = "/temp1.txt";
        Path filePath = Paths.get(pathDirectory+fileName);

        if(Files.exists(filePath))
            System.out.println("File Already Exists @ "+filePath);

        else {
            Files.createFile(filePath);
            System.out.println("File was created");
        }

        Files.list(pathDirectory).filter(Files::isWritable)
                .forEach(System.out::println);


        /*This created a file that is essentially empty.
        Making use of the terminal, you could list the size of the file by calling the ls -lah ~/javaTemp/temp.txt command,
        which will throw a result like the following:
        -rw-r--r--  1 userName dialout   0 maj 15 13:57 /[...]/temp.txt*/


        //Writing to  a text file using Java.nio

        try {
            Files.write(filePath, Arrays.asList("Hello World", "It is a bright new day"));
            Files.readAllLines(filePath).forEach(System.out::println);
            //We can append more texts to the file
            Files.write(filePath, Arrays.asList("This is another day", "Howdy!"),
                    StandardOpenOption.APPEND);
            Files.readAllLines(filePath).forEach(System.out::println);
        }

        catch (IOException e){
            e.printStackTrace();
        }



    }
}
