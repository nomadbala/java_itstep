package Wildcard;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee("john", 15000);
        Employee e2 = new Employee("jessica", 35000);
        Director d = new Director("dohn", 150000, 3);
        HrManager h = new HrManager("michael", 16000, 6);

        List list = new ArrayList<>();
        list.add(e);
        list.add(e2);
        list.add(d);
        list.add(h);

        Person p = new Person("max");

        list.add(p);

        PersonUtil putil = new PersonUtil();
        putil.a(list);
    }
}
