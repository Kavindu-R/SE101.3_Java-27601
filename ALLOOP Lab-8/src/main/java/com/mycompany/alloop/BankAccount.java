package com.mycompany.alloop;
abstract class BankAccount {
    private float balance;
    private int accountNo;
    
    public void setBalance(float balance){
       this.balance=balance;
    }
    
    public float getBalance(){
        return balance;
    }
    
    public void setAccountNo(int accountNo){
       this.accountNo=accountNo;
    }
    
    public float getAccountNo(){
        return accountNo;
    }
    
    public abstract void calculateInterest();
        
}

