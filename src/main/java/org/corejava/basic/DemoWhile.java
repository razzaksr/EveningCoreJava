package org.corejava.basic;

import java.util.Scanner;

public class DemoWhile {
    public static void main(String[] args) {
        int amount=0,quantity=0,toPayable=0, available=10;
        Scanner scanner=new Scanner(System.in);
        while(available>0){
            System.out.println("Enter the number of mobiles you want ");
            quantity=scanner.nextInt();
            if(quantity>available){
                System.out.println("Only "+available+" stocks available");
                continue;// skip the current iteration
            }
            else{
                toPayable=quantity*24555;
                System.out.println("Enter the amount ");
                amount=scanner.nextInt();
                if(amount>=toPayable){
                    System.out.println("You bought redmi 13 Pro of "+quantity);
                    available-=quantity;
                }
                else{
                    System.out.println("Insufficient amount to purchase");
                }
            }
        }

//        while(available>0){
//            System.out.println("Enter the amount ");
//            amount=scanner.nextInt();
//            if(amount>=24555){
//                System.out.println("You bought redmi 13 Pro");
//                available--;
//            }
//            else{
//                System.out.println("Insufficient amount to purchase");
//            }
//
//        }

//        int number=3;
//        while(number<=30){
//            System.out.println(number);
//            number+=3;
//        }
//        int cosmo=10;//init
//        while(cosmo<=50){
//            System.out.println(cosmo+" is current value");
//            cosmo++;//cosmo+=5;// iter
//        }
//        // infinite loop
//        while(true){
//            System.out.println("Welcome to Zealous");
//        }
    }
}
