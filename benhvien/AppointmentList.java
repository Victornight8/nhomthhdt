package benhvien;

import java.util.ArrayList;
import java.util.List;

public class AppointmentList {
    private List<Appointment> appointments;

    public AppointmentList() {
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public boolean removeAppointment(String idAppointment) {
        return appointments.removeIf(appointment -> appointment.getIdAppointment().equalsIgnoreCase(idAppointment));
    }

    public Appointment findAppointment(String idAppointment) {
        for (Appointment appointment : appointments) {
            if (appointment.getIdAppointment().equalsIgnoreCase(idAppointment)) {
                return appointment;
            }
        }
        return null;
    }

    public void displayAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("Danh sach lich hen trong.");
            return;
        }
        System.out.println("Danh sach lich hen: ");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }
}