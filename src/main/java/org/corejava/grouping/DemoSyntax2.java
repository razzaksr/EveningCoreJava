package org.corejava.grouping;

import java.util.Scanner;

public class DemoSyntax2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double[] quiz=new double[10];// 0 - 9
        System.out.println(quiz.length);
        for(int index=0;index<quiz.length;index++) {
            quiz[index]= scan.nextDouble();
        }

        // traverse
        for(double tmp:quiz){
            System.out.println(tmp);
        }
//        for(int index=0;index<quiz.length;index++) {
//            System.out.println(quiz[index]);
//        }
    }
}
