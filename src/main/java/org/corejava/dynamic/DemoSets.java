package org.corejava.dynamic;

/*
Set: no positions, no duplicates
    HashSet     >> system defined order
    TreeSet     >> ascending order

        add
        addAll

        remove(obj)

        contains(obj)   >> true/false   >> also for list category classes

        Also available in List category classes
        retainAll       >> keep only common in calling Class with compared class
        removeAll       >> keep only different in calling class with compared class
 */

import java.util.HashSet;
import java.util.TreeSet;

public class DemoSets {
    public static void main(String[] args) {
        HashSet set1=new HashSet();
        set1.add(45);set1.add("Razak");set1.add(9.1);set1.add(false);set1.add('R');
        System.out.println("Hash is "+set1);

        HashSet<Double> hset=new HashSet<>();
        hset.add(9.1);hset.add(5.8);hset.add(12.5);hset.add(6.7);
        hset.add(55.6);hset.add(6.1);hset.add(9.1);

        TreeSet<Double> tset=new TreeSet<>();
        tset.addAll(hset);

        System.out.println("Hash is "+hset);
        System.out.println("Tree is "+tset);

        hset.remove(9.1);
        tset.remove(55.6);

        System.out.println("Hash is "+hset);
        System.out.println("Tree is "+tset);

        hset.retainAll(tset);
        System.out.println("Hash is "+hset);

        tset.removeAll(hset);
        System.out.println("Tree is "+tset);

        System.out.println(tset.contains(6.1));
        System.out.println(hset.contains(6.1));
    }
}
