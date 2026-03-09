package oop.labor04.lab4_2;
import oop.labor04.lab4_1.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        /*ArrayList<Customer> customers = readFromCSVFile("lab4_2_input.csv");
        for(Customer c: customers) {
            System.out.println(c);
        }*/

    }
   /* public static ArrayList<Customer> readFromCSVFile(String fileName) {
        ArrayList<Person> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");

                String firstName = items[0].trim();
                String lastName = items[1].trim();

                int birthYear = Integer.parseInt(items[2].trim());
                customers.add(new Customer(firstName, lastName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }*/
}
