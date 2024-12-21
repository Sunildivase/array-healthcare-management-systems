package arrayhealthcaremanagementsystem.service;

import arrayhealthcaremanagementsystem.model.Doctor;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DoctorService {

    private Doctor []doctors = new Doctor[5];

    void printDoctor(Doctor doctor){

        System.out.println(doctor);
    }

    public Doctor createDoctor(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter first name");
        String fName = scanner.nextLine();

        System.out.println("please enter last name");
        String lName = scanner.nextLine();

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter contact number");
        String contactNo = scanner.nextLine();

        System.out.println("please enter speciality");
        String speciality = scanner.nextLine();

        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorId);
        doctor.setfName(fName);
        doctor.setlName(lName);
        doctor.setGender(gender);
        doctor.setAge(age);
        doctor.setContactNo(contactNo);
        doctor.setSpeciality(speciality);
        doctors[0]=doctor;
        return doctor;
    }
}
