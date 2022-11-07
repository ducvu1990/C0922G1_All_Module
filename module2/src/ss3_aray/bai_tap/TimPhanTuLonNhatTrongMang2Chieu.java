package ss3_aray.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
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
        int max = array2D[0][0];
        int indexMaxI = 0;
        int indexMaxJ = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max <  array2D[i][j]){
                    max = array2D[i][j];
                    indexMaxI = i;
                    indexMaxJ = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất là: " + max + ". Tại vị trí: [" + indexMaxI + "][" + indexMaxJ + "]");
    }
}
