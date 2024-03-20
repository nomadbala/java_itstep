package Wildcard;

public class Person {
    String name;
    int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void walk() {
        System.out.println("Person is walking");
    }
}
