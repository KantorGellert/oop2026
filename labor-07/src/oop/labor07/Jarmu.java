package oop.labor07;

public class Jarmu {

    private String rendszam;
    private String marka;
    private Boolean kolcsonzott = false;

    public Jarmu(String rendszam, String marka) {
        this.rendszam = rendszam;
        this.marka = marka;
    }

    public String getRendszam() {
        return rendszam;
    }

    public String getMarka() {
        return marka;
    }

    public Boolean getKolcsonzott() {
        return kolcsonzott;
    }

    public void setKolcsonzott(Boolean kolcsonzott) {
        this.kolcsonzott = kolcsonzott;
    }

    @Override
    public String toString() {
        return
                "rendszam='" + rendszam + '\'' +
                ", marka='" + marka + '\'' +
                ", kolcsonzott=" + kolcsonzott;
    }
}
