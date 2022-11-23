package ss14_sort_algorithms.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinhHoaInsertionSort {
    public static void minhHoaInsertionSort(int[] array){
        int pos, x, size = array.length;
        for(int i = 1; i < size; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                System.out.println("Di chuyển " + array[pos - 1] + " tới vị trí " + pos);
                array[pos] = array[pos-1];
                pos--;
            }

            array[pos] = x;
            System.out.println("Chèn " + x + " vào vị trí " + (pos));
            System.out.print("Liệt kê sau lần sắp xếp thứ " + i + ":  ");
            System.out.println(Arrays.toString(array));
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài(size) của mảng: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " giá trị của mảng:");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }

        System.out.print("Mảng bạn nhập vào là: "+ Arrays.toString(list));

        System.out.println("\nBắt đầu xử lý sắp xếp...");
        minhHoaInsertionSort(list);
    }
}
