package org.corejava.basic;

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        String skill="";
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the skill you knew ");
//        skill=scanner.next();
//        switch(skill){
//            case "java": case "spring": case "jpa":
//                System.out.println("BAck end developer role with 9.5LPA");
//                break;
//            case "python": case "R": case "r":
//                System.out.println("Data scientist role with 12.5LPA requires 5yrs of EXP");
//                break;
//            case "javascript":
//                System.out.println("Front end developer with 7.2LPA");
//                break;
//            default:System.out.println(skill+" doesn't match with any vacancies");
//        }
//        char option='\0';
//        System.out.println("Enter the model of the car to get price details ");
//        option=scanner.next().charAt(0);
//        switch(option){
//            case 's': case 'S':
//                System.out.println("Baleno Sigma with 4power windows onroad is 746000.4");
//                break;
//            case 'd': case 'D':
//                System.out.println("Baleno Delta with music system onroad is 829800.12");
//                break;
//            case 'z': case 'Z':
//                System.out.println("Baleno Zeta with android auto, defogger is 945700.4");
//                break;
//            case 'a': case 'A':
//                System.out.println("Balano Alpha with fog lamp, rear defogger is 1042800.4");
//                break;
//            default:System.out.println(option+" mismatch with models");
//        }
        int ram=0;
        System.out.println("Enter the desired RAM size ");
        ram=scanner.nextInt();
        switch(ram){
            case 8:
                System.out.println("8gb of oppo t1 5g with black and olive color price of 19700 with mediatek gpu");
                break;
            case 16:
                System.out.println("16gb of mi 12t, samsung a73 available in price 25000-30000");
                break;
            case 32:
                System.out.println("32GB of samsung galaxy ace available in 45000");
                break;
            default:System.out.println("Invalid RAM capacity");
        }
    }
}
