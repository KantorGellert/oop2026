package oop.labor10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortingDemo {

    private ArrayList<String> fruits = new ArrayList<>();

    public SortingDemo(String fileName) {
        this.fruits = readFromCSVFile(fileName);
    }

    public ArrayList<String> getFruits() {
        return fruits;
    }

    public void sort (){
        Collections.sort(this.fruits,(f1,f2)->{
            return f1.compareTo(f2);
        });

        this.printFruits();
    }
    public void reversedSort (){
        Collections.sort(this.fruits,(f1,f2)->{
            return f2.compareTo(f1);
        });

        this.printFruits();

    }

    public void printFruits(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return  fruits + "\n **********************";
    }

    public static ArrayList<String> readFromCSVFile(String fileName) {
        ArrayList<String> fruits = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split("\n");

                String name = items[0].trim();

                fruits.add(name);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fruits;
    }
}


