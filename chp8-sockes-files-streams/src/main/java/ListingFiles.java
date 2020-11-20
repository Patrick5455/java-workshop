import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class ListingFiles {

    public static void main(String[] args) throws IOException {

        String oSTempFolder = System.getProperty("java.io.tmpdir");

        /*This returns the OS temporary folder. Java stores this in a JVM which
        is labelled "java.io.tmpdir".

         Therefore, the call to getProperty() at the beginning of the method extracts the name of the folder.
        For example, for any Unix OS, that property points to the /tmp folder.

        Note there are other similar JVM properties like this. THey include:

        "user.dir" - returns content of PWD
        "user.home" - returns content of the home directory - root
        "java.io.tmpdir" - returns the temporary folder of the OS; note opening this files requires admin privileges
        Your temporary folder is going to be filled up with a lot of files and folders
        created by the different programs running in your computer.
         */

        System.out.println(oSTempFolder);

        //the codes below return the list of files in this directory
        //we will print the first five
        String [] fileNames = new File (oSTempFolder).list();

       // final int[] count = {0};
        final int[] countA = {0};
        assert fileNames != null;
        System.out.println("JAVA.IO IMPLEMENTATION");
        //maintain order by entry
        Arrays.stream(fileNames).limit(5).
                collect(Collectors.toMap
                        (String::toString, String::toString,
                                (file1, file2) -> String.format("%s|%s", file1, file2),
                                //maintain order by entry
                                LinkedHashMap::new
                        )).values().stream().forEach(new Consumer<String>() {
                        @Override
                        public void accept(String s) {
                            countA[0]++;
                            System.out.printf("%d.) %s%n", countA[0], s);

                        }
                    });



        System.out.println();
    /*THe above implementation uses java.io
    but we can use another implementation with java.nio*/

        DirectoryStream<Path> directoryStream;

        directoryStream = Files.newDirectoryStream(Paths.get(oSTempFolder));

        System.out.println("JAVA.NIO IMPLEMENTATION");


        Iterator<Path> pathIterator = directoryStream.iterator();

        int count1 =0;
        while (pathIterator.hasNext() && count1<5){
            count1++;
           String path =  pathIterator.next().toString();
           System.out.printf("%d.) %s%n", count1, path);
        }

        System.out.println();

    }
}
