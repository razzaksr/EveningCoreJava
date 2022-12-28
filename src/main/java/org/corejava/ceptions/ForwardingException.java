package org.corejava.ceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ForwardingException {

    static double[] arr={8.9,2.4,12.9,5.6,8.2,4.4,90.5,120.5,7.1,4.7,3.3};
    static double discount;

    public static void update(){
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Enter the maximum price based on 10 percent discount");
            discount=scanner.nextDouble();
            for(int index=0;index< arr.length;index++){
                if(arr[index]>discount){
                    arr[index]-=(arr[index]*0.100);
                }
            }
        }
        catch (InputMismatchException ins){
            System.out.println(ins+" forwarded");
            throw ins;
        }
    }

    public static void main(String[] args) {
        try{
            ForwardingException.update();
            System.out.println(Arrays.toString(arr));
        }
        catch (InputMismatchException ins){
            Scanner scanner1=new Scanner(System.in);
            System.out.println("Enter the maximum price based on 10 percent discount in numbers only");
            discount=scanner1.nextDouble();
            for(int index=0;index< arr.length;index++){
                if(arr[index]>discount){
                    arr[index]-=(arr[index]*0.100);
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
