package org.corejava.threads;

import java.util.Random;
import java.util.Scanner;

public class InterThreadCommunication {
    public static void main(String[] args) {
        Machine mac=new Machine();
        Puzzle puz=new Puzzle(mac);
        Thread th1=new Thread(mac,"Annamalai");
        Thread th2=new Thread(puz,"Manoj");
        th1.start();th2.start();

    }
}

class Puzzle implements Runnable{

    int users;
    Scanner solve=new Scanner(System.in);
    public Puzzle(){}

    private Machine mine;

    public Puzzle(Machine machine){
        mine=machine;
    }

    public String generate(){
        String captcha="";
        System.out.println(Thread.currentThread().getName()+" about to get pattern");
        Random ran=new Random();
        users=ran.nextInt(10);//5
        int limit=users*2-1;// 9
        for(int row=users;row>0;row--){
            for(int space=users;space>row;space--){
                //System.out.print(" ");
                captcha+=" ";
            }
            for(int data=1;data<=limit;data++){
                //System.out.print("$");
                captcha+="$";
            }
            limit-=2;
            //System.out.println();
            captcha+="\n";
        }
        return captcha;
    }

    @Override
    public void run() {
        System.out.println("Welcome "+Thread.currentThread().getName());
        synchronized (mine.scanner){
            String y=generate();
            System.out.println(y);
            System.out.println("Tell us how many rows in this pattern ");
            int answer=solve.nextInt();
            if(answer==users){
                System.out.println(Thread.currentThread().getName()+" has approved your answer");
                mine.scanner.notify();
            }
            else{
                System.out.println("Invalid answer Transaction failure");
            }
        }
    }
}

class Machine implements Runnable{
    public static int available=28500;
    public Scanner scanner=new Scanner(System.in);
    private int required=0;
    public void withdraw(){
        System.out.println("Enter the amount to withdraw "+Thread.currentThread().getName());
        required=scanner.nextInt();
        if(required<=available) {
            try {
                scanner.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            available-=required;
            System.out.println(Thread.currentThread().getName()+" has withdrawn "+required+" successfully");
        }
        else{
            System.out.println("Sorry"+ Thread.currentThread().getName() +" Insufficient fund");
        }
    }

    @Override
    public void run() {
        System.out.println("Welcome "+Thread.currentThread().getName());
        synchronized (scanner){
            withdraw();
        }
    }
}