package oop.labor06.Lab6_1;

public class BankAccount {

    private final String AccountNumber;
    private double balance;
    public static final String PREFIX = "OTP";
    private static int numAccounts = 0;
    private static final int ACCOUNT_NUMBER_LENGTH = 10;


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

    private static String createAcc

    public String toString() {
        return "BankAccount{" +
                "AccountNumber='" + AccountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
