package services;

import java.util.regex.Pattern;

public class Validator {
	// id
	public boolean isValidID(String id, String type) {
		if (id.isEmpty() || id.isBlank()) {
			System.out.println("ID Không được để trống");
			return false;
		} else if (type.equals("patient") && !id.matches("^pa\\d{5}$")) {
			System.out.println("Sai định dạng ID");
			return false;
		} else if (type.equals("doctor") && !id.matches("^do\\d{5}$")) {
			System.out.println("Sai định dạng ID");
			return false;
		}
		return true;

	}

	// name
	public boolean isValidName(String name) {
		if (name.isEmpty() || name.isBlank()) {
			System.out.println("TÊN KHÔNG ĐƯỢC ĐỂ TRỐNG.");
			return false;
		} else if (!name.matches(
				"^[a-zA-Zàáạảãâấầẩẫậăắằẳẵặêếềểễệôốồổỗộơớờởỡợưứừửữự]*(([a-zA-Zàáạảãâấầẩẫậăắằẳẵặêếềểễệôốồổỗộơớờởỡợưứừửữự]*\\s?)*)$")) {
			System.out.println("Tên không hợp lệ!");
			return false;
		}
		return true;
	}

	// age
	public boolean isValidAge(int age) {

		if (!(age > 0 && age <= 120)) {
			System.out.println("Số tuổi không hợp lệ!");
			return false;
		}
		return true;
	}

	// gender
	public boolean isValidGender(String gender) {
		if (gender.isEmpty() || gender.isBlank()) {
			System.out.println("Giới tính không được để trống");
			return false;
		} else if (!(gender.equalsIgnoreCase("nam") || !gender.equalsIgnoreCase("nu")
				|| !gender.equalsIgnoreCase("khac"))) {
			System.out.println("Giới tính không hợp lệ (chỉ nhận Nam, Nữ, Khác)");
			return false;
		}
		return true;
	}

	// address
	public boolean isValidAddress(String address) {
		if (address.isBlank() || address.isEmpty()) {
			System.out.println("Không được để trống địa chỉ ");
			return false;
		}
		return true;
	}

	// phoneNumber
	public boolean isValidPhoneNumber(String phoneNumber) {
		if (phoneNumber.isBlank() || phoneNumber.isEmpty()) {
			System.out.println("Số điện thoại không được để trống");
			return false;
		} else if (!phoneNumber.matches("^(0[35789])\\d{8}$")) {
			System.out.println("Số điện thoại không hợp lệ...");
			return false;
		}
		return true;
	}

	// medicalHistory
	public boolean isValidMedicalHistory(String medicalHistory) {
		if (medicalHistory.isBlank() || medicalHistory.isEmpty()) {
			System.out.println("Không được để trống tiền sử bênh án");
			return false;
		} else if (medicalHistory.length() > 500) {
			System.out.println("Mô tả quá dài");
			return false;
		}
		return true;
	}

	// email
	public boolean isValidEmail(String email) {
		if (email == null || email.isBlank()) {
			System.out.println("Email không được để trống.");
			return false;
		}

		String emailRegex = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";
		if (!Pattern.matches(emailRegex, email)) {
			System.out.println("Email phải có định dạng 'chuỗi'@gmail.com.");
			return false;
		}
		return true;
	}

	// availibility
	public boolean isValidAvailability(String availability) {
		if (availability.isEmpty() || availability.isBlank()) {
			System.out.println("Giờ làm việc không được để trống.");
			return false;
		}

		String pattern = "^\\d{1,2}:\\d{2}-\\d{1,2}:\\d{2}$";
		if (!Pattern.matches(pattern, availability)) {
			System.out.println("Định dạng giờ làm việc không hợp lệ.");
			return false;
		}

		return true;
	}

}
