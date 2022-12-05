package case_study.views;

import java.util.Scanner;

public class BookingManagement {
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuFuramaOption4() {
        int option4;
        do {
            System.out.println("---MENU Booking Management---\n" +
                    "1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tReturn main menu\n");
            try {
                option4 = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                throw new NumberFormatException(e.getMessage());
            }
            switch (option4) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid number entered.");
                    break;
            }
        } while (true);
    }
}
