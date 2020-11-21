import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class GetDirectory {

    public static void main(String[] args) throws IOException {

        String pwd = System.getProperty("user.dir");


        Path pwdPath = Paths.get(pwd);
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(pwdPath);

        Iterator iterator = directoryStream.iterator();

        while (iterator.hasNext()){
            Path path = (Path) iterator.next();

            System.out.printf("%s -> %s%n",path.getFileName(),
                    Files.isDirectory(path) ?
                    "Dir":"Fil");
        }



        //Using Files.walk to list subdirectories

        String homeDir = System.getProperty("user.home");
        Path homePath = Paths.get(homeDir);

        // the number 1 is used to specify how far the File should dig, here at one level
        /*Files.walk() will extract the directory structure up to a certain depth, in our case, one.
        The depth represents how many levels of subdirectories your code will be digging into. */

        Files.walk(homePath, 1).
                 filter(Files::isDirectory).
                 collect(Collectors.toList()).
                 forEach(System.out::println);
    }
}
