package org.corejava;

/*
Relational Operator: > >= < <= == !=
true/false


String:
    charAt(position)>> character
 */

import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


//        float annual=0F;
//        System.out.println("Tell us your Annual income ");
//        annual=scan.nextFloat();
//        System.out.println("Is tax has to be paid "+(annual>2.5));

//        char person='\0';// character null
//        System.out.println("Tell us who you are? ");
//        person=scan.next().charAt(0);
//        System.out.println("Are you eligible to attend the workshop "+(person=='s'));

        int age=0;
        System.out.println("Tell us your age ");
        age=scan.nextInt();
        System.out.println("Am i eligible to term insurance "+(age<=40));

    }
}
