package HealthcareDemo.HealthcareDemo.models;

import java.math.BigInteger;

public class Medication {
    private BigInteger id;
    private String medName;
    private Double medDosage;
    private boolean medControlled;

    public Medication(String medName, Double medDosage, boolean medControlled) {
        this.medName = medName;
        this.medDosage = medDosage;
        this.medControlled = medControlled;
    }

    public BigInteger getId(){
        return this.id;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public Double getMedDosage() {
        return medDosage;
    }

    public void setMedDosage(Double medDosage) {
        this.medDosage = medDosage;
    }

    public boolean isMedControlled() {
        return medControlled;
    }

    public void setMedControlled(boolean medControlled) {
        this.medControlled = medControlled;
    }
}
