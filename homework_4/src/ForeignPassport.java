public class ForeignPassport extends Passport {
    private String foreignPassportNumber;

    private String visaNumber;

    private String visaIssueDate;

    public ForeignPassport(String foreignPassportNumber, String visaNumber, String visaIssueDate) {
        this.foreignPassportNumber = foreignPassportNumber;
        this.visaNumber = visaNumber;
        this.visaIssueDate = visaIssueDate;
    }

    public ForeignPassport(String passportNumber, String name, String dateOfBirth, String IIN, int age, String nationality, String gender, String foreignPassportNumber, String visaNumber, String visaIssueDate) {
        super(passportNumber, name, dateOfBirth, IIN, age, nationality, gender);
        this.foreignPassportNumber = foreignPassportNumber;
        this.visaNumber = visaNumber;
        this.visaIssueDate = visaIssueDate;
    }

    public String getForeignPassportNumber() {
        return foreignPassportNumber;
    }

    public void setForeignPassportNumber(String foreignPassportNumber) {
        this.foreignPassportNumber = foreignPassportNumber;
    }

    public String getVisaNumber() {
        return visaNumber;
    }

    public void setVisaNumber(String visaNumber) {
        this.visaNumber = visaNumber;
    }

    public String getVisaIssueDate() {
        return visaIssueDate;
    }

    public void setVisaIssueDate(String visaIssueDate) {
        this.visaIssueDate = visaIssueDate;
    }

    @Override
    public String toString() {
        return "ForeignPassport{" +
                "foreignPassportNumber='" + foreignPassportNumber + '\'' +
                ", visaNumber='" + visaNumber + '\'' +
                ", visaIssueDate='" + visaIssueDate + '\'' +
                '}';
    }
}
