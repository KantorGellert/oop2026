package oop.labor10_3;

public class Employee {
    private final int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private int birthYear;
    private static int counter;

    public Employee(String firstName, String lastName, double salary, int birthYear) {
        this.ID = this.counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthYear = birthYear;
        this.counter++;
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

    public double getSalary() {
        return salary;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthYear=" + birthYear +
                '}';
    }
}
