package oop.labor07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jarmu a = new Auto("MS 50 WRE", "Volvo", 5);
        Jarmu m = new Motorbicikli("HR 23 BTK", "Babetta", "sport");

        JarmuPark jarmuvek = new JarmuPark("Jarmuvek.csv");

        jarmuvek.ujJarmu(a);
        jarmuvek.ujJarmu(m);

        //jarmuvek.listaz();

        System.out.println(jarmuvek.keres("HR 23 BTK"));
        jarmuvek.kolcsonzes("HR 23 BTK");
        System.out.println(jarmuvek.keres("HR 23 BTK"));
        jarmuvek.visszavitel("HR 23 BTK");
        System.out.println(jarmuvek.keres("HR 23 BTK"));
        System.out.println(jarmuvek.AutokSzama());
        System.out.println(jarmuvek.MotorokSzama());
    }

}
