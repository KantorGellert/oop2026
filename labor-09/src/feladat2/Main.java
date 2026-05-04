package feladat2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

            IDictionary d = new ArrayListDictionary();

             if(d.find("cat")) System.out.println("Megtalaltad");

             //((ArrayListDictionary) d).printArray();

             System.out.println(d.size());

    }

}
