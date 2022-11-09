package ss3_aray.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        System.out.println("Nhập độ rộng của mảng");
        Scanner sc = new Scanner(System.in);
        int arrayLength = Integer.parseInt(sc.nextLine());
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
                System.out.print("Nhập giá trị array[" + i + "]: ");
                array[i] = Integer.parseInt(sc.nextLine());
        }
        int min = array[0];
        for (int i = 0; i < arrayLength; i++) {
                if (min >  array[i]){
                    min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
