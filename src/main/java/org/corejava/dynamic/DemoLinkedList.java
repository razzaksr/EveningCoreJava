package org.corejava.dynamic;

/*
LinkedList : positions of objects starts with 0
    add/addLast
    addFirst
    add(pos,obj)

    get(pos)
    getFirst()
    getLast()

    remove(pos)
    removeLast
    removeFirst/remove
    remove(object)
 */

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> link=new LinkedList<>();

        link.add("CyberPlobia");link.add("Razak Mohamed");
        link.addLast("Sabari");link.addFirst("Mani");link.add("Sheik");
        link.add("Venkat");link.addFirst("Vikram");link.add("Vinay");
        link.add(1,"Zealous");

        System.out.println(link);

        link.removeFirst();//link.remove();
        System.out.println(link.getFirst());
        link.remove("Mani");
        System.out.println(link);
        link.removeLast();
        link.remove(3);
        System.out.println(link);

        System.out.println(link.getLast());

    }
}
