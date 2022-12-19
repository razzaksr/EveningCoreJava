package org.corejava.basic;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        double accBal=45000.4;String wish="";int amount=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tell us what you wish for");
        wish= scanner.next();
        switch(wish){
            case "withdraw": case "debit":
                System.out.println("Amount to withdraw ");
                amount=scanner.nextInt();
                if(amount<=accBal){
                    accBal-=amount;
                    System.out.println("withdraw success of rupees "+amount);
                }
                else{
                    System.out.println("Insufficient balance");
                }
                break;
            case "deposit": case "credit":
                System.out.println("Enter the amount to deposit ");
                amount=scanner.nextInt();
                accBal+=amount;
                System.out.println(amount+" user given added with account");
                break;
            case "enquiry": case "balance":
                System.out.println("Available balance is "+accBal);
                break;
            default:System.out.println("Not a valid choice");
        }
    }
}
