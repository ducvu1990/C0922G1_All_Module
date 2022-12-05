package case_study.views;

import java.util.Scanner;

public class CustomerManagement {
    private static final Scanner scanner = new Scanner(System.in);

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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Số nhập không hợp lệ.");
                    break;
            }
        } while (true);
    }
}
