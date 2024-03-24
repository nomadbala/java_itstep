public class Crocodile extends Animal {
    private int teethCount;

    public Crocodile(String name, int teethCount) {
        super(name);
        this.teethCount = teethCount;
    }

    public int getTeethCount() {
        return teethCount;
    }

    public void setTeethCount(int teethCount) {
        this.teethCount = teethCount;
    }

    @Override
    public void eat() {
        System.out.println("Crocodile is eating");
    }
}
