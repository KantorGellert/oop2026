package Lab3_01;

public class Main {

        public static void main(){
            /*BankAccount bankAccount = new BankAccount("OTP00001", 0);

            bankAccount.deposit(1000);
            System.out.println(bankAccount.getBalance());
            bankAccount.withdraw(300);
            System.out.println(bankAccount.getBalance());*/


            Customer customer1 = new Customer("Gellert","Kantor");

            BankAccount account1 = new BankAccount("OTP00001",500);

            customer1.setAccount(account1);

            System.out.println(customer1.toString());

            //System.out.println(customer1);
        }
}
