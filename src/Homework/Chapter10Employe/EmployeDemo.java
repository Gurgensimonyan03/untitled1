package Homework.Chapter10Employe;

import java.util.Scanner;

public class EmployeDemo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        EmployeStorage employeStorage = new EmployeStorage();
        Boolean isrun = true;
        while (isrun) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add Employee");
            System.out.println("please input 2 for print all Employee");
            System.out.println("please input 3 search employee by employee ID");
            System.out.println("please input 4  search employee by company name ");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isrun = false;
                    break;
                case "1":
                    System.out.println("Please input Employee Name");
                    String name = scanner.nextLine();
                    System.out.println("Please input Employee SurName");
                    String surname = scanner.nextLine();
                    System.out.println("Please input EmployeeID ");
                    String employeeid = scanner.nextLine();
                    System.out.println("Please input Employee salary");
                    String salary = scanner.nextLine();
                    System.out.println("Please input Employee company");
                    String company = scanner.nextLine();
                    System.out.println("Please input Employee position");
                    String position = scanner.nextLine();
                    Employe employe = new Employe(name,surname,employeeid,Double.parseDouble(salary),company,position);
                    EmployeStorage.add(employe);
                    System.out.println("Employee is created");
                    break;
                case "2":
                    EmployeStorage.print();
                    break;
                case "3":
                    System.out.println("pleas input Employee ID");
                    String ID = scanner.nextLine();
                    EmployeStorage.searchByID(ID);
                    break;
                case "4":
                    System.out.println("please input company name");
                    String companyname = scanner.nextLine();
                    EmployeStorage.searchByCompany(companyname);
                    break;
                default:
                    System.out.println("please input ");
            }
        }

    }
}