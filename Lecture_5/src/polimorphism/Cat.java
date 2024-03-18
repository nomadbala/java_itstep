package polimorphism;

public class Cat extends Animal implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Cat`s making sound");
    }

    @Override
    public void feed() {
        System.out.println("We feeding cat");
    }

    public void run(int distance) {
        System.out.printf("Cat run %d metres", distance);
    }

    public void run(int distance, String typeOfDistance) {
        System.out.printf("Cat run %d %s", distance, typeOfDistance);
    }

    public void run(int distance, String... typesOfDistance) {
        System.out.printf("Cat runs %d", distance);
        for (String type : typesOfDistance) {
            System.out.println(type);
        }
    }

    @Override
    public String toString() {
        return "I am cat";
    }
}
