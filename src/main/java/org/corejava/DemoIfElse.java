package org.corejava;

import java.util.Scanner;

public class DemoIfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

//        char isItrAvailable='\0';
//        System.out.println("Tell us ITR filed or not (y/n)");
//        isItrAvailable=scan.next().charAt(0);
//        if(isItrAvailable=='y'||isItrAvailable=='Y'){
//            System.out.println("Public sector banks with 7years of tenor available to your Automobile Loan");
//        }
//        else{
//            System.out.println("Automobile loan with 5years of tenor in public banks or private financial sectors available");
//        }

        int required=0;
        System.out.println("Enter the desired amount to withdraw ");
        required= scan.nextInt();
        if(required%500==0){
            int count=required/500;
            System.out.println("Amount "+required+" can be withdrawn by "+count+" 500's");
        }
        else{
            System.out.println("Amount "+required+" is not multiples of 500");
        }
    }
}
