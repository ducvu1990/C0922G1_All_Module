package ss3_aray.bai_tap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int array1Length = array1.length;
        int[] array2 = {6, 7, 8, 9, 10, 11, 12};
        int array2Length = array2.length;
        int array3Length = array1Length + array2Length;
        int[] array3 = new int[array3Length];
        for (int j = 0; j < array1Length; j++) {
            array3[j] = array1[j];
        }
        for (int j = array1Length; j < array3Length; j++) {
            array3[j] = array2[j - (array1Length)];
        }
        System.out.println(Arrays.toString(array3));
    }
}
