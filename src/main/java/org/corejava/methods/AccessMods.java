package org.corejava.methods;

import org.corejava.oops.Quiz;

import java.util.Arrays;

public class AccessMods extends Quiz {
    public static void main(String[] args) {
        AccessMods qz=new AccessMods();

        qz.display();
        System.out.println(Arrays.toString(qz.getRow(2)));
        //qz.sarcasm("e");
    }
}
