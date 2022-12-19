package org.corejava.basic;

public class DemoScopes2 {
    static float yard;
    static Long mobile;
    public static void main(String[] args) {
        System.out.println(DemoScopes2.yard);
        System.out.println(DemoScopes2.mobile);

        DemoScopes2.yard=4.1F;
        DemoScopes2.mobile=876545678765L;

        System.out.println(DemoScopes2.yard);
        System.out.println(DemoScopes2.mobile);
    }
}
