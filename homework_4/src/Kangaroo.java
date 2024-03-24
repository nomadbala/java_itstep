public class Kangaroo extends Animal {
    private double jumpHeight;

    public Kangaroo(String name, double jumpHeight) {
        super(name);
        this.jumpHeight = jumpHeight;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void eat() {
        System.out.println("Kangaroo is eating");
    }
}
