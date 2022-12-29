package org.corejava.threads;

import java.util.Arrays;
import java.util.Scanner;

public class Behave {
    public static void main(String[] args) {
        Razor razor=new Razor();
//        razor.inserts();
//        razor.leastTwo();
        Thread t1=new Thread(razor,"Agilan");
        Thread t2=new Thread(razor,"Zealous");
        Thread t3=new Thread(razor,"Sabari");
        t1.start();t2.start();t3.start();
    }
}

class Razor extends Thread{
    private int[] nums=new int[10];

    synchronized public void run(){
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId());
        inserts();
        leastTwo();
        System.out.println(Thread.currentThread().getName()+" done");
    }

    public void inserts(){
        Scanner scanner=new Scanner(System.in);
        for(int index=0;index<nums.length;index++){
            System.out.println("Enter the value to "+index);
            nums[index]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(nums));
    }
    public void leastTwo(){
        int lstOne=Integer.MAX_VALUE, lstTwo=Integer.MAX_VALUE;
        for(int index=0;index<nums.length;index++){
            if(nums[index]<lstOne){
                lstTwo=lstOne;
                lstOne=nums[index];
            }
            else if(nums[index]<lstTwo){
                lstTwo=nums[index];
            }
        }
        System.out.println("Least two numbers are "+lstOne+" and "+lstTwo);
    }
}