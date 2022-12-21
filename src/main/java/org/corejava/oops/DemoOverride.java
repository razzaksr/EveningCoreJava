package org.corejava.oops;

public class DemoOverride extends Sigma{

    public void sayHello(){
        System.out.println("Overridden from Sigma");
        super.sayHello();
    }

    public static void main(String[] args) {
        DemoOverride sig=new DemoOverride();
        sig.myOrg="Zealous Academy";
        System.out.println(sig.myOrg);
        sig.sayHello();
    }
}
