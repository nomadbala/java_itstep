package Wildcard;

public class Director extends Employee {
    int numberOfEmployees;

    public Director(String name, double salary, int numberOfEmployees) {
        super(name, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Director(String name, int age, double salary, int numberOfEmployees) {
        super(name, age, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Director() {
    }

    public void delegate() {
        System.out.println("Director is delegating his work");
    }

    @Override
    public void walk() {
        System.out.println("Director is walking");
    }
}
