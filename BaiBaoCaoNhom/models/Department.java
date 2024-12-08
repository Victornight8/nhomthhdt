package models;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String departmentID;
	private String name;
	private List<Room> rooms;
	private ArrayList<Doctor> doctors;

	public Department(String departmentID, String name) {
		this.departmentID = departmentID;
		this.name = name;
		this.rooms = new ArrayList<Room>();
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayDepartment() {
		System.out.println("Khoa: " + name);
		if (doctors.isEmpty()) {
			System.out.println("Không có bác sĩ trong khoa này.");
		} else {
			System.out.printf("%-20s %-10s %-15s\n", "Tên bác sĩ", "Chuyên môn", "Số điện thoại");
			for (Doctor doctor : doctors) {
				System.out.printf("%-20s %-10s %-1 5s\n", doctor.getName(), doctor.getSpecialization(),
						doctor.getPhoneNumber());
			}
		}
	}

	public void removeDoctorFromDepartment(Doctor doctor) {
		doctors.remove(doctor);
		System.out.println("Bác sĩ " + doctor.getId() + " đã bị xóa khỏi khoa.");
	}

}
