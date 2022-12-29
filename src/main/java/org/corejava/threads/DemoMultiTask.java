package org.corejava.threads;

import java.util.Random;

public class DemoMultiTask {
    public static void main(String[] args) {
        Captcha cap=new Captcha();
        Organises shell=new Organises();

        Thread t1=new Thread(cap,"Razak");
        Thread t2=new Thread(cap,"Sabari");
        Thread t3=new Thread(cap,"Sheik");
        Thread t4=new Thread(shell,"Agilan");
        Thread t5=new Thread(shell,"Zealous");
        Thread t6=new Thread(shell,"Manikandan");
        t1.start();t2.start();t3.start();
        t4.start();t5.start();t6.start();
    }
}

class Captcha implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" about to get pattern");
        Random ran=new Random();
        int users=ran.nextInt(10);//5
        int limit=users*2-1;// 9
        for(int row=users;row>0;row--){
            for(int space=users;space>row;space--){
                System.out.print(" ");
            }
            for(int data=1;data<=limit;data++){
                System.out.print("$");
            }
            limit-=2;
            System.out.println();
        }
    }

}