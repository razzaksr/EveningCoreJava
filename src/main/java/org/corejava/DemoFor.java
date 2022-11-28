package org.corejava;

import java.util.Scanner;

public class DemoFor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int exp=0;

        for(int vacancy=30;vacancy>0;){
            System.out.println("Enter the experience ");
            exp= scanner.nextInt();
            if(exp>=4&&exp<=8){
                System.out.println("You are recruited as number "+vacancy);
                vacancy--;
            }
            else{
                System.out.println("You are not match with our requirement");
            }
        }
//        int exp=0;
//        for(int vacancy=30;vacancy>0;vacancy--){
//            System.out.println("Enter the experience ");
//            exp= scanner.nextInt();
//            if(exp>=4&&exp<=8){
//                System.out.println("You are recruited as number "+vacancy);
//            }
//            else{
//                System.out.println("You are not match with our requirement");
//            }
//        }
//        int data=0, factorial=1;
//        // 5 >> 5x4x3x2x1   >> 120
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the number to find factorial ");
//        data= scanner.nextInt();
//        for(;data>0;data--){
//            //System.out.println(data);
//            factorial*=data;
//        }
//        System.out.println(factorial+" is fact value");
//        for(int number=1;number<=90;number++){
//            System.out.println("The number value is "+number);
//        }
//        for(;;){
//            System.out.println("Spring is demanded back end framework");
//        }
    }
}
