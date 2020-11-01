package HealthcareDemo.HealthcareDemo.models;

import org.springframework.data.annotation.Id;

import java.math.BigInteger;
import java.util.List;

public class Patient {
    @Id
    private BigInteger id;

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private List<Provider> healthProviders;
    private List<Medication> medications;

    public BigInteger getId(){
        return this.id;
    }

    public Patient (String firstName, String lastName, String dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public List<Provider> getHealthProviders(){
        return healthProviders;
    }

    public void addHealthProvider(Provider provider){
        this.healthProviders.add(provider);
    }

    public List<Medication> getMedications(){
        return this.medications;
    }

    public void addMedication(Medication medication){
        this.medications.add(medication);
    }

    public void addMedicationList(List<Medication> medications) { this.medications = medications;}
}
