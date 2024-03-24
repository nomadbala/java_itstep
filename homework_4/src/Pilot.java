public class Pilot extends Human {
    private String aircraft;

    public Pilot() {
    }

    public Pilot(String name, int age) {
        super(name, age);
    }

    public Pilot(String aircraft) {
        this.aircraft = aircraft;
    }

    public Pilot(String name, int age, String aircraft) {
        super(name, age);
        this.aircraft = aircraft;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public void fly() {
        System.out.println("Pilot is flying");
    }
}
