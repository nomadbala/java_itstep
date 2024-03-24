public class Kettle extends Device {

    private String name;

    private String desc;

    public Kettle(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void Sound() {
        System.out.println("Чайник звук издает");
    }

    @Override
    public void Show() {
        System.out.println(name);
    }

    @Override
    public void Desc() {
        System.out.println(desc);
    }
}
