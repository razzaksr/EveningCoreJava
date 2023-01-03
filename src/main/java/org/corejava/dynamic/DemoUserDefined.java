package org.corejava.dynamic;

import lombok.Data;

import java.util.TreeSet;
import java.util.Vector;

public class DemoUserDefined {
    public static void main(String[] args) {
        HiFi h1=new HiFi();h1.exp=9;h1.name="Maheshwaran";h1.salary=8.9;
        HiFi h2=new HiFi();h2.exp=14;h2.name="Aasai";h2.salary=9.1;
        HiFi h3=new HiFi();h3.exp=10;h3.name="Razak";h3.salary=9.2;
        HiFi h4=new HiFi();h4.exp=3;h4.name="Manoj";h4.salary=2.5;
        Vector<HiFi> vector=new Vector<>();
        vector.add(h1);vector.add(h2);vector.add(h3);vector.add(h4);
        System.out.println(vector);

        TreeSet<HiFi> treeSet=new TreeSet<>();
        treeSet.addAll(vector);

        System.out.println(treeSet);
    }
}

@Data
class HiFi implements Comparable<HiFi>{
    String name;
    Integer exp;
    Double salary;

    @Override
    public int compareTo(HiFi o) {
        //return this.salary.compareTo(o.salary);// ascending
        return o.exp.compareTo(this.exp);
    }
}