package models;

public class Patient extends Person {
	private String address;
	private String phoneNumber;
	private String medicalHistory;

	public Patient(String id, String name, int age, String gender, String address, String phoneNumber,
			String medicalHistory) {
		super(id, name, age, gender);
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.medicalHistory = medicalHistory;
	}

	public String getPatientID() {
		return id;
	}

	public void setPatientID(String patientID) {
		this.id = patientID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	@Override
	public void displayInfor() {
		System.out.printf("%-15s %-20s %-5d %-10s %-20s %-15s %-30s\n", getPatientID(), getName(), getAge(),
				getGender(), getAddress(), getPhoneNumber(), getMedicalHistory());
	}

}
