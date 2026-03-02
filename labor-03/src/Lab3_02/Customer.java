package Lab3_02;

import Lab3_01.BankAccount;

public class Customer {

    private String firstName;
    private  String lastName;
    public static final int MAX_ACCOUNTS = 10;

    private int numAccounts=0;
    private BankAccount accounts[] = new BankAccount[MAX_ACCOUNTS];

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {

        String result = this.firstName + " " + this.lastName + " accounts: " + "\n";
        for(int i=0; i < numAccounts; i++){
            result += " " + this.accounts[i].getAccountNumber() + "\n";
        }

        return result;
    }

    public String getAccount(String accountNumber) {
        for(int i=0; i < numAccounts; i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)) return accounts[i].toString();
        }

        return null;
    }

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
    }
}
