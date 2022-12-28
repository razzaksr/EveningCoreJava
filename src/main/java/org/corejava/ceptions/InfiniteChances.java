package org.corejava.ceptions;

import java.util.Scanner;

public class InfiniteChances {
    static double[] arr={8.9,2.4,12.9,5.6,8.2,4.4,90.5,120.5,7.1,4.7,3.3};
    static int start, end;
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.println("Enter start and end");
            start=scanner.nextInt();
            end=scanner.nextInt();
            for(int index=start;index<end;index++){
                System.out.print(arr[index]+" ");
            }
            System.out.println("\nNew Array formed");
        }
        catch(ArrayIndexOutOfBoundsException am){
            System.out.println(am);
            main(args);
        }
    }
}
