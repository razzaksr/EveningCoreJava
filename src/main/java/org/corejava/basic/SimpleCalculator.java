package org.corejava.basic;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int option=0, count=0, data=0;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. division\n5. Comparison\n6. Exit");
            option=scanner.nextInt();
            if(option==1){
                int result=0;
                System.out.println("Enter the number of inputs to required");
                count= scanner.nextInt();
                while(count>0){
                    System.out.println("Enter the number to add ");
                    data= scanner.nextInt();
                    result+=data;
                    count--;
                }
                System.out.println(result+" is added value");
            }
            else if(option==2){
                int result=Integer.MIN_VALUE;
                System.out.println("Enter the number of inputs to required");
                count= scanner.nextInt();
                while(count>0){
                    System.out.println("Enter the number to subtract ");
                    data = scanner.nextInt();
                    if(result==Integer.MIN_VALUE){
                        result=data;
                    }
                    else {
                        result -= data;
                    }
                    count--;
                }
                System.out.println(result+" is subtract value");
            }
            else if(option==3){
                int result=1;
                System.out.println("Enter the number of inputs to required");
                count= scanner.nextInt();
                while(count>0){
                    System.out.println("Enter the number to multiply ");
                    data= scanner.nextInt();
                    result*=data;
                    count--;
                }
                System.out.println(result+" is multiplied value");
            }
            else if(option==4){
                int result=Integer.MIN_VALUE;
                System.out.println("Enter the number of inputs to required");
                count= scanner.nextInt();
                while(count>0){
                    System.out.println("Enter the number to divide ");
                    data= scanner.nextInt();
                    if(result==Integer.MIN_VALUE){
                        result=data;
                    }
                    else {
                        result /= data;
                    }
                    count--;
                }
                System.out.println(result+" is divided value");
            }
            else if(option==5){
                int maxValue=Integer.MIN_VALUE;
                System.out.println("Enter the number of inputs to required");
                count= scanner.nextInt();
                while(count>0){
                    System.out.println("Enter the number to add ");
                    data= scanner.nextInt();
                    if(data>maxValue){
                        maxValue=data;
                    }
                    count--;
                }
                System.out.println(maxValue+" is maximum among given inputs");
            }
            else{
                return;
            }
        }while(true);
//        int option=0, num1=0, num2=0;
//        Scanner scanner=new Scanner(System.in);
//        do{
//            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. division\n5. Comparison\n6. Exit");
//            option=scanner.nextInt();
//            if(option==1){
//                System.out.println("Enter the num1 and num2 ");
//                num1= scanner.nextInt();
//                num2= scanner.nextInt();
//                System.out.println((num1+num2)+" is added value");
//            }
//            else if(option==2){
//                System.out.println("Enter the num1 and num2 ");
//                num1= scanner.nextInt();
//                num2= scanner.nextInt();
//                System.out.println((num1-num2)+" is subtracted value");
//            }
//            else if(option==3){
//                System.out.println("Enter the num1 and num2 ");
//                num1= scanner.nextInt();
//                num2= scanner.nextInt();
//                System.out.println((num1*num2)+" is multiplied value");
//            }
//            else if(option==4){
//                System.out.println("Enter the num1 and num2 ");
//                num1= scanner.nextInt();
//                num2= scanner.nextInt();
//                System.out.println((num1/num2)+" is divided value");
//            }
//            else if(option==5){
//                System.out.println("Enter the num1 and num2 ");
//                num1= scanner.nextInt();
//                num2= scanner.nextInt();
//                if(num1>num2){
//                    System.out.println(num1+" is bigger than "+num2);
//                }
//                else{
//                    System.out.println(num2+" is bigger than "+num1);
//                }
//            }
//            else{
//                return;
//            }
//        }while(true);
    }
}
