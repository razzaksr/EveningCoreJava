package org.corejava.threads;

import java.util.Arrays;
import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) throws InterruptedException {
        ShellBoy shell=new ShellBoy();
        Thread t1=new Thread(shell,"Agilan");
        Thread t2=new Thread(shell,"Zealous");
        Thread t3=new Thread(shell,"Sabari");
        t1.start();t1.join();
        t2.start();t2.join();
        t3.start();
    }
}

class ShellBoy implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
//        synchronized (this){
//            statement();
//        }
        statement();
        find();
        System.out.println(Thread.currentThread().getName()+" has done");
    }
    private int[] transactions=new int[10];
    public void statement(){
        Scanner scanner=new Scanner(System.in);
        for(int index=0;index<transactions.length;index++){
            System.out.println("Enter the transaction value ");
            transactions[index]= scanner.nextInt();
        }
        System.out.println("Total transactions are\n"+ Arrays.toString(transactions));
    }
    public void find(){
        int creditCount=0, debitCount=0;
        for(int index=1;index<transactions.length;index++){
            if(transactions[index]>transactions[index-1]){
                creditCount++;
            }
            else{
                debitCount++;
            }
        }
        System.out.println("Credits "+creditCount+"\nDebits "+debitCount+" out of last 10 transactions by "+Thread.currentThread().getName());
    }
}