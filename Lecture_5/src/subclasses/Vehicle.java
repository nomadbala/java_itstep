package subclasses;

import java.util.Objects;

public class Vehicle {
    int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void run() {
        System.out.println("Vehicle is running");
    }

    public static class Wheel {
        double thickness;

        String material;

        public Wheel(double thickness) {
            this.thickness = thickness;
        }

        public String initializeMaterial() {
            Vehicle vehicle = new Vehicle(4);
            return String.valueOf(vehicle.numberOfWheels);
        }
    }

    public class Engine {
        int hp;

        public Engine(int hp) {
            this.hp = hp;
        }

        public void printNumberOfWheels() {
            System.out.println(numberOfWheels);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return numberOfWheels == vehicle.numberOfWheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfWheels);
    }
}
