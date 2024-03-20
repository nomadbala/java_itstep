package Wildcard;

public class Employee extends Person {
    double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public Employee() {
    }

    public void work() {
        System.out.println("Employee is working");
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void walk() {
        System.out.println("Employee is walking");
    }
}
