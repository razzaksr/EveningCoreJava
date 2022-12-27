package org.corejava.ceptions;

import java.util.Scanner;

public class PurposeOfHandling {
    public static void main(String[] args) {
        String myOrg="Zealous Academy of Career Training";
        Scanner scanner=new Scanner(System.in);
        int start=0,end=0;String newOne=null;
        System.out.println("Enter the start and end");
        start=scanner.nextInt();
        end=scanner.nextInt();
        try{
            newOne=myOrg.substring(start,end);
        }
        catch(StringIndexOutOfBoundsException sinob){
            System.out.println(sinob);
            start=scanner.nextInt();
            end=scanner.nextInt();
            newOne=myOrg.substring(start,end);
        }
        finally {
            System.out.println("Extracted phrase is "+newOne);
        }
    }
}
