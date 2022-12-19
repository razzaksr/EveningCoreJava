package org.corejava.basic;

public class CommandLineArgument {
    public static void main(String[] vasan) {
        System.out.println(vasan.length);
        String myName=vasan[0];
        System.out.println("My name is "+myName);
        int experience=Integer.parseInt(vasan[1]);
        experience=experience+2;
        System.out.println("My experience "+experience);
    }
}
