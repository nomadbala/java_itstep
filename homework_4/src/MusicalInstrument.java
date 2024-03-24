public class MusicalInstrument {
    private String name;
    private String description;
    private String history;

    public MusicalInstrument(String name, String description, String history) {
        this.name = name;
        this.description = description;
        this.history = history;
    }

    public void Sound() {
        System.out.println(name + " издает звук");
    }

    public void Show() {
        System.out.println("муз инструмент: " + name);
    }

    public void Desc() {
        System.out.println("аписание: " + description);
    }

    public void History() {
        System.out.println("истори: " + history);
    }
}
