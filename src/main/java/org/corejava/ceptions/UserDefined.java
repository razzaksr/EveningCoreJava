package org.corejava.ceptions;

import java.util.Scanner;

public class UserDefined {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=0,num2=1, sum=0, total=0;
        try{
            System.out.println("enter the total fibo series you want ");
            total = scanner.nextInt();
            if(total>=2){
                System.out.println(num1+"\n"+num2);
                total-=2;
                while(total>0){
                    sum=num1+num2;
                    System.out.println(sum);
                    num1=num2;
                    num2=sum;
                    total--;
                }
            }
            else{
                //System.out.println("Can't generate fibonacci series with "+total);
                FibonacciException fibo=new FibonacciException();
                throw fibo;
            }
        }
        catch(FibonacciException na){
            System.out.println(na);
            main(args);
        }
    }
}
