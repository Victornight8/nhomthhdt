package models;
import java.util.*;
public class Prescription {
    private String id;
    private String patientId;
    private String doctorId;
    private String medication;
    private String dosage;
    private String instructions;

    public Prescription(String id, String patientId, String doctorId, String medication, String dosage, String instructions) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.medication = medication;
        this.dosage = dosage;
        this.instructions = instructions;
    }



    
    public String getId() {
        return id;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getMedication() {
        return medication;
    }

    public String getDosage() {
        return dosage;
    }

    public String getInstructions() {
        return instructions;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    


    public void displayInfo() {
        System.out.printf("%-10s %-15s %-15s %-20s %-10s %-30s\n", id, patientId, doctorId, medication, dosage, instructions);
    }
        // Phương thức để hiển thị thông tin đơn thuốc

}
