package org.corejava;

public class DemoScopes1 {
    // west, hifi are class level member
    char west;
    public static void main(String[] args) {
        // args, alphabet,shorting local members of the main
        double alphabet=0;
        Integer shorting=0;
        System.out.println(alphabet);
        System.out.println(shorting);

        alphabet=5.6;shorting=24;

        System.out.println(alphabet);
        System.out.println(shorting);

        // object creation
        DemoScopes1 sp1=new DemoScopes1();

        System.out.println(sp1.west);
        System.out.println(sp1.hifi);

        sp1.west='w';
        sp1.hifi="Razak Mohamed S";

        System.out.println(sp1.west);
        System.out.println(sp1.hifi);
    }
    String hifi;
}
