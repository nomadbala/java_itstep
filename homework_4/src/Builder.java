public class Builder extends Human {
    private String specialization;

    public Builder() {
    }

    public Builder(String name, int age) {
        super(name, age);
    }

    public Builder(String specialization) {
        this.specialization = specialization;
    }

    public Builder(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void build() {
        System.out.println("Builder is building");
    }
}
