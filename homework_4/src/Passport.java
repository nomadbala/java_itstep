public class Passport {
    private String passportNumber;

    private String name;

    private String dateOfBirth;

    private String IIN;

    private int age;

    private String nationality;

    private String gender;

    public Passport() {
    }

    public Passport(String passportNumber, String name, String dateOfBirth, String IIN, int age, String nationality, String gender) {
        this.passportNumber = passportNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.IIN = IIN;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIIN() {
        return IIN;
    }

    public void setIIN(String IIN) {
        this.IIN = IIN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber='" + passportNumber + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", IIN='" + IIN + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
