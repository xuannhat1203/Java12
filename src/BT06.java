class Employee {
    String name;
    int age;
    double basicSalary;
    public Employee(String name, int age, double basicSalary) {
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }
    public void calculateSalary() {
        this.basicSalary = 0.0;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Basic Salary: " + basicSalary);
    }
}
class FullTimeEmployee extends Employee {
    double bonus;

    public FullTimeEmployee(String name, int age, double basicSalary, double bonus) {
        super(name, age, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        this.basicSalary = getBasicSalary() + bonus;
    }
}
class PartTimeEmployee extends Employee {
    double workHours;

    public PartTimeEmployee(String name, int age, double basicSalary, double workHours) {
        super(name, age, basicSalary);
        this.workHours = workHours;
    }

    @Override
    public void calculateSalary() {
         this.basicSalary = getBasicSalary() * workHours;
    }
}
class Intern extends PartTimeEmployee {
    public Intern(String name, int age, double basicSalary,double workHours) {
        super(name, age, basicSalary, workHours);
    }
}
public class BT06 {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("Dinh Duong", 10, 100,50),
                new PartTimeEmployee("Trung Hieu", 10, 100,50),
                new Intern("Hoang Nam", 10, 100,10),
        };
        for (int i = 0; i < employees.length; i++) {
            employees[i].calculateSalary();
            employees[i].display();
        }
    }
}
