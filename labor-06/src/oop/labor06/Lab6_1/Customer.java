package oop.labor06.Lab6_1;
import java.util.ArrayList;

public class Customer {

    private String firstName;
    private  String lastName;
    ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {

        String result = this.firstName + " " + this.lastName + " accounts: " + "\n";
        for(int i=0; i < accounts.size(); i++){
            result += " " + this.accounts.get(i).getAccountNumber() + "\n";
        }

        return result;
    }

    public String getAccount(String accountNumber) {
        for(int i=0; i < accounts.size(); i++){
            if(accounts.get(i).getAccountNumber().equals(accountNumber)) return accounts.get(i).toString();
        }

        return null;
    }
/*
    public void addAccount(BankAccount account) {
        if(numAccounts<MAX_ACCOUNTS) this.accounts[numAccounts] = account;
        numAccounts++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumAccounts() {
        return numAccounts;
    }*/
}
