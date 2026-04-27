package oop.labor10_3;

public class Manager extends Employee{

    private String department;

    public Manager(String firstName, String lastName, double salary, int birthYear, String department) {
        super(firstName, lastName, salary, birthYear);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' + super.toString() + "}";
    }
}
