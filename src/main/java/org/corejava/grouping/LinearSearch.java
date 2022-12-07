package org.corejava.grouping;

// searching: find the position by data

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        float[] flats={450.5F,1200.5F,2390.1F,500.0F,890.2F};
        Scanner scanner=new Scanner(System.in);
        float userGiven=scanner.nextFloat();

        for(int pos=0;pos< flats.length;pos++){
            //System.out.println(flats[pos]);
            if(userGiven==flats[pos]){
                System.out.println(userGiven+" available @ "+pos);
            }
        }
    }
}
