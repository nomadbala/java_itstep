public class Auto {
    private String name;

    private String manufacturer;

    private String publishingYear;

    private String engineCapacity;

    public Auto() {
    }

    public Auto(String name, String manufacturer, String publishingYear, String engineCapacity) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.publishingYear = publishingYear;
        this.engineCapacity = engineCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                ", engineCapacity='" + engineCapacity + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
