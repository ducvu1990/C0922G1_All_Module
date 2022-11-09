package ss2_loop.bai_tap;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào lựa chon của bạn:\n" +
                "1 -> Vẽ hình vuông.\n" +
                "2 -> Vẽ hình tam giác hướng lên trên.\n" +
                "3 -> Vẽ hình tam giác hướng xuống dưới.");
        int option = Integer.parseInt(sc.nextLine());
        switch (option){
            case 1:
                for (int i = 0; i < 3; i++) {
                    System.out.println(" ");
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 2:
                System.out.println(" ");
                for (int i = 0; i < 5; i++) {
                    System.out.println(" ");
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 3:
                System.out.println(" ");
                for (int i = 0; i < 5; i++) {
                    System.out.println(" ");
                    for (int j = i; j < 5; j++) {
                        System.out.print("*");
                    }
                }
                break;
            default:
                System.out.println("Số bạn nhập không hợp lệ.");
        }
    }
}
