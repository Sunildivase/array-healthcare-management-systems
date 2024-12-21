package arrayhealthcaremanagementsystem;

import arrayhealthcaremanagementsystem.service.PersonService;

import java.util.Scanner;

public class HealthcareDemoOverArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HealthcareDemoOverArray healthcareDemoOverArray = new HealthcareDemoOverArray();

        int option=0;
        do{
            System.out.println("---------healthcare management system------------");
            System.out.println("please select the option");
            System.out.println("1.create person");
            System.out.println("2.create doctor");
            System.out.println("3.create hospital");
            System.out.println("4.create department");
            System.out.println("5.create appointment");
            System.out.println("6.create prescription");
            System.out.println("7.create billing");
            option=Integer.parseInt(scanner.nextLine());

            switch (option){

                case 1:
                   healthcareDemoOverArray createPerson = PersonService.createPerson();
                    System.out.println("person created");
                    break;

                case 2:
                    System.out.println("doctor created");
                    break;

                case 3:
                    System.out.println("hospital created");
                    break;

                case 4:
                    System.out.println("department created");
                    break;

                case 5:
                    System.out.println("appointment created");
                    break;

                case 6:
                    System.out.println("prescription created");
                    break;

                case 7:
                    System.out.println("billing created");
                    break;

                default:
                    System.out.println("invalid option please enter valid option");
            }

        }while(option!=0);{
            System.out.println("thank you!!!");
        }





    }
}
