package oop.labor12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Bac {

    //Students Map<Integer,Student>
    private Map<Integer,Student> students = new HashMap<>();

    //constructor Bac(String fileName) <- nevek1.txt; treeSet/hashSet
    public Bac (String fileName){

        try (Scanner scanner = new Scanner(new File(fileName));){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                String[] items = line.split(" ");

                int ID = Integer.parseInt(items[0].trim());
                String firstName = items[1].trim();
                String lastName = items[2].trim();

                students.put(ID, new Student(ID, firstName, lastName));
            }
            System.out.println(" Erettsegizok szama: " + students.size());
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    //void readGrades (String fileName) <- roman/magyar/matek .txt
    public void readGrades(String subject){
        try(Scanner scanner = new Scanner(new File(subject + ".txt"))) {
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

                String[] items = line.split(" ");

                double grade = Double.parseDouble(items[1].trim());

                Student student = students.get(Integer.parseInt(items[0].trim()));

                if (student == null){
                    System.out.println("Nincs ilyen diak");
                    continue;
                }
                student.addGrade(subject,grade);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    //void computeAverage()
    public void computeAverage(){

        for(Integer s: students.keySet()){
            students.get(s).computeAverage();
        }
    }

    //int numPassed()
    public int numPassed(){
        int numpassed = 0;

        for(Integer s: students.keySet()){
            if (students.get(s).getAverage() != 0){
                numpassed++;
            }
        }
        /*for (Student s: students.values()){
            if(s.getAverage() > 0) numpassed++;
        }*/

        return numpassed;
    }

}

