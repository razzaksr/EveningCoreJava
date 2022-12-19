package org.corejava.grouping;

/*
OOPS:
    Polymorphism:
        compile : method Overloading
                In a class, same name for more than one method defined by differentiating
                its parameter any of following by count, order, type
        run
 */

import java.util.Arrays;

public class MultiRead {

    public void list(String[][] arr){
        for(String[] row:arr){
            System.out.println(Arrays.toString(row));
        }
    }

    public void read(int col, String[][] arr){
        if(col<arr[1].length&&col>=0){
            for(int row=0;row<arr.length;row++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        else{
            System.out.println("Invalid column "+col);
        }
    }

    public void read(String[][] arr,int row){
        if(row<arr.length&&row>=0){
            System.out.println(Arrays.toString(arr[row]));
        }
        else{
            System.out.println("Invalid row "+row);
        }
    }

    public void read(String[][] arr,int row,int col){
        if(row<arr.length&&row>=0){
            if(col<arr[row].length&&col>=0){
                System.out.println(arr[row][col]);
            }
            else{
                System.out.println("Invalid column "+col);
            }
        }
        else{
            System.out.println("Invalid row "+row);
        }
    }

    public static void main(String[] args) {
        String[][] myTeam={
                {"Razak Mohamed","Rasheedha","Rajiya"},
                {"Sabarinathan","Meena","Vedhanjana"},
                {"Sheik","Shaheera","Toufik"}
        };

        MultiRead rd=new MultiRead();
        rd.list(myTeam);

        rd.read(myTeam,4,0);
        rd.read(myTeam,2,0);
        rd.read(myTeam,0,3);
        rd.read(myTeam,1,2);

        rd.read(myTeam,2);
        rd.read(myTeam,3);
        rd.read(myTeam,-1);

        rd.read(2,myTeam);
        rd.read(0,myTeam);
    }
}
