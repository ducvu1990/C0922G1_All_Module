package case_study.views;

import case_study.controllers.EmployeeController;
import case_study.models.Person.Employee;
import case_study.utils.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String DATE_OF_BIRTH = "^([0-2][0-9]|3[0-1])/(0[0-9]|1[0-2])/[0-9]{4}$";
    private static final EmployeeController employeeController = new EmployeeController();

    public static void menuFuramaOption1() {
        int option1;
        do {
            System.out.println("---MENU Employee Management---\n" +
                    "1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tDelete employee\n" +
                    "4\tEdit employee\n" +
                    "5\tReturn main menu\n");
            try {
                option1 = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                throw new NumberFormatException(e.getMessage());
            }
            switch (option1) {
                case 1:
                    System.out.println(employeeController.displays());
                    break;
                case 2:
                    System.out.println("Enter code.");
                    int codeAdd = Integer.parseInt(scanner.nextLine());
                    if (employeeController.checkIdEmployee(codeAdd)){
                        System.out.println("Code already exists.");
                    }else {
                        System.out.println("Enter name.");
                        String nameAdd = scanner.nextLine();

                        System.out.println("Enter date of birth.");
                        String dateOfBirthAdd;
                        do {
                            dateOfBirthAdd = scanner.nextLine();
                            if (Validate.validate(DATE_OF_BIRTH, dateOfBirthAdd)){
                                break;
                            }else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        }while (true);

                        System.out.println("Enter sex.");
                        String sexAdd = scanner.nextLine();

                        System.out.println("Enter id number.");
                        String idNumberAdd = scanner.nextLine();

                        System.out.println("Enter phone number.");
                        String phoneNumberAdd = scanner.nextLine();

                        System.out.println("Enter email.");
                        String emailAdd = scanner.nextLine();

                        System.out.println("Enter level.");
                        String levelAdd = scanner.nextLine();

                        System.out.println("Enter location.");
                        String locationAdd = scanner.nextLine();

                        System.out.println("Enter wage.");
                        String wageAdd = scanner.nextLine();

                        Employee employee = new Employee(codeAdd,nameAdd,dateOfBirthAdd,sexAdd,idNumberAdd,phoneNumberAdd,
                                emailAdd,levelAdd,locationAdd,wageAdd);
                        employeeController.addEmployee(employee);
                    }
                    break;
                case 3:
                    System.out.println("Enter id deleter.");
                    int idDeleter = Integer.parseInt(scanner.nextLine());
                    employeeController.deleteEmployee(idDeleter);
                    break;
                case 4:
                    List<Employee> employeeList = new ArrayList<>();
                    employeeList = employeeController.displays();
                    System.out.println("Enter code.");
                    int codeEdit = Integer.parseInt(scanner.nextLine());
                    if (employeeController.checkIdEmployee(codeEdit)){
                        System.out.println("Enter name.");
                        String nameEdit = scanner.nextLine();
                        if (Objects.equals(nameEdit, "")){
                            for (Employee item: employeeList) {
                                if (codeEdit == item.getCode()){
                                    nameEdit = item.getName();
                                }
                            }
                        }
                        System.out.println("Enter date of birth.");
                        String dateOfBirthEdit;
                        do {
                            dateOfBirthEdit = scanner.nextLine();
                            if (Validate.validate(DATE_OF_BIRTH, dateOfBirthEdit)){
                                break;
                            }else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        }while (true);
                        System.out.println("Enter sex.");
                        String sexEdit = scanner.nextLine();
                        if (Objects.equals(sexEdit, "")){
                            for (Employee item: employeeList) {
                                if (codeEdit == item.getCode()){
                                    sexEdit = item.getSex();
                                }
                            }
                        }
                        System.out.println("Enter id number.");
                        String idNumberEdit = scanner.nextLine();
                        if (Objects.equals(idNumberEdit, "")){
                            for (Employee item: employeeList) {
                                if (codeEdit == item.getCode()){
                                    idNumberEdit = item.getIdNumber();
                                }
                            }
                        }
                        System.out.println("Enter phone number.");
                        String phoneNumberEdit = scanner.nextLine();
                        if (Objects.equals(phoneNumberEdit, "")){
                            for (Employee item: employeeList) {
                                if (codeEdit == item.getCode()){
                                    phoneNumberEdit = item.getPhoneNumber();
                                }
                            }
                        }
                        System.out.println("Enter email.");
                        String emailEdit = scanner.nextLine();
                        if (Objects.equals(emailEdit, "")){
                            for (Employee item: employeeList) {
                                if (codeEdit == item.getCode()){
                                    emailEdit = item.getEmail();
                                }
                            }
                        }
                        System.out.println("Enter level.");
                        String levelEdit = scanner.nextLine();
                        if (Objects.equals(levelEdit, "")){
                            for (Employee item: employeeList) {
                                if (codeEdit == item.getCode()){
                                    levelEdit = item.getLevel();
                                }
                            }
                        }
                        System.out.println("Enter location.");
                        String locationEdit = scanner.nextLine();
                        if (Objects.equals(locationEdit, "")){
                            for (Employee item: employeeList) {
                                if (codeEdit == item.getCode()){
                                    locationEdit = item.getLocation();
                                }
                            }
                        }
                        System.out.println("Enter wage.");
                        String wageEdit = scanner.nextLine();
                        if (Objects.equals(wageEdit, "")){
                            for (Employee item: employeeList) {
                                if (codeEdit == item.getCode()){
                                    wageEdit = item.getWage();
                                }
                            }
                        }
                        Employee employeeEdit = new Employee(codeEdit,nameEdit,dateOfBirthEdit,sexEdit,idNumberEdit,phoneNumberEdit,
                                emailEdit,levelEdit,locationEdit,wageEdit);
                        employeeController.editEmployee(codeEdit, employeeEdit);
                    }else {
                        System.err.println("Code does not exist.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid number entered.");
                    break;
            }
        } while (true);
    }
}
