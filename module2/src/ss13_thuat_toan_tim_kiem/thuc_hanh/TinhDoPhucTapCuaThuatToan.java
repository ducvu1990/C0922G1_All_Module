package ss13_thuat_toan_tim_kiem.thuc_hanh;

import java.util.Scanner;

public class TinhDoPhucTapCuaThuatToan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi");
        String inputString = scanner.nextLine();
        int[] frequentCar = new int[255];
        int size = inputString.length();
        for (int i = 0; i < size; i++) {
            int ascii = inputString.charAt(i);
            frequentCar[ascii] += 1;
        }
        int max = 0;
        char character = 255;
        for (int i = 0; i < 255; i++) {
            if (frequentCar[i] > max){
                max = frequentCar[i];
                character = (char) i;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
