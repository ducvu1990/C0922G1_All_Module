package ss3_aray.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,7,8,9,10};
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập vào số cần thêm");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vị trí cần thêm");
        Scanner scidex = new Scanner(System.in);
        int index = Integer.parseInt(scidex.nextLine());
        int arrLength = array.length - 1;
        if (index > 0 && index < arrLength){
            for (int i = arrLength; i >= index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = number;
            System.out.println(Arrays.toString(array));
        }else {
            System.out.println("không chèn được phần tử vào mảng");
        }
    }
}
