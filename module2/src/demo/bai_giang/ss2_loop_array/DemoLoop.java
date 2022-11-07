package ss2_loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class DemoLoop {
    public static void main(String[] args) {
//        System.out.println("Nhập vào 1 số: ");
//        Scanner sc = new Scanner(System.in);
//        int number = Integer.parseInt(sc.nextLine());
//        boolean flag = true;
//        for (int i = 2; i <= Math.sqrt(number) ; i++) {
//            if(number % i == 0){
//                flag = false;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println(number + " là số nguyên tố");
//        }else {
//            System.out.println(number + " không là số nguyên tố");
//        }

        // Dùng vòng lặp tạo mảng có 10 phần tử là số nguyên nhập từ
        // bàn phím
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i <= 9; i++) {
            System.out.println("Nhập phẩn tử thứ: " + (i + 1));
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        int size = numbers.length;
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
