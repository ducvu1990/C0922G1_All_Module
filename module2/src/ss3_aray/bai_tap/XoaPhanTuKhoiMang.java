package ss3_aray.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,3,3,7,8,9,10};
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập vào số cần xóa");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int arrlength = array.length;
        for (int i = 0; i < arrlength;) {
            if (number == array[i]){
                for (int j = i; j < arrlength - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[arrlength - 1] = 0;
                continue;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));
    }
}
