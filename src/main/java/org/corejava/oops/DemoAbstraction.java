package org.corejava.oops;

import lombok.Data;

import java.util.Arrays;

public class DemoAbstraction extends Sportz {
    public static void main(String[] args) {
        DemoAbstraction demo=new DemoAbstraction();
        demo.traverse();
        demo.nonJs();
    }

    @Override
    public void nonJs() {
        for(int pos=0;pos<getStacks().length;pos++){
            if(!getStacks()[pos].endsWith("N")){
                System.out.println(getStacks()[pos]);
            }
        }
    }
}

// hybrid component
@Data
abstract class Sportz{
    private String[] stacks={"MERN","MEAN","LAMP","Java","Python","MEVN"};

    public void traverse(){
        System.out.println(Arrays.toString(stacks));
    }

    public abstract void nonJs();
}