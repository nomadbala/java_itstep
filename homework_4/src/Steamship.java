public class Steamship extends Device {
    private String name;

    private String desc;

    public Steamship(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void Sound() {
        System.out.println("Микроволновка издает звук");
    }

    @Override
    public void Desc() {
        System.out.println(desc);
    }

    @Override
    public void Show() {
        System.out.println(name);
    }
}
