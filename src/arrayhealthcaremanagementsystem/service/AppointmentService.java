package arrayhealthcaremanagementsystem.service;

import arrayhealthcaremanagementsystem.model.Appointment;

import java.util.Scanner;

public class AppointmentService {

    private Appointment[] appointments = new Appointment[5];

    void printAppointment(Appointment appointment){

        System.out.println(appointment);
    }

    public Appointment createAppointment(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter patient id");
        int patientId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter dept id");
        int deptId = Integer.parseInt(scanner.nextLine());

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setPatientId(patientId);
        appointment.setDoctorId(doctorId);
        appointment.setHospitalId(hospitalId);
        appointment.setDeptId(deptId);
        appointments[0]=appointment;
        return appointment;
    }
}
