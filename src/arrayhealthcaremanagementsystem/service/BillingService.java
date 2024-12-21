package arrayhealthcaremanagementsystem.service;

import arrayhealthcaremanagementsystem.model.Billing;

import java.util.Scanner;

public class BillingService {

    private Billing []billings = new Billing[50];

    void printBilling(Billing billing){

        System.out.println(billing);
    }

    public Billing createBilling(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id");
        int bId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter patient id ");
        int patientId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter bill");
        int bill = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter total bill");
        int totalBill = Integer.parseInt(scanner.nextLine());

        Billing billing = new Billing();
        billing.setbId(bId);
        billing.setPatientId(patientId);
        billing.setBill(bill);
        billing.setTotalBill(totalBill);
        billings[0] = billing;
        return billing;
    }
}
