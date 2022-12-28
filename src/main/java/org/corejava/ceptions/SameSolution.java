package org.corejava.ceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SameSolution {

    static double[] arr={8.9,2.4,12.9,5.6,8.2,4.4,90.5,120.5,7.1,4.7,3.3};
    static Scanner scanner=new Scanner(System.in);

    public static int linear(double users, int start,int end){
        for(int index=start;index<end;index++){
            if(arr[index]==users)
                return index;
        }
        return -1;
    }

    public static void main(String[] args) {

        double userWish=0;int begin=0, stop=0;
        try{
            System.out.println("Enter the data to search in array linearly ");
            userWish=scanner.nextDouble();
            System.out.println("Enter the start point from where search gonna begin");
            begin=scanner.nextInt();
            System.out.println("Enter the end point till which search has to stop");
            stop=scanner.nextInt();
            int found=linear(userWish,begin,stop);
            System.out.println(userWish+" found @ "+found);
        }
        catch (InputMismatchException | ArrayIndexOutOfBoundsException am){
            System.out.println(am);
            Scanner newOne=new Scanner(System.in);
            System.out.println("Enter values as numeric only");
            System.out.println("Enter the data to search in array linearly ");
            userWish=newOne.nextDouble();
            System.out.println("Enter the start point from where search gonna begin");
            begin=newOne.nextInt();
            System.out.println("Enter the end point till which search has to stop");
            stop=newOne.nextInt();
            int found=linear(userWish,begin,stop);
            System.out.println(userWish+" found @ "+found);
        }
    }
}
