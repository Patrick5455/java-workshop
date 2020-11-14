package chp4_arrays_collections;

import java.util.HashSet;
import java.util.Set;

public class Arrays_ {

    public static void main(String[] args) {

        /* Arrays_ Framework 5 main Interfaces
        1. Set: A collection that contains no duplicates
        2. List: An ordered collection or sequence, allowing for duplicates
        3. Queue: A Collection that sorts data in the order of its arrival,
        typically handled as a First In First Out (FIFO) process
        4. Deque: Essentially a queue that allows for data insertion at both ends-
        can be handles as both FIFO and Last In First Out (LIFO)
        5. Map: Relates Key - which must be unique -to values

        The collection framework has more interfaces
        than the ones listed above.
        But they are variations of the above listed
        */

        Set mySet = new HashSet();

        String [] text = {"spam", "more", "buy"};

        java.util.Arrays.sort(text);

        System.out.println(java.util.Arrays.toString(text));

        Integer [] numbers  = new Integer [5];


        java.util.Arrays.fill(numbers, 50);


//       Arrays_.copyOf(numbers, 4);

        //before using binarySearch, you need to sort your data forst.

        int position = java.util.Arrays.binarySearch(text, "buy");

        java.util.Arrays.asList(numbers); // turn array object to a lSet newMySet = new HashSet(Arrays_.asList(numbers));ist


        Integer[] myArray = new Integer[] {3, 25, 2, 79, 2};

        Set newMySet = new HashSet(java.util.Arrays.asList(myArray));

        System.out.println("Arrays_ to Set -> "+newMySet.toString());






    }
}
