package chp4_arrays_collections;

import java.util.*;

public class Iterators {

    //Iterators are used in Java to browse through collections.

    public static void main(String[] args) {

        List array = new ArrayList();

            array.add(5);
            array.add(6);
            array.add(7);

        Iterator iterator = array.iterator();

        /* This is the most common form iterator.
         It does not have the possibility of going back
         It has one final method called remove (iterator.remove()) which will eliminate
         the current element that the iterator is pointing to from the collection
          */

        while (iterator.hasNext()){
            //Point to next element
            int i = (Integer) iterator.next();
            //Print elements
            System.out.print(i + " ");
        }



        /* Another iterator called the listIterator gives more possibility.
        We can used the listIterator to add new elements and changing elements.
        ListIterators work only with lists.
        * */

        List<Double> arrayList = new ArrayList<>();

        arrayList.add(5.0);
        arrayList.add(2.2);
        arrayList.add(37.5);
        arrayList.add(3.1);
        arrayList.add(1.3);

        System.out.println("Original List: "+ arrayList);

        ListIterator listIterator = arrayList.listIterator();

        while (listIterator.hasNext()){
            //point to next element
            double ele = (Double) listIterator.next();
            //round up to the decimal number
            listIterator.set(Math.round(ele)); // use the listIterator to mutate the element in the ext node
        }

        System.out.println("Modified List -> "+ arrayList);

        //By calling listIterator.set(), we modify each of the items in the list


        // We can use iterators to iterate through a map. Use the below

        Map map = new HashMap();


        map.put("Hello", 1);
        map.put("World", 2);

        Iterator <Map.Entry> mapIterator = map.entrySet().iterator();

        while (mapIterator.hasNext()){
           Map.Entry entry = mapIterator.next();
           System.out.printf("Key: %s Value: %s%n", entry.getKey(), entry.getValue()); }




    }
}
