public class City {
    private String name;

    private String regionName;

    private String countryName;

    private int population;

    private String postcode;

    private String telephoneCityCode;

    public City() {
    }

    public City(String name, String regionName, String countryName, int population, String postcode, String telephoneCityCode) {
        this.name = name;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.postcode = postcode;
        this.telephoneCityCode = telephoneCityCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String gettelephoneCityCode() {
        return telephoneCityCode;
    }

    public void settelephoneCityCode(String telephoneCityCode) {
        this.telephoneCityCode = telephoneCityCode;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", regionName='" + regionName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", population=" + population +
                ", postcode='" + postcode + '\'' +
                ", telephoneCityCode='" + telephoneCityCode + '\'' +
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
