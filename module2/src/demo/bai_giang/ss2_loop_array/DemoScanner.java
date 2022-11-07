package ss2_loop_array;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        System.out.println("Nhập số vào đây:");
        Scanner sc = new Scanner(System.in);
        double number = Double.parseDouble(sc.nextLine());
        System.out.println(number);
    }
}
