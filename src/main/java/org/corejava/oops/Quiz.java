package org.corejava.oops;

import java.util.Arrays;

public class Quiz {
    private String[][] arr={
            {"Thivin","Thilak","Vishnu","Ganesh","Pradeep"},
            {"Haripriya","Aphsheya"},
            {"Vasudevan","Agilan"}
    };

    public void display(){
        for(String[] each:arr){
            System.out.println(Arrays.toString(each));
        }
    }

    protected String[] getRow(int row){
        if(row>-1&&row<arr.length){
            return arr[row];
        }
        return new String[0];
    }

    void sarcasm(String phrase){
        for(String[] row:arr){
            for(String one:row){
                if(one.contains(phrase)){
                    System.out.println(one);
                }
            }
        }
    }
}
