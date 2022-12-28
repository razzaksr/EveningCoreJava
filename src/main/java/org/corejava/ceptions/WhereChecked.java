package org.corejava.ceptions;

public class WhereChecked extends Magna implements ShowOff{
    public static void main(String[] args) {
        WhereChecked where=new WhereChecked();
        where.dareThere();
        where.enthu();
    }

    public void dareThere(){
        System.out.println("Derived class method execution1");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Derived class method execution2");
    }

    @Override
    public void enthu() {
        System.out.println("method overridden from interface");
    }
}

class Magna{
    public void dareThere(){
        System.out.println("Magna i20");
    }
}
interface ShowOff{
    public void enthu();
}