package generics;


import polimorphism.Animal;
import polimorphism.Cat;
import polimorphism.Dog;
import subclasses.Vehicle;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(1);
//        list.add("Str");
//        list.add(new Vehicle(4));
//        ((Vehicle)list.get(2)).run();

//        List<Number> list = new ArrayList<>();
//        list.add(1);
//        list.add(2.0);

//        List<Animal> listOfAnimals = new ArrayList<>();
//        listOfAnimals.add(new Cat());
//        System.out.println(Helper.doSth(listOfAnimals));
//        List<Vehicle> listOfCars = new ArrayList<>();
//        listOfCars.add(new Vehicle(5));
//        System.out.println(Helper.doSth(listOfCars));

        Helper<Dog> listOfDogs = new Helper<>();

        List<?> list = new ArrayList<>();
        list.add("sfa");
    }
}
