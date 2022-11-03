package org.corejava;

import java.util.Scanner;

public class DemoNestedIf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

//        String game="";double weight=0;
//
//        // theme park
//
//        System.out.println("Tell us game wish to play ");
//        game=scanner.next();
//        if(game.equals("water")){
//            System.out.println("Black thunder water games available @ 5th layout");
//            System.out.println("Enter the weight to check for fun fill slides ");
//            weight= scanner.nextDouble();
//            if(weight>=45.9){
//                System.out.println("You can play all the water games including fun fill slides");
//            }
//            else{
//                System.out.println("You can play artificial beach, rapid river and other games except fun fill slides");
//            }
//        }
//        else{
//            System.out.println("Roller coaster, giant wheel and other games available @ Layout 3");
//        }

        //loan process
        int cibil=0;double annualIncome=0;
        System.out.println("Cibil Score ");
        cibil= scanner.nextInt();
        if(cibil>=600){
            System.out.println("Loan can be offered");
            System.out.println("Enter the annual income ");
            annualIncome= scanner.nextDouble();
            if(annualIncome>=2.5){
                System.out.println("Personal Loan of 2Lacks can be offered");
            }
            else{
                System.out.println("Personal Loan can't be offered, try with Loan against property");
            }
        }
        else{
            System.out.println("You are seems to be defaulter, loan can't offer");
        }
    }
}
