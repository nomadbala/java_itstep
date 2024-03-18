package polimorphism;

public class Dog extends Animal implements Pet {
    @Override
    public void feed() {
        System.out.println("We feeding dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog`s making sound");
    }
}
