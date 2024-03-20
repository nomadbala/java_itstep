package Wildcard;

import java.util.List;

public class PersonUtil<E extends Person> {
    public void a(List<E> workers) {
        for (Person p : workers) {
            p.walk();
            System.out.println(p.name);
        }
    }
}
