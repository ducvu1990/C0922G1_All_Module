package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThuatToanTimKiemNhiPhanSuDUngDeQuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai mang");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan thu [" + i + "]");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        sapXep(array);
        System.out.println(Arrays.toString(array));
        System.out.println("nhap so can tim: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(binarySearch(array, 0, size - 1, num));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right){
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }else if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            } else {
                return binarySearch(array, left, middle - 1, value);
            }
        }else {
            return -1;
        }
    }

    public static void sapXep(int[] array) {
        int size = array.length;
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
