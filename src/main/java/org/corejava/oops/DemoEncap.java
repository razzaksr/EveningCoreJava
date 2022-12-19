package org.corejava.oops;

public class DemoEncap {
    public static void main(String[] args) {
        Account ac1=new Account();
        ac1.setAccountNumber(8765456787654L);
        ac1.setAccountBalance(4500.56);
        ac1.setAccountHolderName("Agilan");//ac1.accountBalance=90000.4;
        //ac1.accountNumber=876545678L;ac1.accountHolderName="Agilan";
        //System.out.println(ac1.accountBalance+" "+ac1.accountHolderName+" "+ac1.accountNumber);
        System.out.println(ac1.getAccountHolderName()+" "+ac1.getAccountNumber()+" "+ac1.getAccountBalance());
    }
}
