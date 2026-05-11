package oop.labor12;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private int ID;
    private String firstName;
    private  String lastName;
    private Map<String,Double> grades;
    private double average;

    public Student(int ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new HashMap<>();
    }

    public void addGrade (String subject, double grade){
        this.grades.put(subject,grade);
    }
    public double getGrade (String subject){
        Double grade = grades.get(subject);
        if (grade == null){
            throw new RuntimeException("Nem letezo tantargy");
        }
        return grade;
    }
    public void computeAverage (){
        Double avg = 0.0;
        for(String subject: grades.keySet()){
            double grade = grades.get(subject);
            if (grade < 5){
                return;
            }
                avg += grade;
        }
        if(avg / grades.size() < 6) return;

        this.average = avg / grades.size();
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grades=" + grades +
                ", average=" + average +
                '}';
    }
}
