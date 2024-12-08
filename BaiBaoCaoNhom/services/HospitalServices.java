/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author DELL
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import models.Department;
import models.Doctor;
import models.Patient;
import models.Prescription;


public class HospitalService {
	Scanner sc = new Scanner(System.in);
	ArrayList<Patient> Patients = new ArrayList<>();
	ArrayList<Doctor> Doctors = new ArrayList<>();
	ArrayList<Department> Departments = new ArrayList<>();
	Validator validator = new Validator();

	// Thêm người (chung cho bệnh nhân và bác sĩ)
	public void addPerson(String type) {
		// them benh nhan
		if (type.equalsIgnoreCase("patient")) {
			String idPatient = null;
			String namePatient = null;
			int agePatient = 0;
			String genderPatient = null;
			String addressPatient = null;
			String phoneNumberPatient = null;
			String medicalHistory = null;

			// Nhập ID
			while (true) {
				try {
					System.out.println("Nhập ID (ví dụ: pa12345): ");
					idPatient = sc.nextLine();
					if (!validator.isValidID(idPatient, "patient")) {
						System.out.println("Vui lòng nhập lại ID");
						continue;
					} else {
						System.out.println("Nhập ID thành công");
						break;
					}

				} catch (Exception e) {
					System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
				}
			}

			// Nhập tên
			while (true) {
				try {
					System.out.println("Nhập tên:  ");
					namePatient = sc.nextLine();
					if (!validator.isValidName(namePatient)) {
						System.out.println("Vui lòng nhập lại tên");
						continue;
					}
					System.out.println("Nhập tên thành công");
					break;
				} catch (Exception e) {
					System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
				}
			}

			// Nhập tuổi
			while (true) {
				try {
					System.out.println("Nhập tuổi:");
					agePatient = Integer.parseInt(sc.nextLine());
					if (!validator.isValidAge(agePatient)) {
						System.out.println("Vui lòng nhập lại tuổi");
						continue;
					}
					System.out.println("Nhập tuổi thành công");
					break;
				} catch (NumberFormatException e) {
					System.out.println("Vui lòng nhập số tuổi hợp lệ");
				}
			}

			// Nhập giới tính
			while (true) {
				try {
					System.out.println("Nhập giới tính (Nam, Nữ, Khác): ");
					genderPatient = sc.nextLine();
					if (!validator.isValidGender(genderPatient)) {
						System.out.println("Vui lòng nhập lại giới tính");
						continue;
					}
					System.out.println("Nhập giới tính thành công");
					break;
				} catch (Exception e) {
					System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
				}
			}

			// Nhập địa chỉ
			while (true) {
				try {
					System.out.println("Nhập địa chỉ: ");
					addressPatient = sc.nextLine();
					if (!validator.isValidAddress(addressPatient)) {
						System.out.println("Vui lòng nhập lại địa chỉ");
						continue;
					}
					System.out.println("Nhập địa chỉ thành công");
					break;
				} catch (Exception e) {
					System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
				}
			}

			// Nhập số điện thoại
			while (true) {
				try {
					System.out.println("Nhập số điện thoại: ");
					phoneNumberPatient = sc.nextLine();
					if (!validator.isValidPhoneNumber(phoneNumberPatient)) {
						System.out.println("Vui lòng nhập lại số điện thoại");
						continue;
					}
					System.out.println("Nhập số điện thoại thành công");
					break;
				} catch (Exception e) {
					System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
				}
			}

			// Nhập tiền sử bệnh án
			while (true) {
				try {
					System.out.println("Nhập tiền sử bệnh án: ");
					medicalHistory = sc.nextLine();
					if (!validator.isValidMedicalHistory(medicalHistory)) {
						System.out.println("Vui lòng nhập lại tiền sử bệnh án");
						continue;
					}
					System.out.println("Nhập tiền sử bệnh án thành công");
					break;
				} catch (Exception e) {
					System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
				}
			}

			// Tạo đối tượng bệnh nhân và thêm vào danh sách
			Patient p = new Patient(idPatient, namePatient, agePatient, genderPatient, addressPatient,
					phoneNumberPatient, medicalHistory);
			Patients.add(p);
			System.out.println("THÊM THÔNG TIN BỆNH NHÂN MỚI THÀNH CÔNG");
		}
		// them bac si
		else if (type.equalsIgnoreCase("doctor")) {
			String doctorID = null;
			String nameDoctor = null;
			int ageDoctor = 0;
			String genderDoctor = null;
			String specialization = null;
			String phoneNumber = null;
			String email = null;
			String availability = null;
			String department = null;
			// nhap id
			while (true) {
				try {
					System.out.println("Nhập ID (ví dụ: do12345): ");
					doctorID = sc.nextLine();
					if (!validator.isValidID(doctorID, "doctor")) {
						System.out.println("Vui lòng nhập lại ID");
						continue;
					} else {
						System.out.println("Nhập ID thành công");
						break;
					}

				} catch (Exception e) {
					System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
				}
			}
			// nhap ten
			while (true) {
				try {
					System.out.println("Nhập tên:  ");
					nameDoctor = sc.nextLine();
					if (!validator.isValidName(nameDoctor)) {
						System.out.println("Vui lòng nhập lại tên");
						continue;
					}
					System.out.println("Nhập tên thành công");
					break;
				} catch (Exception e) {
					System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
				}
			}
			// nhập tuổi
			while (true) {
				try {
					System.out.println("Nhập tuổi: ");
					ageDoctor = sc.nextInt();
					sc.nextLine();
					if (!validator.isValidAge(ageDoctor)) {
						System.out.println("Vui lòng nhập lại tuổi");
						continue;
					}
					System.out.println("Nhập tuổi thành công");
					break;
				} catch (Exception e) {
					System.out.println("Lỗi nhập dữ liệu " + e.getMessage());
				}
			}
			// nhap gioi tinh
			while (true) {
				try {
					System.out.println("Nhập giới tính (Nam, Nữ, Khác): ");
					genderDoctor = sc.nextLine();
					if (!validator.isValidGender(genderDoctor)) {
						System.out.println("Vui lòng nhập lại giới tính");
						continue;
					}
					System.out.println("Nhập giới tính thành công");
					break;
				} catch (Exception e) {
					System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
				}
			}

			// Nhập chuyên môn
			while (true) {
				try {
					System.out.println("Chọn chuyên môn bác sĩ từ danh sách dưới đây:");
					System.out.println("1. Bác sĩ nội khoa tổng quát");
					System.out.println("2. Bác sĩ ngoại khoa");
					System.out.println("3. Bác sĩ nhi khoa");
					System.out.println("4. Bác sĩ sản khoa");
					System.out.println("5. Bác sĩ da liễu");
					System.out.println("6. Bác sĩ thần kinh");
					System.out.print("Nhập số tương ứng (1-6): ");

					int choice = Integer.parseInt(sc.nextLine());

					switch (choice) {
					case 1:
						specialization = "Bác sĩ nội khoa tổng quát";
						break;
					case 2:
						specialization = "Bác sĩ ngoại khoa";
						break;
					case 3:
						specialization = "Bác sĩ nhi khoa";
						break;
					case 4:
						specialization = "Bác sĩ sản khoa";
						break;
					case 5:
						specialization = "Bác sĩ da liễu";
						break;
					case 6:
						specialization = "Bác sĩ thần kinh";
						break;
					default:
						System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập số từ 1 đến 6.");
						continue;
					}

					System.out.println("Bạn đã chọn chuyên môn: " + specialization);
					break;

				} catch (NumberFormatException e) {
					System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
				}
			}
			// nhập sdt
			while (true) {
				try {
					System.out.println("Nhập số điện thoại: ");
					phoneNumber = sc.next();
					sc.nextLine();
					if (!validator.isValidPhoneNumber(phoneNumber)) {
						System.out.println("Vui lòng nhập lại số điện thoại");
						continue;
					}
					System.out.println("Nhập SĐT thành công");
					break;
				} catch (Exception e) {
					System.out.println("1");
				}
			}
			// nhập email
			while (true) {
				try {
					System.out.println("Nhập email: ");
					email = sc.nextLine();
					if (!validator.isValidEmail(email)) {
						System.out.println("Vui lòng nhập lại");
						continue;
					}
					System.out.println("Nhập email thành công");
					break;
				} catch (Exception e) {
					System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
				}
			}
			// nhập giờ làm việc
			while (true) {
				try {
					System.out.print(
							"Nhập giờ làm việc của bác sĩ (ví dụ: 8:00-16:00 hoặc Tất cả các ngày trong tuần): ");
					availability = sc.nextLine();
					if (!validator.isValidAvailability(availability)) {
						System.out.println("Giờ làm việc không hợp lệ. Vui lòng nhập lại.");
						continue;
					}
					System.out.println("Nhập giờ làm việc thành công.");
					break;
				} catch (Exception e) {
					System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
				}
			}
			// Nhập khoa bác sĩ
			while (true) {
				try {
					System.out.println("Chọn khoa bác sĩ từ danh sách dưới đây:");
					System.out.println("1. Khoa nội");
					System.out.println("2. Khoa ngoại");
					System.out.println("3. Khoa nhi");
					System.out.println("4. Khoa sản");
					System.out.println("5. Khoa da liễu");
					System.out.println("6. Khoa thần kinh");
					System.out.print("Nhập số tương ứng (1-6): ");

					int departmentChoice = Integer.parseInt(sc.nextLine());

					switch (departmentChoice) {
					case 1:
						department = "Khoa nội";
						break;
					case 2:
						department = "Khoa ngoại";
						break;
					case 3:
						department = "Khoa nhi";
						break;
					case 4:
						department = "Khoa sản";
						break;
					case 5:
						department = "Khoa da liễu";
						break;
					case 6:
						department = "Khoa thần kinh";
						break;
					default:
						System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập số từ 1 đến 6.");
						continue;
					}

					System.out.println("Bạn đã chọn khoa: " + department);
					break;

				} catch (NumberFormatException e) {
					System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
				}
			}

			Doctor doctor = new Doctor(doctorID, nameDoctor, ageDoctor, genderDoctor, specialization, phoneNumber,
					email, availability, department);
			Doctors.add(doctor);
			System.out.println("Thêm bác sĩ thành công");
		}

	}

	// xóa bệnh nhân khỏi danh sách

	public void removePatient() {
		while (true) {
			System.out.println("Nhập ID bệnh nhân cần xóa: ");
			String id = sc.nextLine();

			if (!validator.isValidID(id, "patient")) {
				System.out.println("ID không hợp lệ! Vui lòng nhập lại.");
				continue;
			}

			boolean found = false;
			for (Patient p : Patients) {
				if (p.getId().equals(id)) {
					found = true;
					Patients.remove(p);
					System.out.println("Xóa thành công bệnh nhân có ID: " + p.getId());
					break;
				}
			}

			if (!found) {
				System.out.println("Không tìm thấy bệnh nhân với ID: " + id);
			}

			System.out.println("Bạn có muốn xóa thêm bệnh nhân không? (y/n): ");
			String choice = sc.nextLine();
			if (!choice.equalsIgnoreCase("y")) {
				break;
			}
		}
	}

	// edit patient
	public void editPatient() {
		System.out.println("Nhập ID bệnh nhân cần chỉnh sửa: ");
		String id = sc.nextLine();
		boolean found = false;

		for (Patient p : Patients) {
			if (p.getId().equals(id)) {
				found = true;
				System.out.println("Thông tin hiện tại của bệnh nhân:");
				System.out.println("1. Tên: " + p.getName());
				System.out.println("2. Tuổi: " + p.getAge());
				System.out.println("3. Giới tính: " + p.getGender());
				System.out.println("4. Địa chỉ: " + p.getAddress());
				System.out.println("5. Số điện thoại: " + p.getPhoneNumber());
				System.out.println("6. Tiền sử bệnh án: " + p.getMedicalHistory());

				while (true) {
					System.out.println("\nChọn thông tin cần chỉnh sửa:");
					System.out.println("1. Tên");
					System.out.println("2. Tuổi");
					System.out.println("3. Giới tính");
					System.out.println("4. Địa chỉ");
					System.out.println("5. Số điện thoại");
					System.out.println("6. Tiền sử bệnh án");
					System.out.println("7. Thoát");
					System.out.print("Nhập lựa chọn: ");

					int choice = Integer.parseInt(sc.nextLine());

					switch (choice) {
					case 1:
						System.out.print("Nhập tên mới: ");
						String newName = sc.nextLine();
						p.setName(newName);
						System.out.println("Tên đã được cập nhật!");
						break;
					case 2:
						try {
							System.out.print("Nhập tuổi mới: ");
							int newAge = Integer.parseInt(sc.nextLine());
							p.setAge(newAge);
							System.out.println("Tuổi đã được cập nhật!");
						} catch (NumberFormatException e) {
							System.out.println("Vui lòng nhập số nguyên hợp lệ.");
						}
						break;
					case 3:
						System.out.print("Nhập giới tính mới (Nam/Nữ/Khác): ");
						String newGender = sc.nextLine();
						p.setGender(newGender);
						System.out.println("Giới tính đã được cập nhật!");
						break;
					case 4:
						System.out.print("Nhập địa chỉ mới: ");
						String newAddress = sc.nextLine();
						p.setAddress(newAddress);
						System.out.println("Địa chỉ đã được cập nhật!");
						break;
					case 5:
						System.out.print("Nhập số điện thoại mới: ");
						String newPhoneNumber = sc.nextLine();
						p.setPhoneNumber(newPhoneNumber);
						System.out.println("Số điện thoại đã được cập nhật!");
						break;
					case 6:
						System.out.print("Nhập tiền sử bệnh án mới: ");
						String newMedicalHistory = sc.nextLine();
						p.setMedicalHistory(newMedicalHistory);
						System.out.println("Tiền sử bệnh án đã được cập nhật!");
						break;
					case 7:
						System.out.println("Thoát chỉnh sửa thông tin.");
						return;
					default:
						System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
					}
				}
			}
		}

		if (!found) {
			System.out.println("Không tìm thấy bệnh nhân có ID: " + id);
		}
	}

	// in danh sach benh nhan
	public void showListPatient() {
		if (Patients.isEmpty()) {
			System.out.println("Danh sách bệnh nhân trống.");
			return;
		}
		System.out.printf("%-15s %-20s %-5s %-10s %-20s %-15s %-30s\n", "PatientID", "Name", "Age", "Gender", "Address",
				"PhoneNumber", "MedicalHistory");
		System.out.println("=".repeat(110));
		for (Patient temp : Patients) {
			temp.displayInfor();
		}
	}

	// khoi tao khoa
	@SuppressWarnings("unused")
	public void initDepartments() {
		Department department1 = new Department("de1", "khoa tổng quát");
		Department department2 = new Department("de2", "Ngoại khoa");
		Department department3 = new Department("de3", "Nhi khoa");
		Department department4 = new Department("de4", "Sản khoa");
		Department department5 = new Department("de5", "Da liễu");
		Department department6 = new Department("de6", "Thần kinh");

		Departments.add(department1);
		Departments.add(department2);
		Departments.add(department3);
		Departments.add(department4);
		Departments.add(department5);
		Departments.add(department6);
	}

	// xoa bac si
	public void removeDoctor() {
		boolean found = false;
		Doctor removeDoctor = null;
		while (true) {
			try {
				System.out.println("Nhập ID bác sĩ cần xóa: ");
				String id = sc.nextLine();
				if (!validator.isValidID(id, "doctor")) {
					System.out.println("Vui lòng nhập lại");
					continue;
				}
				for (Doctor d : Doctors) {
					if (d.getId().equals(id)) {
						Doctors.remove(d);
						System.out.println("Xóa bác sĩ thành công");
						found = true;
						removeDoctor = d;
						break;
					}
				}
				System.out.println("Không tìm thấy bác sĩ với ID " + id);
				System.out.println("Tiếp tục (y/n): ");
				String choose;
				choose = sc.next();
				if (choose.equalsIgnoreCase("n"))
					break;
				else
					continue;
			} catch (Exception e) {
				System.out.println("Lỗi nhập dữ liệu " + e.getMessage());
			}
		}
		// xoa bac si khoi khoa
		if (found == true) {
			for (Department dept : Departments) {
				if (dept.getDoctors().contains(removeDoctor)) {
					dept.removeDoctorFromDepartment(removeDoctor);
				}
			}
		}
	}

	// sua thong tin bac si
	public void editDoctor() {
		System.out.println("Nhập ID bác sĩ cần chỉnh sửa: ");
		String idDoctor = sc.nextLine();
		boolean found = false;

		for (Doctor doctor : Doctors) {
			if (doctor.getId().equals(idDoctor)) {
				found = true;
				System.out.println("Thông tin hiện tại của bệnh nhân:");
				System.out.println("1. Tên: " + doctor.getName());
				System.out.println("2. Tuổi: " + doctor.getAge());
				System.out.println("3. Giới tính: " + doctor.getGender());
				System.out.println("4. Chuyên môn: " + doctor.getSpecialization());
				System.out.println("5. Số điện thoại: " + doctor.getPhoneNumber());
				System.out.println("6. Email: " + doctor.getEmail());
				System.out.println("7. Giờ làm việc: " + doctor.getAvailability());
				System.out.println("8. Khoa: " + doctor.getDepartment());

				while (true) {
					System.out.println("\nChọn thông tin cần chỉnh sửa:");
					System.out.println("1. Tên");
					System.out.println("2. Tuổi");
					System.out.println("3. Giới tinh");
					System.out.println("4. Chuyên môn");
					System.out.println("5. Số điện thoại");
					System.out.println("6. Email");
					System.out.println("7. Giờ làm việc");
					System.out.println("8. Khoa");
					System.out.println("9. Thoát");
					System.out.print("Nhập lựa chọn: ");

					int choice = Integer.parseInt(sc.nextLine());

					switch (choice) {
					case 1:
						while (true) {
							System.out.print("Nhập tên mới: ");
							String newName = sc.nextLine();
							if (!validator.isValidName(newName)) {
								System.out.println("Vui lòng nhập lại");
								continue;
							}
							doctor.setName(newName);
							System.out.println("Tên đã được cập nhật!");
							break;
						}

					case 2:
						try {
							System.out.print("Nhập tuổi mới: ");
							int newAge = Integer.parseInt(sc.nextLine());
							doctor.setAge(newAge);
							System.out.println("Tuổi đã được cập nhật!");
						} catch (NumberFormatException e) {
							System.out.println("Vui lòng nhập số nguyên hợp lệ.");
						}
						break;
					case 3:
						System.out.print("Nhập giới tính mới (Nam/Nữ/Khác): ");
						String newGender = sc.nextLine();
						doctor.setGender(newGender);
						System.out.println("Giới tính đã được cập nhật!");
						break;
					case 4:
						System.out.print("Nhập chuyên môn mới: ");
						String newSpecial = sc.nextLine();
						while (true) {
							try {
								System.out.println("Chọn chuyên môn bác sĩ từ danh sách dưới đây:");
								System.out.println("1. Bác sĩ nội khoa tổng quát");
								System.out.println("2. Bác sĩ ngoại khoa");
								System.out.println("3. Bác sĩ nhi khoa");
								System.out.println("4. Bác sĩ sản khoa");
								System.out.println("5. Bác sĩ da liễu");
								System.out.println("6. Bác sĩ thần kinh");
								System.out.print("Nhập số tương ứng (1-6): ");

								int luaChon = Integer.parseInt(sc.nextLine());

								switch (luaChon) {
								case 1:
									newSpecial = "Bác sĩ nội khoa tổng quát";
									break;
								case 2:
									newSpecial = "Bác sĩ ngoại khoa";
									break;
								case 3:
									newSpecial = "Bác sĩ nhi khoa";
									break;
								case 4:
									newSpecial = "Bác sĩ sản khoa";
									break;
								case 5:
									newSpecial = "Bác sĩ da liễu";
									break;
								case 6:
									newSpecial = "Bác sĩ thần kinh";
									break;
								default:
									System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập số từ 1 đến 6.");
									continue;
								}

								System.out.println("Bạn đã chọn chuyên môn mới: " + newSpecial);
								break;

							} catch (NumberFormatException e) {
								System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
							}
							break;
						}
						break;
					case 5:
						while (true) {
							System.out.println("Nhập số điện thoại mới: ");
							String newPhoneNumb = sc.nextLine();
							if (!validator.isValidPhoneNumber(newPhoneNumb)) {
								System.out.println("Vui lòng nhập lại");
								continue;
							}
							doctor.setPhoneNumber(newPhoneNumb);
							System.out.println("Cập nhật số điện thoại mới thành công");
							break;
						}
					case 6:
						while (true) {
							System.out.println("Nhập email mới: ");
							String newEmail = sc.nextLine();
							if (!validator.isValidEmail(newEmail)) {
								System.out.println("Vui lòng nhập lại");
								continue;
							}
							doctor.setEmail(newEmail);
							System.out.println("Cập nhật email thành công");
							break;
						}
						break;
					case 7:
						while (true) {
							System.out.println("Nhập giờ làm việc mới: ");
							String newAvailibility = sc.nextLine();
							if (!validator.isValidAvailability(idDoctor)) {
								System.out.println("Vui lòng nhập lại");
								continue;
							}
							doctor.setAvailability(newAvailibility);
							System.out.println("Cập nhật giờ làm việc thành công ");
							break;
						}
						break;
					case 8:
						while (true) {
							System.out.println("Nhập khoa của bác sĩ mới: ");
							String department;
							while (true) {
								try {
									System.out.println("Chọn khoa bác sĩ từ danh sách dưới đây:");
									System.out.println("1. Khoa nội");
									System.out.println("2. Khoa ngoại");
									System.out.println("3. Khoa nhi");
									System.out.println("4. Khoa sản");
									System.out.println("5. Khoa da liễu");
									System.out.println("6. Khoa thần kinh");
									System.out.print("Nhập số tương ứng (1-6): ");

									int departmentChoice = Integer.parseInt(sc.nextLine());

									switch (departmentChoice) {
									case 1:
										department = "Khoa nội";
										break;
									case 2:
										department = "Khoa ngoại";
										break;
									case 3:
										department = "Khoa nhi";
										break;
									case 4:
										department = "Khoa sản";
										break;
									case 5:
										department = "Khoa da liễu";
										break;
									case 6:
										department = "Khoa thần kinh";
										break;
									default:
										System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập số từ 1 đến 6.");
										continue;
									}

									System.out.println("Bạn đã chọn khoa: " + department);
									doctor.setDepartment(department);
									break;

								} catch (NumberFormatException e) {
									System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
								}
							}
						}
					case 9:
						System.out.println("Thoát chỉnh sửa thông tin.");
						return;
					default:
						System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
					}
				}
			}
		}
		if (!found)
			System.out.println("Không tìm thấy bác sĩ có id " + idDoctor);

	}

	public void showListDoctor() {
		if (Doctors.isEmpty()) {
			System.out.println("Danh sách bác sĩ trống.");
			return;
		}
		System.out.printf("%-15s %-20s %-5s %-10s %-40s %-15s %-20s %-20s %-20s\n", "ID", "Tên", "Tuổi", "Giới tính",
				"Chuyên môn", "Số điện thoại", "Email", "Giờ làm việc", "Khoa");
		System.out.println("=".repeat(160));
		for (Doctor doctor : Doctors) {
			doctor.displayInfor();
		}

	}
         private List<Prescription> prescriptions = new ArrayList<>();
        // Các danh sách khác như bệnh nhân, bác sĩ

        // Phương thức thêm đơn thuốc
        public void addPrescription() {
            Scanner sc = new Scanner(System.in);
            String id;
            String patientId;
            String doctorId;
            String medication;
            String dosage;
            String instructions;

            // Nhập ID đơn thuốc
            while (true) {
                System.out.print("Nhập ID đơn thuốc: ");
                id = sc.nextLine();
                if (!validator.isValidID(id, "prescription")) { // Giả sử bạn có phương thức xác thực cho ID đơn thuốc
                    System.out.println("ID không hợp lệ. Vui lòng nhập lại.");
                    continue;
                }
                break;
            }

            // Nhập ID bệnh nhân
            while (true) {
                System.out.print("Nhập ID bệnh nhân: ");
                patientId = sc.nextLine();
                if (!validator.isValidID(patientId, "patient")) {
                    System.out.println("ID bệnh nhân không hợp lệ. Vui lòng nhập lại.");
                    continue;
                }
                break;
            }

            // Nhập ID bác sĩ
            while (true) {
                System.out.print("Nhập ID bác sĩ: ");
                doctorId = sc.nextLine();
                if (!validator.isValidID(doctorId, "doctor")) {
                    System.out.println("ID bác sĩ không hợp lệ. Vui lòng nhập lại.");
                    continue;
                }
                break;
            }

            // Nhập thông tin thuốc
            System.out.print("Nhập tên thuốc: ");
            medication = sc.nextLine();

            // Nhập liều lượng
            System.out.print("Nhập liều lượng: ");
            dosage = sc.nextLine();

            // Nhập hướng dẫn sử dụng
            System.out.print("Nhập hướng dẫn sử dụng: ");
            instructions = sc.nextLine();

            // Tạo đối tượng đơn thuốc và thêm vào danh sách
            Prescription prescription = new Prescription(id, patientId, doctorId, medication, dosage, instructions);
            prescriptions.add(prescription);
            System.out.println("Thêm đơn thuốc thành công!");
        }

        // Phương thức xem danh sách đơn thuốc
        public void showListPrescriptions() {
            if (prescriptions.isEmpty()) {
                System.out.println("Danh sách đơn thuốc trống.");
                return;
            }

            // In tiêu đề bảng
            System.out.printf("%-10s %-15s %-15s %-20s %-10s %-30s\n", "ID", "PatientID", "DoctorID", "Medication", "Dosage", "Instructions");
            System.out.println("=".repeat(100));

            // Duyệt và in từng đơn thuốc
            for (Prescription prescription : prescriptions) {
                prescription.displayInfo();
            }

            System.out.println("=".repeat(100));
            System.out.println("Tổng số đơn thuốc: " + prescriptions.size());
        }
      

        public void removePrescription() {
        System.out.print("Nhập ID đơn thuốc cần xóa: ");
        String prescriptionId =sc.nextLine();
            for (int i = 0; i < prescriptions.size(); i++) {
                if (prescriptions.get(i).getId().equals(prescriptionId)) {
                    prescriptions.remove(i);
                    System.out.println("Xóa đơn thuốc thành công!");
                    return;
                }
            }
            System.out.println("Không tìm thấy đơn thuốc với ID: " + prescriptionId);
        }
        public void editPrescription() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập ID đơn thuốc cần chỉnh sửa: ");
            String prescriptionId = sc.nextLine();

            Prescription prescriptionToEdit = null;

            // Tìm đơn thuốc cần chỉnh sửa
            for (Prescription prescription : prescriptions) {
                if (prescription.getId().equals(prescriptionId)) {
                    prescriptionToEdit = prescription;
                    break;
                }
            }

            if (prescriptionToEdit == null) {
                System.out.println("Không tìm thấy đơn thuốc với ID: " + prescriptionId);
                return;
            }

            // Hiển thị thông tin hiện tại
            System.out.println("\n+--------------------------------------------------+");
            System.out.println("|              THÔNG TIN ĐƠN THUỐC                  |");
            System.out.println("+--------------------------------------------------+");
            System.out.printf("| ID: %-44s |\n", prescriptionToEdit.getId());
            System.out.printf("| Bệnh nhân: %-37s |\n", prescriptionToEdit.getPatientId());
            System.out.printf("| Bác sĩ: %-40s |\n", prescriptionToEdit.getDoctorId());
            System.out.printf("| Thuốc: %-41s |\n", prescriptionToEdit.getMedication());
            System.out.println("+--------------------------------------------------+");

            // Sửa thông tin
            System.out.println("Nhập thông tin mới (nhấn Enter để giữ nguyên):");

            System.out.print("Tên thuốc (hiện tại: " + prescriptionToEdit.getMedication()+ "): ");
            String newMedicineName = sc.nextLine();
            if (!newMedicineName.isEmpty()) {
                prescriptionToEdit.setMedication(newMedicineName);
            }

            System.out.print("Liều lượng (hiện tại: " + prescriptionToEdit.getDosage() + "): ");
            String newDosage = sc.nextLine();
            if (!newDosage.isEmpty()) {
                prescriptionToEdit.setDosage(newDosage);
            }

            System.out.print("Hướng dẫn sử dụng (hiện tại: " + prescriptionToEdit.getInstructions() + "): ");
            String newInstructions = sc.nextLine();
            if (!newInstructions.isEmpty()) {
                prescriptionToEdit.setInstructions(newInstructions);
            }

            System.out.println("Đơn thuốc đã được chỉnh sửa thành công!");
        }
}
