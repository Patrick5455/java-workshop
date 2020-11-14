package chp4_arrays_collections;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

public class Sets_ {

    /*In the java.util.Sets_ class, we find three interfaces used to represemt
    sets; HashSet, TreeSet and LinkedHashSet. The differences between them:

    HashSet: Will Store data without guaranteeing the order of iteration.
    TreeSet: orders a set by value
    LinkedHashSet: orders a set by arrival time.
    * */

    public static void main(String[] args) {

        // Populating a set from an array

        String [] myArray = new String[] {"3", "2", "35"};

        Set mySet = new HashSet();

        Collections.addAll(mySet, myArray);

        System.out.println(mySet); // the order when printed is not guaranteed
        // because we are dealing with an HashSet

        //But HashSet will sort data of Integer types e,g.


        Integer [] myIntegersArray = new Integer[] {7,9,10,3,4,6};

        Set myIntegersSet = new HashSet();

        Collections.addAll(myIntegersSet, myIntegersArray);

        System.out.println(myIntegersSet);

        //You can also use the addAll method to combine the contents of two sets

        myIntegersSet.addAll(mySet);

        System.out.println(myIntegersSet);

        //TreeSet : Preserves the oder of sets by value..e.g

        Set treeSet = new TreeSet();

        Set newSet = new TreeSet(Arrays.asList("ER", "TY", "1"));


        treeSet.addAll(newSet);

        System.out.println(treeSet); // IT WILL PRINT AN ORDERED-BY-VALUE SET

        /*
        * You might be wondering about the pros and cons of using each type of set.
        * When sorting, you are trading speed for tidiness.
        * Therefore, if you are working with large sets of data and speed is a concern,
        * you will have to decide whether it is more convenient to have the system operate faster,
        * or have the results sorted, which would allow faster binary searches through the dataset.
        * */

        //LinkedHashSet
        /*LinkedHashSet, will sort the objects in order of their arrival.
        * e.g
        */

        Set linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(35);
        linkedHashSet.add(345);
        linkedHashSet.add(0);
        linkedHashSet.add(89);
        linkedHashSet.add(-1);

        System.out.println(linkedHashSet);
        // the set is printed in order of entry. This is unlike Treeset that prinst in order of value
        //however this is not always guaranteed

        //finding the difference between two sets

        Set setA = new LinkedHashSet();
            setA.add(23);
            setA.add(45);
            setA.add("Pot");
            setA.add("You");
            setA.add("56");

        Set setB = new HashSet();
            setB.add(12);
            setB.add("You");
            setB.add("56");

        boolean contains = setB.containsAll(setA);

        System.out.println("Set A contains Set B -> "+contains);

        boolean remove =   setA.removeAll(setB);

            System.out.println("remove result -> "+remove+setA);


    }
}
