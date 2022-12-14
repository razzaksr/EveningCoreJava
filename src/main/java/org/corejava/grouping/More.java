package org.corejava.grouping;

/*
Multi dimensional array:
    size of each row has same
    collection of single dimension

    syntax:
        type[][] var/obj={{v1,v2,v3},{v1,v2,v3},{v1,v2,v3}};
        length  >> count of rows    >> 3    >> each row has index which starts with 0
        type[][] var/obj=new type[rowsize][colsize];

        jagged-variant :
            size of each row has difference
            eg:
                type[][] var/obj={{v1,v2},{v1,v2,v3,v4,v5,v6},{v1}};
                    // row >> 1, col >> 1
 */

import java.util.Arrays;

public class More {
    public static void main(String[] args) {
        // multi dimensional
        double[][] chairs={{4.5,9.0},{3.2,13.4},{9.1,3.3},{14.9,0.8}};

        System.out.println(chairs.length);
        // traverse
        for(double[] hai:chairs){
            System.out.println(Arrays.toString(hai));
        }

//        for(double[] hai:chairs){
//            for(double hey:hai){
//                System.out.print(hey+" ");
//            }
//            System.out.println();
//        }

//        for(int row=0;row<chairs.length;row++){
//            System.out.println(Arrays.toString(chairs[row]));
//        }
//        for(int row=0;row<chairs.length;row++){
//            for(int col=0;col<chairs[row].length;col++){
//                System.out.print(chairs[row][col]+" ");
//            }
//            System.out.println();
//        }
    }
}
