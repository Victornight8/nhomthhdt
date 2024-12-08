package models;

import java.util.ArrayList;
import java.util.List;

public class Room {
	private String roomID;
	private String type;
	private String availability;
	private List<Patient> patients;

	public Room(String roomID, String type, String availability) {
		this.roomID = roomID;
		this.type = type;
		this.availability = availability;
		this.patients = new ArrayList<Patient>();
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public String getRoomID() {
		return roomID;
	}

	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

}
