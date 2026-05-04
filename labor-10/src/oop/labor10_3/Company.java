package oop.labor10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {

    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee e){
        this.employees.add(e);
    }

    public void hireAll(String fileName){
        for(Employee v: readFromCSVFile(fileName)){
            this.hire(v);
        }
    }

    public void fire(int ID){
        this.employees.remove(ID);
    }

    public void printAll(String fileName){
        /*for(Employee v: this.employees) {
            System.out.println(v);
        }*/

        printToFile(fileName,this.employees);

    }

    public void printManagers(String fileName){
        printToFileManagers(fileName,this.employees);
    }

    public void printEmployees(String fileName){
        printToFileEmployee(fileName,this.employees);
    }

    public void sortByComparator(Comparator<Employee> comp){
        Collections.sort(this.employees,comp);
        printAll("Lab10_out.txt");
    }

    public static ArrayList<Employee> readFromCSVFile(String fileName) {
        ArrayList<Employee> employees = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");

                if(items.length == 4){
                    String firstName= items[0].trim();
                    String lastName= items[1].trim();
                    double salary= Double.parseDouble(items[2].trim());
                    int birthYear = Integer.parseInt(items[3].trim());

                    employees.add(new Employee(firstName,lastName,salary,birthYear));
                }
                else{
                    String firstName= items[0].trim();
                    String lastName= items[1].trim();
                    double salary= Double.parseDouble(items[2].trim());
                    int birthYear = Integer.parseInt(items[3].trim());
                    String department = items[4].trim();

                    employees.add(new Manager(firstName,lastName,salary,birthYear,department));
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public void printToFile(String fileName, ArrayList<Employee> students) {
        try (FileWriter writer = new FileWriter(fileName)) {

            for (Employee s : students) {
                if(s.getClass() == Manager.class)writer.write(s.getID()+ ", " + s.getFirstName() + ", " + s.getLastName() + ", " + s.getSalary() + ", " + s.getBirthYear() + ", " + ((Manager) s).getDepartment() + "\n");
                else writer.write(s.getID()+ ", " + s.getFirstName() + ", " + s.getLastName() + ", " + s.getSalary() + ", " + s.getBirthYear() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printToFileManagers(String fileName, ArrayList<Employee> students) {
        try (FileWriter writer = new FileWriter(fileName)) {

            for (Employee s : students) {
                if(s.getClass() == Manager.class)writer.write(s.getID()+ ", " + s.getFirstName() + ", " + s.getLastName() + ", " + s.getSalary() + ", " + s.getBirthYear() + ", " + ((Manager) s).getDepartment() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printToFileEmployee(String fileName, ArrayList<Employee> students) {
        try (FileWriter writer = new FileWriter(fileName)) {

            for (Employee s : students) {
                if(s.getClass() == Employee.class)writer.write(s.getID()+ ", " + s.getFirstName() + ", " + s.getLastName() + ", " + s.getSalary() + ", " + s.getBirthYear() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
