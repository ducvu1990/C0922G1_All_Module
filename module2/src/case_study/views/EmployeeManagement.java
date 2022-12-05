package case_study.views;

import java.util.Scanner;

public class EmployeeManagement {
    private static final Scanner scanner = new Scanner(System.in);

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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Số nhập không hợp lệ.");
                    break;
            }
        } while (true);
    }
}
