package models;

import java.time.LocalDateTime;

public class Apointment {
	private String id;
	private Patient patient;
	private Doctor doctor;
	LocalDateTime time;
	private String status;

	public Apointment(String id, Patient patient, Doctor doctor, LocalDateTime time, String status) {
		super();
		this.id = id;
		this.patient = patient;
		this.doctor = doctor;
		this.time = time;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
