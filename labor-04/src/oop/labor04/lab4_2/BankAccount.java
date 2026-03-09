package oop.labor04.lab4_2;

public class BankAccount {

    private String AccountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        AccountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(int osszeg){
        balance -= osszeg;
    }

    public void deposit(int osszeg){
        balance += osszeg;
    }

    public String toString() {
        return "BankAccount{" +
                "AccountNumber='" + AccountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
