interface Gross {
    double calculateGross();
}

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }
}

class Salary extends Employee implements Gross {
    double basicSalary;
    double allowances;

    Salary(String name, int id, double basic, double allow) {
        super(name, id);
        basicSalary = basic;
        allowances = allow;
    }

    public double calculateGross() {
        return basicSalary + allowances;
    }

    void displaySalary() {
        System.out.println("Basic Salary: " + basicSalary + ", Allowances: " + allowances + ", Gross Salary: " + calculateGross());
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Salary emp = new Salary("John Doe", 12345, 50000, 10000);
        emp.displayInfo();
        emp.displaySalary();
    }
}