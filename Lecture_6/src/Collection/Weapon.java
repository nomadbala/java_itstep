package Collection;

import java.util.Objects;

public class Weapon {
    private String name;
    private int ammo;

    public Weapon(String name, int ammo) {
        this.name = name;
        this.ammo = ammo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapon weapon = (Weapon) o;
        return ammo == weapon.ammo && Objects.equals(name, weapon.name);
    }
}
