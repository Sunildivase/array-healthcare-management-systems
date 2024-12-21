package arrayhealthcaremanagementsystem.service;

import arrayhealthcaremanagementsystem.model.Prescription;

import java.util.Scanner;

public class PrescriptionService {

    private Prescription []prescriptions = new Prescription[5];

    void printPrescription(Prescription prescription){

        System.out.println(prescription);
    }

    public Prescription createPrescription(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id");
        int pId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter patient id");
        int patientId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter prescription detail");
        String prescriptionDetail = scanner.nextLine();

        Prescription prescription = new Prescription();
        prescription.setpId(pId);
        prescription.setPatientId(patientId);
        prescription.setPrescriptionDetail(prescriptionDetail);
        prescriptions[0] = prescription;
        return prescription;
    }
}

