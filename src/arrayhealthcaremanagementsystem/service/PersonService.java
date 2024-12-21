package arrayhealthcaremanagementsystem.service;

import arrayhealthcaremanagementsystem.model.Person;

import java.util.Scanner;

public class PersonService {

private Person []persons = new Person[5];

   void printPerson(Person person){

       System.out.println(person);
   }

   public Person createPerson(){
       Scanner scanner = new Scanner(System.in);

       System.out.println("please enter id");
       int id = Integer.parseInt(scanner.nextLine());

       System.out.println("please enter first name");
       String fName = scanner.nextLine();

       System.out.println("please enter last name");
       String lName = scanner.nextLine();

       System.out.println("please enter age");
       int age = Integer.parseInt(scanner.nextLine());

       System.out.println("please enter gender");
       String gender = scanner.nextLine();

       System.out.println("please enter mobile");
       String mobile = scanner.nextLine();

       System.out.println("please enter alternate mobile");
       String alternateMobile = scanner.nextLine();

       System.out.println("please enter address");
       String address = scanner.nextLine();

       Person person = new Person();
       person.setId(id);
       person.setfName(fName);
       person.setlName(lName);
       person.setAge(age);
       person.setGender(gender);
       person.setMobile(mobile);
       person.setAlternateMobile(alternateMobile);
       person.setAddress(address);
       persons[0]=person;
       return person;
   }
}
