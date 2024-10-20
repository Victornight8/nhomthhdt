package tuan5;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private String id;
	private String name;
	private double gpa;

	public Student(String id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	public double getGpa() {
		return gpa;
	}

	public String toString() {
		return "Mã SV: " + id + ", Tên: " + name + ", Điểm trung bình: " + gpa;
	}
}

public class bai7 {
	private static ArrayList<Student> students = new ArrayList<>();

	public static void addStudent(Student student) {
		students.add(student);
	}

	public static void removeStudent(String id) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				students.remove(i);
				break;
			}
		}
	}

	public static Student searchStudent(String id) {
		for (Student student : students) {
			if (student.getId().equals(id)) {
				return student;
			}
		}
		return null;
	}

	public static void sortStudentsByGPA() {
		for (int i = 0; i < students.size() - 1; i++) {
			for (int j = i + 1; j < students.size(); j++) {
				if (students.get(i).getGpa() > students.get(j).getGpa()) {
					Student temp = students.get(i);
					students.set(i, students.get(j));
					students.set(j, temp);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Thêm sinh viên
		addStudent(new Student("SV001", "Nguyen Van A", 8.5));
		addStudent(new Student("SV002", "Tran Thi B", 7.2));
		addStudent(new Student("SV003", "Le Van C", 9.1));

		// In danh sách sinh viên
		System.out.println("Danh sách sinh viên:");
		for (Student student : students) {
			System.out.println(student);
		}

		// Xóa sinh viên
		System.out.print("Nhập mã sinh viên cần xóa: ");
		String id = scanner.nextLine();
		removeStudent(id);

		// In lại danh sách sau khi xóa
		System.out.println("Danh sách sinh viên sau khi xóa:");
		for (Student student : students) {
			System.out.println(student);
		}

		// Tìm sinh viên
		System.out.print("Nhập mã sinh viên cần tìm: ");
		id = scanner.nextLine();
		Student foundStudent = searchStudent(id);
		if (foundStudent != null) {
			System.out.println("Sinh viên tìm thấy: " + foundStudent);
		} else {
			System.out.println("Không tìm thấy sinh viên với mã " + id);
		}

		// Sắp xếp sinh viên theo điểm
		sortStudentsByGPA();
		System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm:");
		for (Student student : students) {
			System.out.println(student);
		}

		scanner.close();
	}
}
