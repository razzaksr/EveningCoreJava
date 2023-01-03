package org.corejava.dynamic;

/*
List: duplicate objects are allowed, all objects in storage has positions/key
    ArrayList
    Vector
    LinkedList
    Stack
 */

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class DemoLists {
    public static void main(String[] args) {
        // generic  Object
        List obj=new Stack();
        obj.add("Agilan");obj.add(90);obj.add(5.6);obj.add('R');obj.add(false);

        System.out.println(obj);

        for (int index=0;index<obj.size();index++){
            System.out.println(obj.get(index));
        }

        // non generic >> Class specific object only
        List<Integer> objs=new Stack<>();
        objs.add(89);objs.add(11);objs.add(77);objs.add(11);objs.add(100);

        System.out.println(objs);

        //for(Integer i:objs){System.out.println(i);}

        Iterator<Integer> it=objs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
