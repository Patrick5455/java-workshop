package chp4_arrays_collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Properties_ {

    /*Properties in the collections framework are used to maintain list of
    key-value pairs where both are of the String class. Properties are relevant
    when obtaining environmental values from the operating system,
    for example, and are the grounding class for many other classes.

    One of the main characteristics of the Properties class is that it allows
    the definition of a default response
    in the case of a search for a certain key not being satisfactory.
    * */

    public static void main(String[] args) {
        Properties properties = new Properties();
        Set setOfKeys; String key;

        properties.put("Os", "Ubuntu Linux");
        properties.put("Version", "18.04");
        properties.put("Language", "English (UK)");

        //iterate through the map
        Iterator keyIterator = properties.keySet().iterator();


        while (keyIterator.hasNext()) {
            key = keyIterator.next().toString();
            System.out.printf("Key = %s%n", key,
                    properties.getProperty(key));

            System.out.printf("Key %s value = %s%n",
                    key ,properties.getProperty(key));
        }

        /* Another interesting method to be found in the
        properties class is the list (); it comes with two different implementation
        that allows for sending contents of a list to different data handlers.

        We can stream the whole properties
        list to a PrintStreamer object such as System.out.
        This offers a simple way of displaying what is in a list without having to iterate through it.
   * */

        System.out.println("Printing With System.out stream (output stream)");
        properties.list(System.out);

        //The propertyNames() method returns an Enumeration list,
        //and by iterating through it, we will obtain the keys to the whole list.
        //This is an alternative to creating a set and running the KeySet() method


        Enumeration enumeration = properties.propertyNames();

        System.out.println("Printing With Enumeration");
        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());


        //We also have the setProperty  method which is used to
        // modify the value of an existing key, or will eventually
        //create a new kwy-value pair of the key is not found.
        //The method will answer with the old value if the key exists, or answer with code otherwise

        String oldValue = (String) properties.setProperty("Language", "German");

        if(!(oldValue==null)) System.out.println("Modified the language Property");


        properties.list(System.out);


        //NB: There are more methods in the Properties class that deals with
        //storing retrieving lists of properties to/from files.

    }
}
