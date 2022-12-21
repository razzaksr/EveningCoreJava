package org.corejava.oops;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String accountHolderName;
    private Long accountNumber;
    private Double accountBalance;

    public String toString(){
        return "Account details "+getAccountHolderName()+"\n"+getAccountNumber()+"\n"+getAccountBalance()+"\n";
    }

//    public Account(){}
//    public Account(String accountHolderName,Long accountNumber,Double accountBalance){
//        this.accountNumber=accountNumber;
//        this.accountHolderName=accountHolderName;
//        this.accountBalance=accountBalance;
//    }

//    // setter
//    public void setAccountHolderName(String accountHolderName){
//        this.accountHolderName=accountHolderName;
//    }
//
//    //getter
//    public String getAccountHolderName(){return accountHolderName;}
}
