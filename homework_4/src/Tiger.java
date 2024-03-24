public class Tiger extends Animal {
    private int stripesCount;

    public Tiger(String name, int stripesCount) {
        super(name);
        this.stripesCount = stripesCount;
    }

    public int getStripesCount() {
        return stripesCount;
    }

    public void setStripesCount(int stripesCount) {
        this.stripesCount = stripesCount;
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }
}
