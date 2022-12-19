package org.corejava.grouping;

import java.util.Arrays;

public class MultiSearch {

    Character[][] lite={{'E','V','W','B'},{'o','v','q'},{'$','^','&','@','*','!','('}};

    public void traverse(){
        for(Character[] row:lite){
            System.out.println(Arrays.toString(row));
        }
    }

    public void search(Character cha){
        for(int row=0;row<lite.length;row++){
            for(int col=0;col<lite[row].length;col++){
                if(lite[row][col]==cha){
                    System.out.println(cha+" found @ row "+row+" and column "+col);
                    return;
                }
            }
        }
        System.out.println("Invalid character "+cha);
    }

    public static void main(String[] args) {
        MultiSearch multi=new MultiSearch();
        multi.traverse();
        multi.search('R');
        multi.search('*');
        multi.search('S');
        multi.search('A');
        multi.search('v');
        multi.search('&');
    }

}
