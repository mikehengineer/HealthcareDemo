package HealthcareDemo.HealthcareDemo.models;

public class Provider {
    private String docFirstName;
    private String docLastName;
    private String clinic;


    Provider (String docFirstName, String docLastName, String clinic){
        this.docFirstName = docFirstName;
        this.docLastName = docLastName;
        this.clinic = clinic;
    }

    public String getFirstName() {
        return docFirstName;
    }

    public String getLastName() {
        return docLastName;
    }

    public String getClinic() {
        return clinic;
    }

    public void setFirstName(String firstName) {
        this.docFirstName = firstName;
    }

    public void setLastName(String lastName) {
        this.docLastName = lastName;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }
}
