import felveteli.Diak;
import felveteli.Informatika;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        /*
        Diak d1 = new Diak("Kantor", "Gellert", 8.83, 10);

        Informatika inf = new Informatika();
        inf.ujBeiratkozo(d1);

        //System.out.println(inf.felvetelizokSzama());
        //System.out.println(inf.felvetelizokAtlaga());
        Diak d2 = new Diak("Lakatos", "Jozsef", 8.12, 7.7);
        inf.ujBeiratkozo(d2);
        inf.listazOsszes();
        inf.listazAtlag(8);
        */

        Diak d1 = new Diak("Mezei","Mária", 7.56, 8.78);
        Diak d2 = new Diak("Asztalos", "Imre", 8.45, 7.25);

        ArrayList<Diak> diaks = readDiaks("input.csv");

        Informatika inf = new Informatika();
        inf.ujBeiratkozo(d1);
        inf.ujBeiratkozo(d2);

        inf.listazOsszes();
        System.out.println("*****************");

        for(Diak v: diaks){
            inf.ujBeiratkozo(v);
        }

        //System.out.println("Osszes:");
        inf.listazOsszes();
        System.out.println("*****************");
        //System.out.println("8-as atlag feletiek: ");
        inf.listazAtlag(8);
        System.out.println("*****************");
        System.out.println("Felvetelizok szana: " + inf.felvetelizokSzama() + ", atlag: " + inf.felvetelizokAtlaga());
    }
    public static ArrayList<Diak> readDiaks(String fileName) {
        ArrayList<Diak> diak = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] items = line.split(" ");

                String Vnev = items[0].trim();
                String Knev = items[1].trim();
                double Erettsegi = Double.parseDouble(items[2].trim());
                double Matemaika = Double.parseDouble(items[3].trim());

                diak.add(new Diak(Vnev,Knev,Erettsegi,Matemaika));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return diak;
    }
}