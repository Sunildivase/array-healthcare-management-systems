package arrayhealthcaremanagementsystem.service;

import arrayhealthcaremanagementsystem.model.Department;

import java.util.Scanner;

public class DepartmentService {

    private Department []departments = new Department[5];

    void printDepartment(Department department){

        System.out.println(department);
    }

    public Department createDepartment(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id");
        int deptId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter department name");
        String deptName = scanner.nextLine();

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        Department department = new Department();
        department.setDeptId(deptId);
        department.setDepName(deptName);
        department.setDoctorId(doctorId);
        department.setHospitalId(hospitalId);
        departments[0]=department;
        return department;
    }
}
