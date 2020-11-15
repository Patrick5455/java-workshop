package chp4_arrays_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

public class Lists_ {

    /*
    * Lists are ordered collections of data. Unlike Sets,
    * Lists can contain duplicate items. Having data contained within lists allows
    * you to perform searches that will give the locations of certain objects
    * within a given list.
    * Given a position, it is possible to directly access an item in a list, add
    * new items, remove items, and even add full lists. Lists are sequential,
    * which makes them easy to navigate using iterators.
    *
    * There are also some methods for performing range-based operations on sublists.
    *
    * There are two different implementations: ArrayList and LinkedList.
    * Each of them is ideal depending on the circumstances.e\
    * */


    public static void main(String[] args) {


        List list = new ArrayList();

            list.add(1);
            list.add("Hello World");
            list.add("New World");

            int index = list.indexOf("Hello World");

            System.out.println("Find Hello World @ index "+ index);
            System.out.printf("Value of index %d -> %s %n", index, list.get(index));

            //IndexOf returns the location of an object
        //while lastIndexOf returns the location of the LAST OCCURRENCE of an object

        //We can manipulate the nodes of a list by removing the

        List list1 = new ArrayList();
            list1.add(35);
            list1.add(19);
            list1.add("Hello 35");
            list1.add("Hello 19");

            System.out.printf("item 19 Node @ %d before removal of a node %n", list1.lastIndexOf(19));
            list1.remove(list1.lastIndexOf(19)-1);
            System.out.printf("item 19 Node @ %d after removal of a node %n", list1.lastIndexOf(19));


            //it is also possible th change the content of a node
        list.set(list1.lastIndexOf(19), 91); //changes the content of the node where 19 was found-- 19 changes to 99

        System.out.println(list1);
        list.clear(); //clear contents of a list


        //Working with sublist
        /*Sublist is an operator that generates lists from lists.
        It is possible to, for example, delete a range of cells within a list.
        * */

        List subListsExample = new ArrayList();
        subListsExample.add("No");
        subListsExample.add("matter");
        subListsExample.add("what");
        subListsExample.add("you");
        subListsExample.add("do");
        System.out.println("Sub list -> "+subListsExample.subList(0, 3));
        subListsExample.subList(0,3).clear();
        // We used sublist to specify a range (non-inclusive) of the list
        //and use the clear method to deleted the items within that range
        System.out.println("Sub list removed -> "+subListsExample);


        /* There are a lost of interesting algorithms in the collections framework
        that offers relevant functionality for operating with lists:

        Sort: Put the elements of a list in a certain order.

        Shuffle: Randomize the locations of all objects in a list.

        Reverse: Invert the order of a list

        Rotate: Move objects to the end of a list, and when they reach the end,
        have them show up at the other end

        Swap: Swap two elements with one another

        replaceAll: Replace all occurrences in a list using a parameter

        fill: Fill the content of a list with one value

        copy: Make more instances of a list

        binarySearch: Perform optimized searches within a list

        indexOfSubList: Search for the occurrences of a piece
        (a set of consecutive nodes) of a list

        lastIndexOfSubList: Search for the last occurrence of a pieces of a list.
        * */

       list1.clear();
        list1.add(35);
        list1.add(19);
        list1.add("Hello 35");
        list1.add("Hello 19");
        Collections.rotate(list1, 3);
      System.out.println(list1);


      /*
      Note: Lists generated from arrays using Arrays.asList() do not behave in the same way as the objects of the List class described in this section. The lists coming from arrays have a fixed length, which means that elements cannot be removed from the array. The reason for this is that java.util.Arrays implement its own ArrayList class inside the package, one that is different from the one in the collections framework. Confusing, isn't it?
      * */











    }
}
