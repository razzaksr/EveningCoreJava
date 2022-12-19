package org.corejava.basic;

import java.util.Scanner;

public class DemoElseIfLadder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        float weight=0F;
//        System.out.println("Enter the weight ");
//        weight= scanner.nextFloat();
//        if(weight>=90.5F){
//            System.out.println("You are eligible to enroll in Heavyweight class");
//        }
//        else if(weight>65.8&&weight<90.5){
//            System.out.println("You are eligible to enroll in Lightweight class");
//        }
//        else if(weight>45.8&&weight<65.8){
//            System.out.println("You are eligible to enroll in Featherweight class");
//        }
//        else{
//            System.out.println("You are not eligible to participate in the tournament");
//        }

//        int budget=0;
//        System.out.println("Enter the laptop budget ");
//        budget=scanner.nextInt();
//        if(budget>=80000){
//            System.out.println("Dell, Apple and Sony available");
//        }
//        else if(budget>=30000&&budget<=50000){
//            System.out.println("HP, Acer and Dell available");
//        }
//        else if(budget>=20000&&budget<30000){
//            System.out.println("Acer, Realme and lenovo available");
//        }
//        else{
//            System.out.println("No laptops matches your budget "+budget);
//        }

        int budget=0;String brand="";
        System.out.println("Enter the laptop budget ");
        budget=scanner.nextInt();
        if(budget>=80000){
            System.out.println("Dell, Apple and Sony available");
        }
        else if(budget>=30000&&budget<=50000){
            System.out.println("HP, Acer and Dell available");
            System.out.println("Enter any one brand from the above ");
            brand=scanner.next();// hp

            if(brand.equalsIgnoreCase("HP")){
                System.out.println("Core i3 11gen, 8gb ram, 256SSD available in HP");
            }
            else if(brand.equalsIgnoreCase("dell")){
                System.out.println("Core i3 12gen, 4gb ram, 256SSD available in DELL");
            }
            else{
                System.out.println("Core i5 10gen, 8gb ram, 250gbSSD available in Acer");
            }
        }
        else if(budget>=20000&&budget<30000){
            System.out.println("Acer, Realme and lenovo available");
        }
        else{
            System.out.println("No laptops matches your budget "+budget);
        }
    }
}
