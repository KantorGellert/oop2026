package oop.labor10_3;

public class Main {
    public static void  main(String[] args){
        Company company = new Company("Endava");

        company.hireAll("employees.csv");
        company.printAll("Lab10_out.txt");

        Manager Gellert = new Manager("Gellert", "Kantor",999999,2006, "CEO");

        company.hire(Gellert);

        company.printAll("Lab10_out.txt");
        //System.out.println("***********");
        //company.printManagers("Lab10_out.txt");
        //company.printEmployees("Lab10_out.txt");

        //company.fire(1);
        //company.printAll("Lab10_out.txt");

        company.sortByComparator((e1,e2)->{
            if(e1.getClass() == Manager.class && e2.getClass() == Employee.class) return -1;
            else if (e1.getClass() == e2.getClass()) {
                if(e1.getLastName().compareTo(e2.getLastName()) == 0)
                    return e1.getFirstName().compareTo(e2.getFirstName());
                else return e1.getLastName().compareTo(e2.getLastName());
            }
                else return 1;
        });
    }
}
