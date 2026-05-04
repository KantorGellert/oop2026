package oop.labor11.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // System.out.println(readFirstLine("input_lab11.txt"));

        /*
            System.out.println("4/2= " + safeDivide(4,2));
            System.out.println("10/11= " + safeDivide(10,11));
            System.out.println("10/0= " + safeDivide(10,0));
        */

        //demonstrateFinally();

        BankAccount test = new BankAccount(1000);

        System.out.println(test);

        System.out.println("Withdraw 500 penz: ");
        try {
            test.withdraw(500);
        } catch (InsufficientFundsException e) {
            System.out.println("csoro vagy haver");
        }
        System.out.println(test);
        System.out.println("Withdraw osztondij ertek(1000): ");
        try {
            test.withdraw(1000);
        } catch (InsufficientFundsException e) {
            System.out.println("csoro vagy haver");
        }
    }
    public static String readFirstLine(String fileName){
        try {
            Scanner line = new Scanner(new File(fileName));
            return  line.nextLine();
        } catch (FileNotFoundException e) {
            return "FILE_NOT_FOUND";
        }

    }

    public static int safeDivide(int a, int b){
        if(b == 0){
            System.out.println("Nullaval valo osztas");
            return 0;
        }
        else {
            return a/b;
        }
    }

    public static void demonstrateFinally(){
        try {
            System.out.println("OK");
            throw new RuntimeException("Nagyon nem OK");
            //System.out.println("Lorem ipsum");
        }
        catch (RuntimeException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Resource is closed");
        }
    }
}
