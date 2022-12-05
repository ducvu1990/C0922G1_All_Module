package case_study.views;

import java.util.Scanner;

public class PromotionManagement {
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuFuramaOption5() {
        int option5;
        do {
            System.out.println("---MENU Promotion Management---\n" +
                    "1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            try {
                option5 = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                throw new NumberFormatException(e.getMessage());
            }
            switch (option5) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Số nhập không hợp lệ.");
                    break;
            }
        } while (true);
    }
}
