package ss14_sort_algorithms.bai_tap;

import javafx.scene.transform.Scale;

import java.util.Arrays;
import java.util.Scanner;

public class CaiDatThuatToanSapXepChen {
    public static void insertionSort(int[] list){
        int pos, x, size = list.length;
        for (int i = 1; i < size; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]){
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng:");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        System.out.println("Nhập các phẩn tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ [" + i + "]= ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        insertionSort(array);
        System.out.println("Mảng sau khi được sắp xếp là: " + Arrays.toString(array));
    }
}
