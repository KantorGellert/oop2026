package StorageExcersize;

public class Main {
    public static void main(String[] args){
        Storage raktar = new Storage("data1000000.txt");

        //raktar.printStorage();
        System.out.println(raktar.update("update1000.txt"));
        //raktar.printStorage();
    }
}
