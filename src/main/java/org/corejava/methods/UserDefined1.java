package org.corejava.methods;

public class UserDefined1 {
    public void cashing(){
        System.out.println("My first user defined method");
    }
    public static void fixing(){
        System.out.println("Fixing the bugs after the each successful production");
    }
    public static void main(String[] args) {
        UserDefined1 obj1=new UserDefined1();
        obj1.cashing();

        UserDefined1.fixing();
    }
}
