package case_study.views;

import java.util.Scanner;

public class MenuFurama {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        int option;
        do {
            System.out.println("-----MENU-----\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            try {
                option = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                throw new NumberFormatException(e.getMessage());
            }
            switch (option) {
                case 1:
                    EmployeeManagement.menuFuramaOption1();
                    break;
                case 2:
                    CustomerManagement.menuFuramaOption2();
                    break;
                case 3:
                    FacilityManagement.menuFuramaOption3();
                    break;
                case 4:
                    BookingManagement.menuFuramaOption4();
                    break;
                case 5:
                    PromotionManagement.menuFuramaOption5();
                    break;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Invalid number entered.");
                    break;
            }
        } while (true);
    }

}
