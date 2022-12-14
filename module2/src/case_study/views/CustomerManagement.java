package case_study.views;

import case_study.controllers.CustomerController;
import case_study.models.Person.Customer;
import case_study.utils.Validate;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CustomerManagement {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String DATE_OF_BIRTH = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
            "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?" +
            "(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])" +
            "(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final CustomerController customerController = new CustomerController();

    public static void menuFuramaOption2() {
        int option2 = 0;
        do {
            System.out.println("---MENU Customer Management---\n" +
                    "1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            try {
                option2 = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
            switch (option2) {
                case 1:
                    System.out.println(customerController.displays());
                    break;
                case 2:
                    System.out.println("Enter code.");
                    int codeAdd = Integer.parseInt(scanner.nextLine());
                    if (customerController.checkIdCustomer(codeAdd)) {
                        System.out.println("Code already exists.");
                    } else {
                        System.out.println("Enter name.");
                        String nameAdd = scanner.nextLine();
                        System.out.println("Enter date of birth.");
                        String dateOfBirthAdd;
                        do {
                            dateOfBirthAdd = scanner.nextLine();
                            if (Validate.regexAge(DATE_OF_BIRTH, dateOfBirthAdd)) {
                                break;
                            } else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        } while (true);
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
                        Customer customerAdd = new Customer(codeAdd, nameAdd, dateOfBirthAdd, sexAdd, idNumberAdd,
                                phoneNumberAdd, emailAdd, typeOfGuestAdd, addressAdd);
                        customerController.addCustomer(customerAdd);
                    }

                    break;
                case 3:
                    List<Customer> customerList = new LinkedList<>();
                    customerList = customerController.displays();
                    System.out.println("Enter code.");
                    int codeEdit = Integer.parseInt(scanner.nextLine());
                    if (customerController.checkIdCustomer(codeEdit)) {
                        System.out.println("Enter name.");
                        String nameEdit = scanner.nextLine();
                        if (Objects.equals(nameEdit, "")) {
                            for (Customer item : customerList) {
                                if (codeEdit == item.getCode()) {
                                    nameEdit = item.getName();
                                }
                            }
                        }
                        System.out.println("Enter date of birth.");
                        String dateOfBirthEdit;
                        do {
                            dateOfBirthEdit = scanner.nextLine();
                            if (Validate.regexAge(DATE_OF_BIRTH, dateOfBirthEdit)) {
                                break;
                            } else {
                                System.err.println("Incorrect input, please re-enter.");
                            }
                        } while (true);
                        System.out.println("Enter sex.");
                        String sexEdit = scanner.nextLine();
                        if (Objects.equals(sexEdit, "")) {
                            for (Customer item : customerList) {
                                if (codeEdit == item.getCode()) {
                                    sexEdit = item.getSex();
                                }
                            }
                        }
                        System.out.println("Enter id number.");
                        String idNumberEdit = scanner.nextLine();
                        if (Objects.equals(idNumberEdit, "")) {
                            for (Customer item : customerList) {
                                if (codeEdit == item.getCode()) {
                                    idNumberEdit = item.getIdNumber();
                                }
                            }
                        }
                        System.out.println("Enter phone number.");
                        String phoneNumberEdit = scanner.nextLine();
                        if (Objects.equals(phoneNumberEdit, "")) {
                            for (Customer item : customerList) {
                                if (codeEdit == item.getCode()) {
                                    phoneNumberEdit = item.getPhoneNumber();
                                }
                            }
                        }
                        System.out.println("Enter email.");
                        String emailEdit = scanner.nextLine();
                        if (Objects.equals(emailEdit, "")) {
                            for (Customer item : customerList) {
                                if (codeEdit == item.getCode()) {
                                    emailEdit = item.getEmail();
                                }
                            }
                        }
                        System.out.println("Enter type of guest.");
                        String typeOfGuestEdit = scanner.nextLine();
                        if (Objects.equals(typeOfGuestEdit, "")) {
                            for (Customer item : customerList) {
                                if (codeEdit == item.getCode()) {
                                    typeOfGuestEdit = item.getTypeOfGuest();
                                }
                            }
                        }
                        System.out.println("Enter address.");
                        String addressEdit = scanner.nextLine();
                        if (Objects.equals(addressEdit, "")) {
                            for (Customer item : customerList) {
                                if (codeEdit == item.getCode()) {
                                    addressEdit = item.getAddress();
                                }
                            }
                        }
                        Customer customerEdit = new Customer(codeEdit, nameEdit, dateOfBirthEdit, sexEdit, idNumberEdit,
                                phoneNumberEdit, emailEdit, typeOfGuestEdit, addressEdit);
                        customerController.editCustomer(codeEdit, customerEdit);
                    } else {
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