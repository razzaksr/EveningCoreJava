package org.corejava.dynamic;

/*
ArrayList   >> 10,20    >> asynchronous
Vector      >> 10,15    >> synchronous

    add
    add(pos,obj)
    addAll  >> linked list

    get(pos)

    remove(pos)
    remove(object)

    set(pos,obj)    >> also available in linked list

    indexOf(obj)    >> search >> also available linked list

Also available for linked list
Collections: java.util
    sort
    reverse
    replaceAll
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class DemoVecArray {
    public static void main(String[] args) {
        ArrayList<Character> list1=new ArrayList<>();
        list1.add('R');list1.add('V');list1.add('E');list1.add('T');list1.add('S');
        list1.add('Y');list1.add('K');list1.add('a');list1.add('W');list1.add('c');
        list1.add(1,'Y');

        Vector<Character> list2=new Vector<>();
        list2.addAll(list1);

        System.out.println("Array list is "+list1);
        System.out.println("Vector is "+list2);

        list1.remove((Character)'E');
        list2.remove(10);

        System.out.println("Array list is "+list1);
        System.out.println("Vector is "+list2);

        list1.set(1,'a');

        System.out.println("Array list is "+list1);
        System.out.println("Vector is "+list2);

        System.out.println(list1.indexOf('Y'));
        System.out.println(list1.indexOf('E'));

        Collections.replaceAll(list2,'Y','Z');
        System.out.println("Vector is "+list2);

        Collections.sort(list1);
        System.out.println("Array list is "+list1);

        Collections.reverse(list2);
        System.out.println("Vector is "+list2);
    }
}
