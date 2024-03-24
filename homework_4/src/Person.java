
public class Person {
    private String fullName;

    private String dateOfBirth;

    private String contactPhoneNumber;

    private String country;

    private String city;

    private String address;

    private static int numberOfPersons;

    public Person() {
    }

    public Person(String fullName, String dateOfBirth, String contactPhoneNumber, String country, String city, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.contactPhoneNumber = contactPhoneNumber;
        this.country = country;
        this.city = city;
        this.address = address;
        numberOfPersons++;
    }

    public static int getNumberOfPersons() {
        return numberOfPersons;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
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
