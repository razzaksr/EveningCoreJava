package org.corejava;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String isPrime="yes";

        System.out.println("Enter the start value to search prime ");
        int start=scanner.nextInt();
        System.out.println("Enter the end value to stop finding prime");
        int stop=scanner.nextInt();

        for(;start<=stop;start++){
            isPrime="yes";
            for(int number=2;number<=(start/2);number++){
                if(start%number==0){
                    isPrime="no";
                    break;
                }
            }
            if(isPrime.equals("yes")){
                System.out.println(start+" is prime");
            }
            else{
                System.out.println(start+" is not prime");
            }
        }

//        String chart="";int row=0,seat=0,amount=0;
//        row=1;
//        do{
//            seat=1;
//            do{
//                System.out.println("Enter the amount ");
//                amount=scanner.nextInt();
//                if(amount>=250){
//                    System.out.println("You can travel @ "+row+" and "+seat);
//                    chart+="$";
//                }
//                else{
//                    System.out.println("Insufficient to book ticket");
//                    chart+="#";
//                }
//                if(seat==2){
//                    chart+=" ";
//                }
//                seat++;
//            }while(seat<=4);
//            chart+="\n";
//            row++;
//        }while(row<=7);
//
//        System.out.println(chart);
//        int amount=0, bus=0, seat=0;
//        bus=1;
//        while(bus<=4){
//            System.out.println("Bus no is "+bus);
//            seat=1;
//            while(seat<=5){
//                System.out.println("Enter the amount to get ticket ");
//                amount=scanner.nextInt();
//                if(amount>=350){
//                    System.out.println(seat+" booked by yourself");
//                    seat++;
//                }
//                else{
//                    System.out.println("Insufficient to book ticket");
//                }
//            }
//            bus++;
//        }

//        for(int table=1;table<=10;table++){
//            System.out.println("Table "+table);
//            for(int number=1;number<=10;number++){
//                System.out.println(number+"X"+table+"="+(number*table));
//            }
//        }
//        for(int stone=1;stone<=10;++stone){
//            System.out.println(stone);
//            for(int rock=1;rock<=5;rock++){
//                System.out.println(rock+" rock value");
//            }
//        }
    }
}
