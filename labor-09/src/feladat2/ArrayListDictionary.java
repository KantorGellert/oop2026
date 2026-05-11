package feladat2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements  IDictionary {

    private ArrayList<String> words = new ArrayList<>();

    public ArrayListDictionary() {
        ArrayList<String> tmp = new ArrayList<>();

        tmp = readDictionary(DICTIONARY_FILE);

        for(String s: tmp){
            this.add(s);
        }
    }

    public ArrayList<String> getWords() {
        return words;
    }

    @Override
    public boolean add(String str) {

        if(this.find(str)) {System.out.println("Mar benne van ez a szo");return false;}
        else words.add(str);
        return false;
    }

    @Override
    public boolean find(String str) {

        if(Collections.binarySearch(words,str) >= 0) return true;

        return false;
    }

    @Override
    public int size() {
        int tmp=0;
        for(String s: words) tmp++;
        return tmp;
    }

    public void printArray(){
        for(String s:words){
            System.out.println(s);
        }
    }

    public static ArrayList<String> readDictionary(String fileName) {
        ArrayList<String> dictionary = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] items = line.split("\n");

                String word = items[0].trim();

                dictionary.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dictionary;
    }
}
