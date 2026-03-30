package oop.labor05.model;

import java.util.ArrayList;

public class Training {

    private Course course;
    private MyDate startDate;
    private MyDate endDate;
    private double pricePerStudent;
    private ArrayList<Student> enrolledStudnets = new ArrayList<>();

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

    public Course getCourse() {
        return course;
    }

    public void enroll(String ID, String firstName, String lastName){
        this.enrolledStudnets.add(new Student(ID,firstName,lastName));
    }

    @Override
    public String toString(){
        String result = "Training{" + "course=" + course + ", startDate=" + startDate + ", endDate=" + endDate + ", pricePerStudent=" + pricePerStudent;

        for(int i=0; i< enrolledStudnets.size(); i++) {

            result += " " + this.enrolledStudnets.get(i).getID() + " " + this.enrolledStudnets.get(i).getFirstName() + " " + this.enrolledStudnets.get(i).getLastName() + "\n";

        }

        return result;
    }

}
