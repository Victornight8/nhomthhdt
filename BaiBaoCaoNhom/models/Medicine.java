package models;

import java.time.LocalDate;

public class Medicine {
	private String MedicineID;
	private String name;
	private String type;
	private LocalDate quantity;
	private LocalDate expiryDate;
	private double price;

	public Medicine(String medicineID, String name, String type, LocalDate quantity, LocalDate expiryDate,
			double price) {
		MedicineID = medicineID;
		this.name = name;
		this.type = type;
		this.quantity = quantity;
		this.expiryDate = expiryDate;
		this.price = price;
	}

	public String getMedicineID() {
		return MedicineID;
	}

	public void setMedicineID(String medicineID) {
		MedicineID = medicineID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getQuantity() {
		return quantity;
	}

	public void setQuantity(LocalDate quantity) {
		this.quantity = quantity;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
