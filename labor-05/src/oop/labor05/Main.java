package oop.labor05;

import oop.labor05.model.Course;
import oop.labor05.model.MyDate;
import oop.labor05.model.Student;
import oop.labor05.model.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Course> courses = readCourses("courses.csv");

        /*for(Course v: courses){
            System.out.println(v);
        }*/

        ArrayList<Student> students = readStudents("students.csv");

        /*for(Student v: students){
            System.out.println(v);
        }*/

        Training teszt = new Training(new Course("Java Basics","Introduction to Java programming and syntax",24), new MyDate(2022,03,21), new MyDate(2022,03,25), 1000);

        System.out.println(teszt.toString());
    }

    public static ArrayList<Course> readCourses(String fileName) {
        ArrayList<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] items = line.split(",");

                String name = items[0].trim();
                String description = items[1].trim();

                int numHours = Integer.parseInt(items[2].trim());;

                courses.add(new Course(name, description, numHours));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }
    public static ArrayList<Student> readStudents(String fileName) {
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] items = line.split(",");

                String ID = items[0].trim();
                String firstName = items[1].trim();
                String lastName = items[2].trim();;

                students.add(new Student(ID, firstName, lastName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
    public void printToFile(String fileName, ArrayList<Student> students) {
        try (FileWriter writer = new FileWriter(fileName)) {

            for (Student s : students) {
                writer.write(s.getID() + "," +
                        s.getFirstName() + "," +
                        s.getLastName() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
