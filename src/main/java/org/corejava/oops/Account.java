package org.corejava.oops;

import lombok.Data;

@Data
public class Account {
    private String accountHolderName;
    private Long accountNumber;
    private Double accountBalance;

//    // setter
//    public void setAccountHolderName(String accountHolderName){
//        this.accountHolderName=accountHolderName;
//    }
//
//    //getter
//    public String getAccountHolderName(){return accountHolderName;}
}
