package org.corejava.oops;

public class DemoHierarchy {
    public static void main(String[] args) {
        Calculating calc=new Calculating();
        calc.addSome(7);
        System.out.println(calc.display());

        Buffering buff=new Buffering();
        buff.addSome("Hey there!");
        buff.addSome("welcome to zealous");
        buff.addSome(" where you gonna learn full stack");
        System.out.println(buff.display());

    }
}

interface Operate{
    public void addSome(Object obj);
    public Object display();
}

// single
class Calculating implements Operate{
    int facting=1;

    @Override
    public void addSome(Object obj) {
        Integer tmp=(Integer)obj;
        while(tmp>0){
            facting*=tmp;
            tmp--;
        }
    }

    @Override
    public Object display() {
        return facting;
    }
}

// single
class Buffering implements Operate{
    private String house;

    @Override
    public void addSome(Object obj) {
        if(house==null){
            house=(String)obj;
        }
        else{
            house+=(String)obj;
        }
        System.out.println(obj+" added");
    }

    @Override
    public Object display() {
        return house;
    }
}