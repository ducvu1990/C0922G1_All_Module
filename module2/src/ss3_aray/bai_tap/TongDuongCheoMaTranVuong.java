package ss3_aray.bai_tap;

import java.util.Scanner;

public class TongDuongCheoMaTranVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Nhập vào độ rộng của ma trận vuông: ");
        int width = Integer.parseInt(sc.nextLine());

        int[][] array = new int[width][width];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Nhập vào mảng, số thứ [" + i + "][" + j + "]: ");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        for (int i = 0; i < width; i++) {
            for (int j = i; j == i; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("Tổng đường chéo của ma trận là: " + sum);
    }
}
