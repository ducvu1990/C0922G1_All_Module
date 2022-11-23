package giai_thuat;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soNhap;
        do {
            System.out.println("nhap vao so nho hon hoac bang 20");
            soNhap = Integer.parseInt(sc.nextLine());
        } while (soNhap < 0 || soNhap > 20);


        int fibonacciA = 1;
        int fibonacciB = 1;
        int fibonacciC;
        if (soNhap == 0) {
            System.out.println(fibonacciA);
        } else if (soNhap == 1) {
            System.out.println(fibonacciB);
        } else {
            for (int i = 2; i <= soNhap; i++) {
                fibonacciC = fibonacciA + fibonacciB;
                fibonacciA = fibonacciB;
                fibonacciB = fibonacciC;
                if (i == soNhap) {
                    System.out.println(fibonacciC);
                }
            }
        }

    }
}
