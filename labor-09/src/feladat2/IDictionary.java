package feladat2;

public interface IDictionary {
        final static String DICTIONARY_FILE = "DIC_input.txt";
        boolean add(String str);
        boolean find(String str);
        int size();
}
