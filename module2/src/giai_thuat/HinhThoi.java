package giai_thuat;

public class HinhThoi {
    public static void main(String[] args) {
        int b = 0;
        for (int i = 1; i <= 9; i++) {
            System.out.println();
            if (i == 6) {
                b = 0;
            }
            for (int j = 1; j <= 10; j++) {
                int a = 10;
                if (i <= 5) {
                    if (j == 5 - b || j == 6 + b) {
                        System.out.print(i);
                    } else {
                        System.out.print("\t");
                    }
                } else if (j == 2 + b || j == 9 - b) {
                    a = a - i;
                    System.out.print(a);
                } else {
                    System.out.print("\t");
                }
            }
            b++;
        }
    }
}