package felveteli;

import java.util.ArrayList;

public class Informatika {

    private ArrayList<Diak> felvetelizok = new ArrayList<>();

    public Informatika() {
    }

    public void ujBeiratkozo(Diak tmp){
        felvetelizok.add(tmp);
    }

    public int felvetelizokSzama(){

        return felvetelizok.size();
    }

    public double felvetelizokAtlaga(){
        double sum = 0;
        for(Diak v: felvetelizok){
            sum += v.atlag();
        }

        if(sum == 0) return 0;
        return sum/felvetelizok.size();
    }

    public void listazOsszes(){
        for(Diak v: felvetelizok){
            System.out.println(v.getVnev() + " " + v.getKnev() + " " + v.atlag());
        }
    }

    public void listazAtlag(double atlag){
        for(Diak v: felvetelizok){
            if(v.atlag()>=atlag){
                System.out.println(v.getVnev() + " " + v.getKnev() + " " + v.atlag());
            }
        }
    }
}
