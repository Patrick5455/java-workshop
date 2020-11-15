package chp4_arrays_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {

    /*
    /THere are some classes in the collections framework that force the items within them
    to be sorted Examples of that are TreeSet and TreeMap. The aspect to explore in this section
    is how to use existing sorting mechanisms for lists, but also for cases that
    have datasets with more than one value per data point
     */

    public static void main(String[] args) {
        List<Double> array = new ArrayList<>();

        array.add(5.0);
        array.add(2.2);
        array.add(37.5);

        System.out.println("Original List: "+ array);
        Collections.sort(array);
        System.out.println("Sorted List: "+array);

    }





}


