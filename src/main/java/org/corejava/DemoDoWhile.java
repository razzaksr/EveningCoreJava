package org.corejava;

import java.util.Scanner;

public class DemoDoWhile {
    public static void main(String[] args) {
        int staff=10, count=0;
        Scanner scanner=new Scanner(System.in);
        float time=0F;
        do{
            System.out.println("Enter the login time ");
            time= scanner.nextFloat();
            if(time>=9.15F){
                System.out.println(staff+" is late comer chances of loss of pay");
                count++;
            }
            else{
                System.out.println("Staff "+staff+" is logged in "+time);
            }
            staff--;
        }while(staff>0);
        System.out.println(count+" is number of staff's are late");
//        int begin=11;
//        do{
//            if(begin==2||begin==3||begin==5||begin==7||begin%2!=0&&begin%3!=0&&begin%5!=0&&begin%7!=0){
//                System.out.println(begin);
//            }
//            begin++;
//        }while(begin<=100);
//        int start=60;
//        do{
//            System.out.println("Value is "+start);
//            start++;
//        }while(start<=50);
//        do{
//            System.out.println("Ready to learn frameworks");
//        }while(true);
    }
}
