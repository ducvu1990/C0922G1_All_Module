package ss14_sort_algorithms.bai_tap;

import java.util.Scanner;

public class MinhHoaInsertionSort {
    public static void minhHoaInsertionSort(int[] array){
        int pos, x, size = array.length;
        for(int i = 1; i < size; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                System.out.println("Dị chuyển " + array[pos - 1] + " tới vị trí " + pos);
                array[pos] = array[pos-1];
                pos--;
            }

            array[pos] = x;
            System.out.println("Chèn " + x + " vào vi tri " + (pos));
            System.out.print("Liệt kê sau lần sắp xếp thú " + i + ":  ");
            for (int j = 0; j < size; j++) {
                System.out.print(array[j] + "\t");
            }

            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài(size) của mảng: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " gí trị của mảng:");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }

        System.out.print("Mảng bạn nhập vào: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBắt đầu xử lý sắp xếp...");
        minhHoaInsertionSort(list);
    }
}
