package StorageExcersize;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Storage {
    private ArrayList<Product> storage = new ArrayList<>();

    public Storage(String fileName) {
        storage = readFile(fileName);
        Collections.sort(storage);
    }

    public void printStorage(){
        for(Product p: storage){
            System.out.println(p);
        }
    }

    public int update(String fileName){
        int counter = 0;
        int amount;
        int ID;

        try (Scanner scanner = new Scanner(new File(fileName))){
            Product p = new Product(0,"", 0, 0);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()){
                    continue;
                }

                String[] items = line.split(" ");

                ID = Integer.parseInt(items[0].trim());
                amount = Integer.parseInt(items[1].trim());
                p.setId(ID);
                int position = Collections.binarySearch(storage, p);

                if(position >= 0){
                    storage.get(position).increaseAmount(amount);
                    counter++;
                }

//                for(Product p: storage){
//                    if(ID == p.getId()) {
//                        p.increaseAmount(amount);
//                        counter++;
//                    }
//                }

            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return counter;
    }

    public ArrayList<Product> readFile(String fileName){
        ArrayList<Product> storage = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()){
                    continue;
                }

                String[] items = line.split(" ");

                int ID = Integer.parseInt(items[0].trim());
                String name = items[1].trim();
                int amount = Integer.parseInt(items[2].trim());
                int price = Integer.parseInt(items[3].trim());

                storage.add(new Product(ID,name,amount,price));
            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return storage;
    }
}
