public class Microwave extends Device {
    private String name;

    private String desc;

    public Microwave(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void Sound() {
        System.out.println("Микроволновка издает звук");
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
