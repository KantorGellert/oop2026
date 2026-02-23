package oop.labor02;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String aNumber) {
        accountNumber = aNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public boolean withdraw(int amount){

        if(balance >= amount){
            balance -= amount;
            return true;
        }

        return false;
    }

}

