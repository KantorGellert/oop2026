package oop.labor11.exceptions;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > this.balance){
            throw new InsufficientFundsException("Csoro vagy teso");
        }
        this.balance -= amount;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}

