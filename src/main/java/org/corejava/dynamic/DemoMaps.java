package org.corejava.dynamic;

/*
Map:<keyclass,valueclass>   : custom key for our objects
    key objects shouldn't duplicate
    value object can be duplicated

    HashMap     >> pair of key-value random order>> 10,20>>asynchronized
    Hashtable   >> random >> 11,22,33>> synchronized
    TreeMap     >> ascending based on key

    put(k,v)
    putAll

    get(k)

    remove(k)

    containsKey(k)
    containsValue(v)

    keySet      >> Set
    values      >> Collection
 */

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class DemoMaps {
    public static void main(String[] args) {
        Hashtable<String,Integer> map1=new Hashtable<>();
        TreeMap<String,Integer> map2=new TreeMap<>();

        map1.put("Core Java",45);map1.put("HTML",7);map1.put("CSS",3);
        map1.put("JS",5);map1.put("BS",7);map1.put("React JS",40);
        map1.put("Back end",40);map1.put("JUnit",2);map1.put("Jenkins",1);

        map2.putAll(map1);

        System.out.println(map1);
        System.out.println(map2);

        map2.put("CSS",5);// update,replace

        System.out.println(map2);

        map1.remove("CSS");
        map2.remove("React JS");

        System.out.println(map1.get("React JS"));

        System.out.println(map1.containsKey("CSS"));
        System.out.println(map1.containsValue(40));

        System.out.println(map2.containsKey("React JS"));

        Set<String> k = map2.keySet();
        System.out.println("Topics are "+k);
        Collection<Integer> days = map1.values();
        System.out.println("Number of days "+days);

    }
}
