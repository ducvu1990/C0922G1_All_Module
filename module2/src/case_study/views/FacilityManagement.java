package case_study.views;

import java.util.Scanner;

public class FacilityManagement {
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuFuramaOption3() {
        int option3;
        do {
            System.out.println("---MENU Facility Management---\n" +
                    "1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            try {
                option3 = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                throw new NumberFormatException(e.getMessage());
            }
            switch (option3) {
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
