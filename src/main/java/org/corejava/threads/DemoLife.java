package org.corejava.threads;

import lombok.Data;

import java.util.Arrays;
import java.util.Scanner;

public class DemoLife {
    public static void main(String[] args) {
        Organises shell=new Organises();
        Thread t1=new Thread(shell,"Agilan");
        Thread t2=new Thread(shell,"Zealous");
        Thread t3=new Thread(shell,"Sabari");
        t1.start();t2.start();t3.start();
    }
}

interface Searchs{
    public int linear(double users);
    public int linear(int start,int end,double users);
}

interface Manipulates extends Searchs {
    public void show();
}

@Data
class Organises implements Manipulates, Runnable {
    private double[] arr={45.6,9.1,2.1,8.9,5.6,12.5,89.5,3.4,4.1,9.1,10.5};
    private Scanner scanner=new Scanner(System.in);
    private String choice="";
    private double users;

    @Override
    synchronized public void run() {
        System.out.println("Welcome "+Thread.currentThread().getName());
        System.out.println("Tell us what you wish to do ");
        choice=scanner.next();
        switch(choice){
            case "view":show();break;
            case "search":
                System.out.println("Enter the data to search throughout the array ");
                users = scanner.nextDouble();
                System.out.println(linear(users)+" is position where "+users+" exists");
                break;
            case "boundry":
                System.out.println("Enter the data to search throughout the array ");
                users= scanner.nextDouble();
                System.out.println("Enter the begin and end position to search "+users);
                int begin= scanner.nextInt();
                int end= scanner.nextInt();
                System.out.println(linear(begin,end,users)+" is position where "+users+" exists");
                break;
            default:System.out.println(choice+" invalid");Thread.currentThread().stop();
        }
        System.out.println("Thank you for visiting "+Thread.currentThread().getName());
    }

    @Override
    public void show() {
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public int linear(double users) {
        for(int index=0;index<arr.length;index++){
            if(arr[index]==users)
                return index;
        }
        return -1;
    }

    @Override
    public int linear(int start, int end, double users) {
        for(int index=start;index<end;index++){
            if(arr[index]==users)
                return index;
        }
        return -1;
    }
}