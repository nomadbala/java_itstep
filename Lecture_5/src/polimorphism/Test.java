package polimorphism;

import polimorphism.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //System.out.println(Cat.year); // interface field are static and final
//        Dog dog = new Dog();
//        Tiger tiger  = new Tiger();
//        List<Animal> list = new ArrayList<>();
//        list.add(cat);
//        list.add(tiger);
//
//        for (Animal animal : list) {
//            animal.makeSound();
//        }
//
//        List<Pet> petList = new ArrayList<>();
//        petList.add(cat);
//        petList.add(dog);
//        for (Pet pet : petList) {
//            pet.feed();
//        }

//        cat.run(5);
//        System.out.println();
//        cat.run(5, "km");
        //cat.run(5, "km", "dm", "cm");

        Animal animal = new Dog();
//        animal.makeSound();
//        animal.
        animal.makeSoundAnyAnimal(new ArrayList<>(), new Cat(), new Dog(), new Animal());
    }
}
