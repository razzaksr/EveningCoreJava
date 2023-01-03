package org.corejava.oops;

public class Cast {
    public static void main(String[] args) {
        String hai="Hai there!";
        System.out.println(hai.toUpperCase());
        // upcasting
        Object obj=(Object)hai;
        System.out.println(obj);

        obj=456;
        System.out.println(obj);
        //downcasting
        Integer hello=(Integer)obj;
        System.out.println(hello);
    }
}
