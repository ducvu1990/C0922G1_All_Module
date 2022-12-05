package case_study.views;

import case_study.controllers.CustomerController;
import case_study.models.Person.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CustomerController customerController = new CustomerController();
    public static void menuFuramaOption2() {
        int option2;
        do {
            System.out.println("---MENU Customer Management---\n" +
                    "1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            try {
                option2 = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                throw new NumberFormatException(e.getMessage());
            }
            switch (option2) {
                case 1:
                    customerController.displays();
                    break;
                case 2:
                    System.out.println("Enter code.");
                    int codeAdd = Integer.parseInt(scanner.nextLine());
                    if (customerController.checkIdCustomer(codeAdd)){
                        System.out.println("Code already exists.");
                    }else {
                        System.out.println("Enter name.");
                        String nameAdd = scanner.nextLine();
                        System.out.println("Enter date of birth.");
                        String dateOfBirthAdd = scanner.nextLine();
                        System.out.println("Enter sex.");
                        String sexAdd = scanner.nextLine();
                        System.out.println("Enter id number.");
                        String idNumberAdd = scanner.nextLine();
                        System.out.println("Enter phone number.");
                        String phoneNumberAdd = scanner.nextLine();
                        System.out.println("Enter email.");
                        String emailAdd = scanner.nextLine();
                        System.out.println("Enter type of guest.");
                        String typeOfGuestAdd = scanner.nextLine();
                        System.out.println("Enter address.");
                        String addressAdd = scanner.nextLine();
                        Customer customer = new Customer(codeAdd,nameAdd,dateOfBirthAdd,sexAdd,idNumberAdd,phoneNumberAdd,emailAdd,typeOfGuestAdd,addressAdd);
                        customerController.addCustomer(customer);
                    }

                    break;
                case 3:
                    List<Customer> customerList = new LinkedList<>();
                    System.out.println("Enter code.");
                    int codeEdit = Integer.parseInt(scanner.nextLine());
                    if (customerController.checkIdCustomer(codeEdit)){
                        System.out.println("Enter name.");
                        String nameEdit = scanner.nextLine();
                        System.out.println("Enter date of birth.");
                        String dateOfBirthEdit = scanner.nextLine();
                        System.out.println("Enter sex.");
                        String sexEdit = scanner.nextLine();
                        System.out.println("Enter id number.");
                        String idNumberEdit = scanner.nextLine();
                        System.out.println("Enter phone number.");
                        String phoneNumberEdit = scanner.nextLine();
                        System.out.println("Enter email.");
                        String emailEdit = scanner.nextLine();
                        System.out.println("Enter type of guest.");
                        String typeOfGuestEdit = scanner.nextLine();
                        System.out.println("Enter address.");
                        String addressEdit = scanner.nextLine();
                    }else {
                        System.out.println("Code does not exist.");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid number entered.");
                    break;
            }
        } while (true);
    }
}