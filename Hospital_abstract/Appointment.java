import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Appointment {
    private String idAppointment; 
    private String idDoctor; 
    private String idPatient; 
    private LocalDateTime appointmentDateTime; 
    private String status; 

    public Appointment(String idAppointment, String idDoctor, String idPatient, LocalDateTime appointmentDateTime) {
        this.idAppointment = idAppointment;
        this.idDoctor = idDoctor;
        this.idPatient = idPatient;
        this.appointmentDateTime = appointmentDateTime;
        this.status = "Chua xac nhan"; 
    }

    public String getIdAppointment() {
        return idAppointment;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public String getIdPatient() {
        return idPatient;
    }

    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Lich hen [ID: " + idAppointment + ", Bac si: " + idDoctor + ", Benh nhan: " + idPatient +
               ", Ngay gio: " + appointmentDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + 
               ", Trang thai: " + status + "]";
    }
}