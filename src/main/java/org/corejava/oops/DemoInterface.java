package org.corejava.oops;

//single inheritance
public class DemoInterface implements Zeta {
    public static void main(String[] args) {
        Sigma sig=new Sigma();
        sig.myOrg="Zealous Academy";
        System.out.println(sig.myOrg);
        sig.sayHello();

        // instance can't be created to interface directly
        //Zeta zet=new Zeta();
        DemoInterface demo=new DemoInterface();
        // interface members such as object/variable are final(constant)
        //demo.mySalary=8.9;
        System.out.println(demo.mySalary);
        demo.greetings();
    }

    // overriding happens between two components those involved in inheritance
    // it's mandate when inheriting interface which has abstract method
    // it's not mandate inheriting class
    @Override
    public void greetings() {
        System.out.println("Overridden from ZETA");
    }
}

class Sigma{
    String myOrg;// default initialization null

    // non-abstract method: method with definition/body
    public void sayHello(){
        System.out.println("Hello there!!!!!!!!!!!");
    }
}

interface Zeta{
    double mySalary=5.6;// default initialization not possible

    // abstract method: hiding the logic/ definition of the method
    public void greetings();
}