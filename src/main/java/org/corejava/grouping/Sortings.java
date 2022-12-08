package org.corejava.grouping;

import java.util.Arrays;

public class Sortings {

    // call by passing value/copy >> local var scope
    public void finale(short saySome){
        int hai=90;
        System.out.println(saySome+" from user");
        saySome*=2;
        System.out.println(saySome+" updated @ finale");
    }
    // call by reference/ memory sharing while passing array as a parameter
    public void garage(short[] quit){
        System.out.println(quit[0]+" is value @ 0th index");
        quit[0]=100;
        System.out.println(quit[0]+" is value @ 0th index after the change in garage");
    }

    public void make(short[] sick){
        Arrays.sort(sick);
    }

    public void selection(short[] kepler){
        for(int select=0;select<kepler.length-1;select++){
            for(int comp=select+1;comp<kepler.length;comp++){
                if(kepler[select]<kepler[comp]){
                    //swap
                    kepler[select]^=kepler[comp];
                    kepler[comp]^=kepler[select];
                    kepler[select]^=kepler[comp];
                }
            }
        }
    }

    public static void main(String[] args) {
        short[] pics={89,23,45,67,85,35,5,4,64,5,7,6,2};// 0 - 12
//        System.out.println(Arrays.toString(pics));
//        Arrays.sort(pics);// ascending
//        System.out.println(Arrays.toString(pics));
        Sortings myObj=new Sortings();
        myObj.finale((short)10);
        myObj.finale(pics[5]);
        System.out.println(Arrays.toString(pics));
        myObj.garage(pics);
        System.out.println(Arrays.toString(pics));
        //myObj.make(pics);
        myObj.selection(pics);
        System.out.println(Arrays.toString(pics));
    }
}
