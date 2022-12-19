package org.corejava.grouping;

import java.util.Arrays;

public class MultiSort {

    String[][] myTeam={
            {"Razak Mohamed","Rasheedha","Rajiya"},
            {"Sabarinathan","Meena","Vedhanjana"},
            {"Sheik","Shaheera","Toufik"}
    };

    public void selectMulti(){
        for(int row=0;row<myTeam.length;row++){
            for(int select=0;select<myTeam[row].length-1;select++){
                for(int comp=select+1;comp<myTeam[row].length;comp++){
                    if(myTeam[row][select].compareTo(myTeam[row][comp])>0){
                        //swap
                        String tmp="";
                        tmp=myTeam[row][select];
                        myTeam[row][select]=myTeam[row][comp];
                        myTeam[row][comp]=tmp;
                    }
                }
            }
        }
    }

    public void list(){
        for(String[] row:myTeam){
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        MultiSort multi=new MultiSort();

        multi.list();

        multi.selectMulti();

        multi.list();
    }
}
