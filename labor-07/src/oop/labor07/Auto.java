package oop.labor07;

public class Auto extends Jarmu {

    private int utasSzam;

    public Auto(String rendszam, String marka, int utasSzam) {
        super(rendszam, marka);
        this.utasSzam = utasSzam;
    }

    @Override
    public String toString() {
        return
                "Auto " +
                        super.toString() + " " +
                "utasSzam=" + utasSzam + " " +
                        '\'' ;
    }
}
