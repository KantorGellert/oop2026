package oop.labor07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class JarmuPark {

    private ArrayList<Jarmu> jarmuvek;

    public JarmuPark(String fileName) {
        this.jarmuvek = readFromCSVFile(fileName);
    }


    void ujJarmu(Jarmu jarmu){
        jarmuvek.add(jarmu);
    }

    public void listaz(){
        for(Jarmu v: jarmuvek){
            System.out.println(v.toString());
        }
    }

    public Jarmu keres(String rendSzam){

        for(Jarmu v: jarmuvek){
            if(v.getRendszam().equals(rendSzam)) return v;
        }

        return null;
    }

    public void kolcsonzes(String rendszam){
        for(Jarmu v: jarmuvek){
            if(v.getRendszam().equals(rendszam)) v.setKolcsonzott(true);
        }
    }

    public void visszavitel(String rendszam){
        for(Jarmu v: jarmuvek){
            if(v.getRendszam().equals(rendszam)) v.setKolcsonzott(false);
        }
    }

    public int AutokSzama(){
        int db=0;
        for(Jarmu v: jarmuvek){
            if(v.getClass() == Auto.class) db++;
        }

        return db;
    }

    public int MotorokSzama(){
        int db=0;
        for(Jarmu v: jarmuvek){
            if(v.getClass() == Motorbicikli.class) db++;
        }

        return db;
    }

    void listazAutokFile(String fileName){

    }

    public static ArrayList<Jarmu> readFromCSVFile(String fileName) {
        ArrayList<Jarmu> jarmuvek = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");

                String jarmu = items[0].trim();
                String rendSzam = items[1].trim();
                String Marka = items[2].trim();


                if(jarmu.equals("AUTO")){
                    int utasSzam = Integer.parseInt(items[3].trim());
                    jarmuvek.add(new Auto(rendSzam,Marka, utasSzam));
                }
                else if (jarmu.equals("MOTOR")){

                    String tipus = items[3].trim();
                    jarmuvek.add(new Motorbicikli(rendSzam,Marka,tipus));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return jarmuvek;
    }
}
