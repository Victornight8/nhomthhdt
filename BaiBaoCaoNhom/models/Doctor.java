package models;

public class Doctor extends Person {
	private String specialization;
	private String phone;
	private String email;
	private String availability;
	private String department;

	public Doctor(String idDoctor, String name, int age, String gender, String specialization, String phone,
			String email, String availability, String department) {
		super(idDoctor, name, age, gender);
		this.specialization = specialization;
		this.phone = phone;
		this.email = email;
		this.availability = availability;
		this.department = department;
	}

	public String getDoctorID() {
		return id;
	}

	public void setDoctorID(String doctorID) {
		this.id = doctorID;
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

	public String getPhoneNumber() {
		return phone;
	}

	public void setPhoneNumber(String phone) {
		this.phone = phone;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public void displayInfor() {
		// Kiểm tra và thay thế null để tránh lỗi khi in ra
		String id = getId() != null ? getId() : "N/A";
		String name = getName() != null ? getName() : "N/A";
		String gender = getGender() != null ? getGender() : "N/A";
		String specialization = getSpecialization() != null ? getSpecialization() : "N/A";
		String phone = getPhone() != null ? getPhone() : "N/A";
		String email = getEmail() != null ? getEmail() : "N/A";
		String availability = getAvailability() != null ? getAvailability() : "N/A";
		String department = getDepartment() != null ? getDepartment() : "N/A";

		// In thông tin
		System.out.printf("%-15s %-20s %-5d %-10s %-40s %-15s %-20s %-20s %-20s\n", id, name, getAge(), gender,
				specialization, phone, email, availability, department);
	}

}
