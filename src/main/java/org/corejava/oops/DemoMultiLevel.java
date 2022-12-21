package org.corejava.oops;

import lombok.Data;

import java.util.Arrays;

public class DemoMultiLevel {
    public static void main(String[] args) {
        Organise org=new Organise();
        System.out.println(org.insert(98.5));
        System.out.println(org.insert(4.5));
        System.out.println(org.insert(3.1));
        System.out.println(org.insert(3.8));
        System.out.println(org.insert(12.5));
        System.out.println(org.insert(7.2));
        System.out.println(org.insert(6.7));
        System.out.println(org.insert(11.4));
        System.out.println(org.insert(4.4));

        org.show();

        System.out.println(org.linear(7.8));
        System.out.println(org.linear(6.7));

        System.out.println(org.linear(3,7,4.5));
        System.out.println(org.linear(5,9,11.4));
        System.out.println(org.linear(5,9,0.0));
    }
}

interface Search{
    public int linear(double users);
    public int linear(int start,int end,double users);
}

interface Manipulate extends Search{
    public void show();
    public String insert(double value);
}

@Data
class Organise implements Manipulate{
    private double[] arr=new double[10];


    @Override
    public void show() {
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public String insert(double value) {
        for(int pos=0;pos<arr.length;pos++){
            if(arr[pos]==0){
                arr[pos]=value;
                return "The value "+value+" has inserted @ "+pos+"\n";
            }
        }
        return "The value "+value+" hasn't inserted anywhere";
    }

    @Override
    public int linear(double users) {
        for(int index=0;index<arr.length;index++){
            if(arr[index]==users)
                return index;
        }
        return -1;
    }

    @Override
    public int linear(int start, int end, double users) {
        for(int index=start;index<end;index++){
            if(arr[index]==users)
                return index;
        }
        return -1;
    }
}