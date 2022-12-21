package org.corejava.oops;

import lombok.Data;

import java.util.Arrays;

// single inheritance
public class DemoInheritance extends Manchester {
    public void list(){
        for(double tmp:getArr()){
            System.out.println(tmp);
        }
    }
    public static void main(String[] args) {
        //Manchester man=new Manchester();
        DemoInheritance man=new DemoInheritance();
        //System.out.println(Arrays.toString(man.arr));
        System.out.println(man.getArr().length);
        man.list();
    }
}


@Data
class Manchester{
    private double[] arr={8.9,12.4,0.87,4.1,3.1,45.8};
}