package oop.labor10;

public class Main {
    public static void main(String[] args) {

        SortingDemo test = new SortingDemo("fruits.txt");

        test.printFruits();
        test.sort();
        test.reversedSort();

        /*for(String v: test.getFruits()){
            System.out.println(v);
        }*/
    }
}
