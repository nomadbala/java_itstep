package polimorphism;

public class Animal {
    public void makeSound() {
        System.out.println("Animal`s making sound");
    }

    public void makeSoundAnyAnimal(Object... objects) {
        for (Object obj : objects) {
            if (obj instanceof Animal) {
                Animal animal = (Animal)obj;
                animal.makeSound();
            }
        }
    }

    @Override
    public String toString() {
        return "I am animal";
    }
}
