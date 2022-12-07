package org.corejava.grouping;

import java.util.Arrays;

public class Updation {
    public static void main(String[] args) {
        char[] step={'V','Q','R','B','P','K'};
        System.out.println(step.length);// 0 - 5

        // update by position/index
        step[3]='T';
        System.out.println(Arrays.toString(step));

        //update by condition : 70 - 80 >> by next character
        for(int check=0;check<step.length;check++){
            if(step[check]>=70&&step[check]<=80){
                step[check]++;
            }
        }

        System.out.println(Arrays.toString(step));
    }
}
