package org.corejava;

/*
Logical Operator: && ||
 */

import java.util.Scanner;

public class Logicals {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//        int age=0;
//        System.out.println("Tell us your age ");
//        age=scan.nextInt();
//        System.out.println("Am i eligible to term insurance "+(age<=40&&age>=21));

//        double annual=0, fdValue=0;
//        System.out.println("Tell us Annual income ");
//        annual=scan.nextDouble();
//        System.out.println("Tell us Fd value if exists ");
//        fdValue=scan.nextDouble();
//        System.out.println("Am i eligible to get 1lackh credit card "+(annual>=2.8||fdValue>=2));

        int age=0;double insuranceValue=0, annual=0;
        System.out.println("Tell us your age ");
        age=scan.nextInt();
        System.out.println("Tell us insurance value if any ");
        insuranceValue=scan.nextDouble();
        System.out.println("Tell us annual income if any ");
        annual=scan.nextDouble();

        System.out.println("Am i eligible to get 2Lackhs of PL "+(age>=21&&age<55&&insuranceValue>=8||annual>=3.5));
    }
}
