package org.corejava.oops;

public class DemoMoreCap {
    public static void main(String[] args) {
        Account ac1=new Account();
        ac1.setAccountHolderName("Razak Mohamed S");
        ac1.setAccountNumber(8765676765676L);
        ac1.setAccountBalance(34500.6);

        Account ac2=new Account("Sabarinathan S",1112234934345L,4500.6);
//        ac2.setAccountHolderName("Sabarinathan S");
//        ac2.setAccountNumber(1112234934345L);
//        ac2.setAccountBalance(4500.6);

        //System.out.println(ac1);
        String info=ac1.toString();
        System.out.println(info);
        System.out.println(ac2.getAccountNumber()+" "+ac2.getAccountBalance()+" "+ac2.getAccountHolderName());
    }
}
