import java.util.Arrays;

public class Country {
    private String name;

    private String continentName;

    private int population;

    private String telephoneCountryCode;

    private String capital;

    private String[] cities;

    public Country() {
    }

    public Country(String name, String continentName, int population, String telephoneCountryCode, String capital, String[] cities) {
        this.name = name;
        this.continentName = continentName;
        this.population = population;
        this.telephoneCountryCode = telephoneCountryCode;
        this.capital = capital;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getTelephoneCountryCode() {
        return telephoneCountryCode;
    }

    public void setTelephoneCountryCode(String telephoneCountryCode) {
        this.telephoneCountryCode = telephoneCountryCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continentName='" + continentName + '\'' +
                ", population=" + population +
                ", telephoneCountryCode='" + telephoneCountryCode + '\'' +
                ", capital='" + capital + '\'' +
                ", cities=" + Arrays.toString(cities) +
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
