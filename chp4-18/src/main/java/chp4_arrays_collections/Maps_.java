package chp4_arrays_collections;

import java.util.HashMap;
import java.util.Map;

public class Maps_ {


    public static void main(String[] args) {

        Map map = new HashMap();

        map.put("number", new Integer(1));
        map.put("text", new String("Hello World"));
        map.put("decimal", new Double(5.7));

        System.out.println(map.get("text"));

        if (!map.containsKey("byte")){
            System.out.println("There are no bytes here");
        }
    }

    /* The main methods in available this interface are:
    put(Object Key, Object Value)
    putAll(Map map)
    remove(Object Key)
    get (Object Key)
    containsKey (Object key)
    KeySet ()
    entrySet()
    * */

    //Keys must be unique. There are cannot be two of the same keys in a map

    /*THere are 3 different classes for maps (similar to set in form and meaning);
    * 1. HashMap
    * 2. TreeMap
    * 3. LinkedHashMap
    * */




}
