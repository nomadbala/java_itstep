import org.w3c.dom.ls.LSOutput;

public class Sailor extends Human {
    private String shipName;

    public Sailor() {
    }

    public Sailor(String name, int age) {
        super(name, age);
    }

    public Sailor(String shipName) {
        this.shipName = shipName;
    }

    public Sailor(String name, int age, String shipName) {
        super(name, age);
        this.shipName = shipName;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void sail() {
        System.out.println("Sailor is sailing");
    }
}
