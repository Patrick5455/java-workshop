import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;
import java.util.stream.Collectors;

public class SubDirectory {

    public static void main(String[] args) throws IOException {
        String home = System.getProperty("user.home");

        Path homePath = Paths.get(home);
        /*List the directors and subdirectories at second level
        * in the home directory*/
        /*ere is the catch! When running a call like that,
        it is likely that there are directories or files that your program is not allowed to access.
        An exception regarding permissions will be fired and your program will stop:*/

        Files.walk(homePath, 2).
                filter(Files::isDirectory)
                .forEach(System.out::println);

        /*Accessing any directory or file that is contained in any of these subdirectories, which are under strict
         administrative user permissions, will make this program crash.
        It is of no use to catch this exception because the result will still be a non-functional directory listing.
         There is a pretty advanced technique to get this to work,*/


        //Advanced Method

        Files.walkFileTree(homePath, Collections.EMPTY_SET,
                2, new SimpleFileVisitor(){
                    @Override
                    public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes basicFileAttributes)
                            throws IOException {
                        System.out.println(dir.toString());
                        return FileVisitResult.CONTINUE;
                    }

                    @Override
                    public FileVisitResult visitFileFailed(Object dir, IOException e) throws IOException {
                        System.out.println("visitFileFailed: " + dir);
                        return FileVisitResult.CONTINUE;
                    }
                })
                .forEach(System.out::println);
    }

    /*The preVisitDirectory() method will tell the walkFileTree method that it should continue to work through its return.
    The issue here is that because of the AccessDeniedException,
    our program will not enter preVisitDirectory().
    We need to override yet another method called visitFileFailed()
    to see how to handle any kind of exception that occurs when trying to access an item in the directory:*/


}
