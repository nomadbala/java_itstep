package Wildcard;

public class HrManager extends Employee {
    int numberOfVacancy;

    public HrManager(String name, double salary, int numberOfVacancy) {
        super(name, salary);
        this.numberOfVacancy = numberOfVacancy;
    }

    public HrManager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void walk() {
        System.out.println("Hr manager is walking");
    }
}
