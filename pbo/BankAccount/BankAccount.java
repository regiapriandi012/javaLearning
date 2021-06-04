package com.pbo.BankAccount;

public class BankAccount{
    private double balance;
    private int accountNumber;
    
    public BankAccount(int accountNumber){
        balance = 0;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    
    public double getBalance(){
        return balance;
    }
}