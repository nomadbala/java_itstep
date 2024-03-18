package generics;

import polimorphism.Pet;

import java.util.List;

public class Helper<E extends Pet> {
    public void doSthWithPets(List<E> list) {
        for (Pet pet : list) {
            pet.feed();
        }
    }

}
