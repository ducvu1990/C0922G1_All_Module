package ss3_aray.bai_tap;

import java.util.Scanner;

public class TinhTongCacSooCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inRow;
        int sum = 0;
        System.out.println("Nhập vào hàng: ");
        int row = Integer.parseInt(sc.nextLine());

        System.out.println(" Nhập vào cột: ");
        int columns = Integer.parseInt(sc.nextLine());
        int[][] array = new int[row][columns];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập vào mảng, số thứ [" + i + "][" + j + "]: ");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        do {
            System.out.println("Nhập vào cột cần tính tổng." +
                    " Số nhập vào phải lớn hơn 0 và nhỏ hơn " + row + ".");
            inRow = Integer.parseInt(sc.nextLine());
        }while (inRow <= 0 || inRow > row);

        for (int i = 0; i < columns; i++) {
            sum += array[inRow][i];
        }

        System.out.println("Tổng cột " + inRow + "là: " + sum);
    }
}
