package org.corejava.oops;

import java.util.Arrays;

public class DemoMods {
    public static void main(String[] args) {
        Quiz qz=new Quiz();
        //System.out.println(qz.arr.length);
        qz.display();
        System.out.println(Arrays.toString(qz.getRow(3)));
        qz.sarcasm("h");

        Builders builders=new Builders();

        builders.greetSome();
        builders.saySome();

    }
}
