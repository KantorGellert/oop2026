package Lab3_02;

import Lab3_01.BankAccount;

public class Main {

    public static void main() {
        Customer customer1 = new Customer("Kantor", "Gellert");

        customer1.addAccount(new BankAccount("BT1", 1000));
        customer1.addAccount(new BankAccount("BT2", 2000));

        customer1.toString();
    }
}
