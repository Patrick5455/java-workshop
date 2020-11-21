import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WritingReadingPropertiesFIle {


    /*Property files store key-value (also called key-map)
    * pairs in a standard format. An example of the content of such a file
    *  is:
    * #user information
    name=Ramiro
    familyName=Rodriguez
    userName=ramiroz
    age=37
    bgColor=#000000
    *
    * Properties file are used to store the configurable parameters
    * of applications or even for localizations strings.
    * */

    public static void main(String[] args) throws IOException {

        Person person = new Person.PersonBuilder()
                .name("Patrick")
                .familyName("Ojunde")
                .userName("Patrick5455")
                .age(30)
                .bgColor("#000000")
                .build();

        Map<String, String> personMap = Person.personMap(person);

        String filePath = createPropertyFile("user.properties");
        writeToPropertiesFIle(filePath, personMap);
        readFromPropertiesFile(filePath);

    }


    public static String createPropertyFile(String fileName)
            throws IOException {

        String pwd = System.getProperty("user.dir");
        fileName = String.format("%s/%s", pwd, fileName);
        Path filePath = Paths.get(fileName);

        if (Files.notExists(filePath))
            Files.createFile(filePath);

        System.out.println("Filepath ->" + filePath.toString());
        return filePath.toString();
    }

    public static String writeToPropertiesFIle(String propertyFilePath,
                                               Map<String, String> propertyContent)

            throws IOException {
        FileOutputStream stream = null;
        Properties properties = new Properties();
        propertyContent.forEach(properties::setProperty);

        List propertyList = properties.entrySet()
                .stream()
                .map(Object::toString)
                .collect(Collectors.toList());


        File propertiesFile = new File(Paths.get(propertyFilePath).toString());
        FileWriter writer = new FileWriter(propertiesFile);

        Files.write(Paths.get(propertyFilePath), propertyList);


        return Paths.get(propertyFilePath).toString();
    }


    public static void readFromPropertiesFile(String propertyFilePath)
            throws IOException {

        Path filePath = Paths.get(propertyFilePath);
        Properties properties = new Properties();

        //Use FileInputStream to read file content from file
        FileInputStream inputStream = new FileInputStream(filePath.toString());

        properties.load(inputStream);

        properties.entrySet().forEach(System.out::println);
    }

}



