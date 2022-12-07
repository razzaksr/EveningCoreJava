package org.corejava.grouping;

//Reading: getting data of an array using its position

import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] exp={5,2,0,3,10,8,1,12,4,1,6};
        System.out.println(exp.length);// 0-10
        // read by index 2
//        System.out.println("Tell us position to read the data ");
//        int pos=scanner.nextInt();
//        System.out.println(exp[pos]);

        // read between range
        System.out.println("Enter the start and end to read between those ");
        int start= scanner.nextInt();
        int end= scanner.nextInt();

        for(;start<end;start++){
            System.out.println(exp[start]);
        }
    }
}
