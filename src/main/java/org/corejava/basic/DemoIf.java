package org.corejava.basic;

import java.util.Scanner;

public class DemoIf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        // prime
        int number=0;
        System.out.println("Enter the number to check for prime ");
        number=scan.nextInt();
        if(number==2||number==3||number==5||number==7||number%2!=0&&number%3!=0&&number%5!=0&&number%7!=0){
            System.out.println("Entered digit "+number+" is prime");
        }

//        double ctc=0, takeHome=0;
//        System.out.println("Enter the CTC ");
//        ctc=scan.nextDouble();
//        if(ctc>=2.5){
//            takeHome=ctc-(ctc*0.010);
//            System.out.println("After the tax deduction your take home is "+takeHome);
//        }
    }
}
