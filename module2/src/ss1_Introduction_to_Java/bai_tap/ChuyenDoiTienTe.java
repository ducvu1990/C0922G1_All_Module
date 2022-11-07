package ss1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int exchangeRate = 23000;
        System.out.println("Nhập vào số tiền VND cần chuyển đổi");
        Scanner sc = new Scanner(System.in);
        int vietnameseDong = Integer.parseInt(sc.nextLine());
        int dollars = vietnameseDong * exchangeRate;
        System.out.println(dollars);
    }
}
