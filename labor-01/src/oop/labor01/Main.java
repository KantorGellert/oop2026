package oop.labor02;

import java.util.Random;

public class Main {

        public static void main() {

                BankAccount account1 = new BankAccount("OTP00001");

                System.out.println(account1.getAccountNumber()+": "+account1.getBalance());

                account1.deposit(1000);

                boolean result = account1.withdraw(500);
                if ( !result ){
                        System.out.println("You do not have sufficient funds for this operation!");
                }

                System.out.println(account1.getBalance());

                result = account1.withdraw(1000);
                if(!result)
                        System.out.println("You do not have sufficient funds for this operation!");

                BankAccount account2 = new BankAccount("OTP00002")
        }

        /*
        public static void main() {
                Rectangle rectangle = new Rectangle(100,200);

                System.out.println("hosszusag: "+rectangle.getLenght()+" szelesseg:"+rectangle.getWidth());
                System.out.println("terulet: "+rectangle.area());
                System.out.println("kerulet: "+rectangle.perimeter());
        }
        */
        /*public static void main(){
                Rectangle[] rectangles = new Rectangle[10];

                int sum=0;

                for(int i=0; i<rectangles.length; i++) {
                        Random rand = new Random();
                        double length = 1 + rand.nextInt(10);
                        double width = 1 + rand.nextInt(10);
                        rectangles[i] = new Rectangle(length, width);

                        System.out.println(i+1+". teglalap: "+" hosszusag: "+rectangles[i].getLenght()+" szelesseg: "+rectangles[i].getWidth()+" terulet: "+rectangles[i].area()+" kerulet: "+rectangles[i].perimeter());
                        sum += rectangles[i].area();
                }

                System.out.println("Teglalapok osszterulete: "+sum);


        }
        */

}
