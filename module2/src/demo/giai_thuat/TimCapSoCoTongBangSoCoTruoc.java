package demo.giai_thuat;

import java.util.Scanner;

public class TimCapSoCoTongBangSoCoTruoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so vao day");
        int soNhap = Integer.parseInt(sc.nextLine());
        int[] arr = {8, 7, 2, 5, 3, 1};
        System.out.print("Ket qua la: ");
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 6; j++) {
                if (arr[i] + arr[j] == soNhap) {
                    System.out.print("[" + arr[i] +", " + arr[j] + "]");
                }
            }
        }
    }
}
//    Luyện thuật toán
//        Cho 1 mảng số nguyên chưa sắp xếp, hãy tìm các cặp số nguyên trong mảng đó sao cho chúng có tổng bằng 1 số nguyên cho trước
//        ví dụ:
//        Cho mảng arr = [8, 7, 2, 5, 3, 1]
//        Cho x = 10
//        Kết quả là [8, 2], [7, 3]
//        (edited)