package oop.labor12;

public class Main {
    public static void main(String[] args) {

        Student en = new Student(404, "Gellert", "Kantor");
        en.addGrade("Matek",10.0);
        en.addGrade("Roman",7.5);
        en.addGrade("Info",9.05);
        en.addGrade("Magyar",8.8);

        System.out.println(en);

        en.computeAverage();

        System.out.println(en);

        Student Butucska = new Student(1, "Buta", "Bela");
        Butucska.addGrade("Matek",2.71);
        Butucska.addGrade("Roman",5.0);
        Butucska.addGrade("Info",6.1);
        Butucska.addGrade("Magyar",7.1);

        System.out.println(Butucska);

        Butucska.computeAverage();

        System.out.println(Butucska);

        Student Atlgoska = new Student(2, "Atlag", "Joska");
        Atlgoska.addGrade("Matek",5.1);
        Atlgoska.addGrade("Roman",5.6);
        Atlgoska.addGrade("Info",6.1);
        Atlgoska.addGrade("Magyar",5.2);

        System.out.println(Atlgoska);

        Atlgoska.computeAverage();

        System.out.println(Atlgoska);

        Bac bac = new Bac("nevek1.txt");

        System.out.println(bac.numPassed());

        bac.readGrades("matek");
        bac.readGrades("magyar");
        bac.readGrades("roman");

        bac.computeAverage();
        System.out.println(bac.numPassed());



    }
}
