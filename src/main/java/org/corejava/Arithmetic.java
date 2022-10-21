package org.corejava;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

//        int annual=0, monthly=0; float tds=7.8F, tax=0F ,takeHome=0F;
//
//        System.out.println("Tell ur annual salary ");
//        annual=scan.nextInt();
//        monthly=annual/12;
//        System.out.println("Monthly salary is "+monthly);
//        tax=monthly*tds/100;
//        System.out.println("TAx to be paid every month is "+tax);
//        takeHome=monthly-tax;
//        System.out.println("My take home salary is "+takeHome);

        double myBalance=34500.89;int userAmount=0;
        System.out.println("Put the cash inside deposit tray ");
        userAmount=scan.nextInt();
        myBalance=myBalance+userAmount;
        System.out.println(myBalance+" is new balance after the deposition of "+userAmount);
    }
}
