package ss3_aray.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuổi vào đây: ");
        String str = String.valueOf(sc.nextLine());
        System.out.println("Nhập ký tự vào đây: ");
        String a = String.valueOf(sc.nextLine());
        int cuont = 0;
        for (int i = 0; i < str.length(); i++) {
            if (a.charAt(0) == str.charAt(i)){
                cuont += 1;
            }
        }
        System.out.println(cuont);
    }
}
