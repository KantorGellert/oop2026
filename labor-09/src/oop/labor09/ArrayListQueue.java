package oop.labor09;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue{

    private ArrayList<Object> items = new ArrayList<>();
    private static int CAPACITY;

    public ArrayListQueue(int capacity) {
        CAPACITY = capacity;
    }

    @Override
    public boolean isEmpty() {
        if(items.size()==0) return true;
        return false;
    }

    @Override
    public boolean isFull() {
        if(items.size()==CAPACITY) return true;
        return false;
    }

    @Override
    public void enQueue(Object obj) {
        if(items.size()==CAPACITY) {
            System.out.println("Megtelt a sor");
            return;
        }
        items.add(obj);

    }

    @Override
    public Object deQueue() {
        if(items.size()==0){
            System.out.println("Ures a sor");
            return null;
        }

        return items.remove(0);
    }

    @Override
    public void printQueue() {
        System.out.println(items);
    }

    /*@Override
    public boolean equals*/
}
