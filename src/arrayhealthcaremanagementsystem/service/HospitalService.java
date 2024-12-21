package arrayhealthcaremanagementsystem.service;

import arrayhealthcaremanagementsystem.model.Hospital;

import java.util.Scanner;

public class HospitalService {

    private Hospital []hospitals = new Hospital[5];

    void printHospital(Hospital hospital){

        System.out.println(hospital);
    }

    public Hospital createHospital(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id");
        int hId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital name");
        String hName = scanner.nextLine();

        System.out.println("please enter hospital address");
        String hAddress = scanner.nextLine();

        System.out.println("please enter contact no");
        String contactNo = scanner.nextLine();

        System.out.println("please enter email id");
        String emailId = scanner.nextLine();

        Hospital hospital = new Hospital();
        hospital.sethId(hId);
        hospital.sethName(hName);
        hospital.sethAddress(hAddress);
        hospital.setContactNo(contactNo);
        hospital.setEmailId(emailId);
        hospitals[0] = hospital;
        return hospital;
    }
}
