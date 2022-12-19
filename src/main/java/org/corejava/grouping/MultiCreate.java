package org.corejava.grouping;

import java.util.Scanner;

public class MultiCreate {

    Scanner scanner=new Scanner(System.in);

    public void insertings(Integer[][] arr){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.println("Enter the experience @ "+row+" column "+col);
                arr[row][col]=scanner.nextInt();
            }
        }
    }

    public void traverse(Object[][] arr){
        for(Object[] row:arr){
            for(Object data:row){
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[][] teamExp=new Integer[4][3];
        Double[][] teamCtc=new Double[3][];

        MultiCreate multi=new MultiCreate();
        multi.insertings(teamExp);

        for(int row=0;row<teamCtc.length;row++){
            System.out.println("Enter the team count @ "+row);
            teamCtc[row]=new Double[multi.scanner.nextInt()];
            for(int col=0;col<teamCtc[row].length;col++){
                System.out.println("Enter the CTC @ "+row+" column "+col);
                teamCtc[row][col]=multi.scanner.nextDouble();
            }
        }

        multi.traverse(teamExp);
        multi.traverse(teamCtc);
    }
}
