package ss3_aray.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        System.out.println("Nhập số hàng");
        Scanner sc = new Scanner(System.in);
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột");
        int column = Integer.parseInt(sc.nextLine());
        int[][] array2D = new int[row][column];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Nhập giá trị array2D[" + i + "][" + j + "]: ");
                array2D[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int min = array2D[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (min >  array2D[i][j]){
                    min = array2D[i][j];
                }
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
