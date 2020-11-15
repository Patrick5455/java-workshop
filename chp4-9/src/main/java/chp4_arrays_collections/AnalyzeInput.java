package chp4_arrays_collections;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class AnalyzeInput {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List texts = new ArrayList();
        String line = "";

        while (!line.equals("*")) {

            System.out.println("Enter words to analyze\n");
            line = scan.nextLine();
            texts.add(line);
            System.out.println(texts);
        }
        scan.close();
        System.out.println(texts);


        // we will use hashset to get unique element in the List
        // then we would iterate over the unique
        //elements in the hashSet to get each
        //unique word and use the frequency method over Collections to get the frquency of each text in the set from the lists


        Set<String> textSet = new HashSet<>();
        textSet.addAll(texts);

        Iterator iterator = textSet.iterator();

        List<DataPoint> dataPoints = new ArrayList<>();
        while (iterator.hasNext()) {
            String word = iterator.next().toString();
            int freq = Collections.frequency(texts, word);
            System.out.printf("%s appears %d%n", word, freq);


            //Sorting the Frequencies by vlaues. We are limited in using a Map to sort,
            //because we can only sort by Key... so we have to create our own dataType and
            //implement our own compare of the Comparator Interface
            //Add the word and the frequencies to a DataPoint class
            DataPoint point = new DataPoint(word, freq);
            dataPoints.add(point);
        }

        //Sort the result by values - Custom DataType (DataPoints) and Comparator Interface
        // Sort using the SortByValue compare method

        Collections.sort(dataPoints, new SortByValue()); //sort the list of datapoints using SortByValue compare to method

        //We can also sort in descending order...
        Collections.sort(dataPoints,Collections.reverseOrder(new SortByValue()));

        //print out the result... we can just directly print out the result.. because we stored objects

        // We can use a lambda
        dataPoints.stream().map(
                point -> Arrays.asList(point.key, point.value))
                .collect(Collectors.toList())
                .forEach(new PrintValues());

        //Use a for-loop
        System.out.println("Sorted by frequencies--> Reversed Order\n");
        for(DataPoint point : dataPoints)
            System.out.printf("%s appears %s times %n", point.key, point.value.toString());

    }

}

    class DataPoint{
        String key ="";
        Integer value =0;

        DataPoint(String key, Integer value){
            this.key = key;
            this.value = value; }

    }


    class SortByValue implements  Comparator<DataPoint>{

        @Override
        public int compare(DataPoint a, DataPoint b) {
            return a.value - b.value;
        }
         }

class PrintValues implements Consumer<List>{

    @Override
    public  void accept(List list) {
        System.out.println("Lambda -> Reversed Order");
        System.out.printf("%s appears %s times %n",
                list.get(0), list.get(1));
    }

}
